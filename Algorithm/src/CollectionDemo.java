/*
*集合：Collection，接口，interface，存储多值（对象）
	功能：增删改查
	List：集合元素是有序（索引）的，元素可以重复，ArrayList
	set：集合元素是无序（索引）的，元素不可以重复，天然去重的能力，HashSet
		父接口：Iterable：可迭代的接口，实现该接口则具备迭代能力
			方法：interator()可以返回一个迭代器对象——Iterator
		Iterator：接口，迭代器接口
			功能：hasNext()方法用于判断是否还有可迭代的元素，next()方法用于返回下一个可迭代的元素
*/
import java.util.Collection;
import java.util.*;
public class CollectionDemo{
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println(c);
		c.remove(2);
		System.out.println(c);
		System.out.println(c.contains(2));
		//迭代
		Iterator<Integer> it = c.iterator();
		while(it.hasNext())
		{
			Integer x = it.next();
			System.out.print(x+" ");
		}

	}
}
