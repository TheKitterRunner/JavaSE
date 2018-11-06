package com.rsy.thread.synchronize.single;

/**
 *  单例模式
 *    饱汉模式（懒汉模式）
 *    高并发下围绕内存写的健壮性高的单例模式
 * @author Nico
 * @createDate 2018年8月1日 下午2:10:41
 */
public class Single {

	private static Single instance;
	
	private Single(){
	}
	
//	public synchronized static Single getInstance(){
//		if (Single.instance == null) {
//			Single.instance = new Single();
//		}
//		return Single.instance;
//	}
	
//	public static Single getInstance(){
//		if (Single.instance == null) {
//			synchronized ("A") {
//				if (Single.instance == null) {
//					Single.instance = new Single();	
//				}
//			}
//		}
//		return Single.instance;
//	}
	public static Single getInstance(){
		if(Single.instance == null) {
			Single.initInstance();
		}
		return Single.instance;
	}
	
	private synchronized static void initInstance(){
		if(Single.instance == null) {
			Single.instance = new Single();	
		}
	}
}
