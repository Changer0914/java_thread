package cn.smartshuai.deadlock;

/**
 * 模拟死锁
 * 		只要程序停下来, 打印出来的最后两行是  if...A 和  else...B 
 * 		就模拟成功了
 * @author DS
 *
 */
public class TestDeadThread {
	public static void main(String[] args) {
		
		// 创建Runnable接口的实现类对象
		DeadThread dt = new DeadThread();
		
		// 创建两个线程来模拟死锁, 共享Runnable接口的实现类对象dt
		Thread t0 = new Thread(dt);
		Thread t1 = new Thread(dt);
		
		// 启动线程
		t0.start();
		t1.start();
	}
}
