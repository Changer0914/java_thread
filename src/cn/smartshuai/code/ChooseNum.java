package cn.smartshuai.code;

import java.util.ArrayList;
import java.util.Random;

public class ChooseNum implements Runnable {

	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public ChooseNum(){
		for(int i = 1; i <= 100; i++){
			list.add(i);
		}
	}

	public void run(){
		Random r = new Random();
		while(true){
			synchronized(this){
				// 循环刚进来 就判断集合的大小, 如果把判断放在最后, 下面的代码还会再执行
				if(list.size() <= 90){
					break;
				}
				int randomNum = r.nextInt(list.size()); // 生成随机索引0-99  0-98  0-97 ...
				System.out.println(Thread.currentThread().getName()
						+ "抽到的号码是 " + list.remove(randomNum));
			}
		}
	}
}