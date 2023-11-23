import java.util.ArrayList;
import java.util.Collection;
public class ArrayListDemo
{
	public static void main(String[] args)
	{
		/*
		Collection c = new ArrayList();
		c.add("1");
		c.add("2");
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		c.clear();
		c.contains("1");//是否包含
		*/
		ArrayList<String> a1 = new ArrayList<String>();
		//<>代表泛型：通用的类型,指定集合存储数据的类型
		a1.add("1");
		a1.add("11");
		a1.add("111");
		System.out.println(a1.contains("12"));
		System.out.println(a1.get(0));
		System.out.println(a1);
		System.out.println(a1.indexOf("111"));
		System.out.println(a1.size());
	
	}
}