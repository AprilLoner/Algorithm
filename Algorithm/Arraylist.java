import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Date;
class Arraylist
{
	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		//一、关于数组
		
		//初始化
		int[] arr = {1,2,3,4};
		
		//录入5数据到数组中
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//数组的打印
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int x:arr)
		{
			System.out.println(x);
		}
		//二、数据工具Arrays
		
		Arrays.sort(arr);//默认是自然排序（升序）
		
		//数组的查找，存在的话返回的是索引，不存在返回负数
		Arrays.binarySearch(arr,22);
		System.out.println(Arrays.binarySearch(arr,22));
		System.out.println(Arrays.binarySearch(arr,44));
		
		//使用Arrays工具类输出
		System.out.println(Arrays.toString(arr));

	}
	public static void main(String[] args) {

		Integer[] a = {1,2,3,4};
		//通过Arrays数组工具类进行转换
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
		//关于集合,一般指定泛型<T>,指定泛型必须是引用类型，不可以是基本数据类型
		//ArrayList<Integer> list = new ArrayList<Integer>();
		//添加
		list.add(1);
		list.add(10);
		list.add(100);

		System.out.println(list);
		//获取，根据索引获取
		Integer num = list.get(1);

		//修改
		list.set(1,20);

		//删除
		list.remove(1);
		System.out.println(list);

		//大小，是否为空
		System.out.println(list.size());
		System.out.println(list.isEmpty());

		//排序
		//1.使用集合对象进行排序,Comparator:比较接口，用于指定排序方式，naturalOrder为自然排序
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);

		//2.使用集合工具
		Collections.sort(list);//升序
		Collections.sort(list,Collections.reverseOrder());//降序

		//集合转为数组
		Object[] arr1 = list.toArray();
	}
}