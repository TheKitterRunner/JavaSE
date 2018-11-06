package com.rsy.practice.IOC;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.rsy.IOC.annotation.AutoWired;
import com.rsy.practice.IOC.Annotation.Componet;

/**
 *  程序初始化的类（就是容器装填类对象的方法）
 * @author Nico
 * @CreateDate 2018年8月22日 下午10:57:20
 */
public class Application {
		// 获取要运行的文件的路径的前缀
	/**
	 * 文件目录前缀
	 */
	public static final String DIR_SUFFIX = "E:\\Data\\JavaSETest\\bin\\";
	/**
	 * 		beans专门用来在系统启动的时候，找到所有有注解：Componet的Java类，并且实例化
	 *  以这个注解的value属性作为key值，实例化对象作为value值存储在Map中
	 */
	private Map<String , Object> beans = new HashMap<String ,Object>();
	
	
	/**
	 * 扫描包下所有有注解Componet的类，实例化这些类，并且放到beans中
	 * @throws Exception 
	 */
	public void initBeans() throws Exception{
		//获取当前类所在的盘符目录
		String path = this.getClassPath();
		//清除前缀
//		path = path.replace("E:/Data/JavaSETest/bin/", "");
//		System.out.println(path);
		//将目录层级换成.
//		path = path.replace("/", ".");
//		System.out.println(path);
		//找到这个目录下所有的Java文件
		List<Class<Object>> classes = this.getClasses(path);  //专门用来存储包路径下所有的class类对象
		//循环迭代所有的class,初始化实例加载到beans	
		for(Class<Object> clazz : classes){
			//判断class是否拥有注解信息：Componet
			Componet componet = clazz.getAnnotation(Componet.class);
			//如果拥有注解信息，，获取Componet的value值
			if(componet != null){
				//创建class的实例，并且将Componet 的value作为key值存储到beans 
				Object o = clazz.newInstance();
				//存储到beans中
				beans.put(componet.value(), o);  //  beans.put() 用来将实例化的对象存储到 beans Map 中
			}
		}
		//循环迭代所有的class
		for(Class<Object> clazz : classes){
			//获取class的所有成员变量
			Field[] fields = clazz.getDeclaredFields();
			for(Field field:fields){
				//获取这个filed的注解信息，判断是否拥有AutoWired注解信息
				AutoWired aw = field.getAnnotation(AutoWired.class);
//				System.out.println(field.getName() + " " +aw);
				//如果拥有AutoWired注解信息，那么就获取这个注解的value
				if( aw != null) {
//					System.out.println("autowired-->" + field.getName());
					String key = aw.value();
					//再去beans中查找value对应的instance
					Object instance = beans.get(key);
					//改变这个filed 的访问权限
					field.setAccessible(true);
					//找到当前class在beans中的对象
					Object classInstance = this.findBeans(clazz);
					//通过filed.set赋值
					field.set(classInstance, instance);
				}
			}		
		}
	}
	
	
	/**
	 * 找到指定目录下所有的class类对象
	 * @param path
	 * @return
	 * @throws ClassNotFoundException 
	 */
	@SuppressWarnings("unchecked")
	private List<Class<Object>> getClasses(String path) throws Exception{
		//用于接收所有的class类对象
		List<Class<Object>> classes = new ArrayList<Class<Object>>();
		if (path.contains("Annotation") || path.contains("Application")) {
			return classes;
		}
		//通过path构建一个File对象
		File file = new File(path);
		//判断文件时候存在，如果不存在，返回classes (没有任何元素的classes)
		if (!file.exists()) {
			return classes;
		}
		//判断file是否是一个文件，如果是，需要找出它的class类对象，并且添加到classes中，再返回classes
		if (file.isFile()) {
			//获取文件的路径
			String filePath = file.getAbsolutePath();
			//替换前缀
//			System.out.println(path);
			filePath =filePath.replace(DIR_SUFFIX, "");
			//替换目录/
			filePath =filePath.replace("\\", ".");
			filePath =filePath.replace(".class", "");
			//获取到类加载的名称
			String className = filePath;
			System.out.println(className);
//			System.out.println(className);
			//通过class.forname获取class类对象
			Class<Object> clazz = (Class<Object>) Class.forName(className);
			System.out.println(clazz);
			//将clazz添加到classes中
			classes.add(clazz);
			return classes;
		}
		//如果file是一个文件夹，需要递归寻找下一层目录的类对象
		File[] childFiles = file.listFiles();
		for (File childFile : childFiles){
			List<Class<Object>> childClasses = this.getClasses(childFile.getAbsolutePath());
			//将下一层目录所有的类对象添加到classes中
			classes.addAll(childClasses);
		}
		//返回classes
		return classes;
	}
	
	private Object findBeans (Class<Object> clazz) {
		//获取当前class的Componet注解
		Componet cp = clazz.getAnnotation(Componet.class);
		//如果注解不存在，就返回null
		if( cp == null){
			return null;
		}
		//如果有注解就获取到value值
		String key = cp.value();
		//找到beans中对应的instance并返回
		return beans.get(key);
	}
	/**
	 * 通过key去beans中寻找实例化的对象
	 * @param key
	 * @return
	 */
	public Object getBeans(String key){
		return beans.get(key);
	}
	/** 
	* 得到类的路径，例如e:\workspace\javagui\bin\com\
	* @return 
	* @throws java.lang.exception 
	*/ 
	public String getClassPath() throws Exception { 
		try { 
			String strClassName = getClass().getName(); 
			String strPackageName = ""; 
			if (getClass().getPackage() != null) { 
				strPackageName = getClass().getPackage().getName(); 
			} 
			String strClassFileName = ""; 
			if (!"".equals(strPackageName)) { 
				strClassFileName = strClassName.substring(strPackageName.length() + 1, 
				  strClassName.length()); 
			} else { 
				strClassFileName = strClassName; 
			} 
			URL url = null; 
			url = getClass().getResource(strClassFileName + ".class"); 
			String strUrl = url.toString(); 
			strUrl = strUrl.substring(strUrl.indexOf('/') + 1, strUrl 
				.lastIndexOf('/')); 
			//返回当前类的路径，并且处理路径中的空格，因为在路径中出现的空格如果不处理的话， 
			//在访问时就会从空格处断开，那么也就取不到完整的信息了，这个问题在web开发中尤其要注意 
			return strUrl.replace("%20", " "); 
		} catch (Exception ex) { 
			ex.printStackTrace(); 
			throw ex; 
		} 
	}
	
}
