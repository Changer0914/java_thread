package cn.smartshuai.deadlock;

public class LockA {

	// 加static是为了可以直接类名调用
	// 加final是为了不让变量改变
	// 最终目的是不让外界创建对象, 不让本类修改变量locka
	public static final LockA locka = new LockA();

	// 构造方法私有, 出了本类就不能new对象了
	private LockA() {

	}
}