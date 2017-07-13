package cn.smartshuai.code;

/**
 * 14..假设抽奖箱中有100个号码（依次从1 到100），开启两个线程，
 * 共随机抽选出10个号码，并在控制台上打印出两个线程分别抽选了哪些号码
 * 提示：（两个线程不能抽取同一个号码，已经抽取的号码不能再次抽取； 不限定两
 *	个线程抽取的个数一样，总共抽选10 个即可，线程名自定义）
 *
 *		分析 : 两个线程
 *			随机抽10个号   那么这个 10  就是共享的
 *
 *		测试代码都是这种写法。
 *		先不要加synchronized(this){}
 *			while(true){}
 * @author DS
 *
 */
public class ChooseNumTest {
	public static void main(String[] args) {
		
		ChooseNum r = new ChooseNum();
		
		Thread t1 = new Thread(r, "小baby");
		Thread t0 = new Thread(r, "小明");
		 
		t0.start(); // 开启线程
		t1.start();
		
	}
}
