import java.util.Queue;

public class QueueDemo{
	public static void main(String[] args) {
		//队列是也是一种接口
		//队列也是一种集合，集合需要指定数据类型——泛型
		//JAVA中可以继承一个类，实现多个接口，接口不能看作一个对象
		//(B为C父类，A为C接口)
		/*
			B bb = new C();
			A aa = new C();
		*/
		Queue<Integer> q = new LinkedList<>();//后new它的实现类	
	}
}