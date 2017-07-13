package cn.smartshuai.deadlock;

public class DeadThread implements Runnable {
	// 把i定义在成员位置上, 这样可以被多线程共享
	private int i = 0;
	
	public void run() {
		while (true) {
			if (i % 2 == 0) {
				synchronized (LockA.locka) {
					System.out.println("if...A锁");
					synchronized(LockB.lockb){
						System.out.println("if...B锁");
					}
				}
			}else{
				synchronized(LockB.lockb){
					System.out.println("else...B锁");
					synchronized(LockA.locka){
						System.out.println("else...A锁");
					}
				}
			}
			i++;
		}
	}

}