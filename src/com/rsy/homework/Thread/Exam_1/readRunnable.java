package com.rsy.homework.Thread.Exam_1;

/**
 * 在子线程中读取文件中的文本，实现每一秒钟在控制台打印一个字符
 * @author Nico
 * @CreateDate 2018年8月23日 下午5:54:09
 */
public class readRunnable implements Runnable{
	
	private CreateString createString;
	
	
	public readRunnable(CreateString createString) {
		super();
		this.createString = createString;
	}

	@Override
	public void run() {
		createString.creatString();
	}
}
