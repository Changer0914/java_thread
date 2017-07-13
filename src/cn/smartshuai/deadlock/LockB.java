package cn.smartshuai.deadlock;

public class LockB {

	public static final LockB lockb = new LockB();

	// 构造方法私有, 出了本类就不能new对象了
	private LockB() {

	}
}