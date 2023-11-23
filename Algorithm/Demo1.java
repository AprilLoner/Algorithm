import java.util.Arrays;
class Demo1
//Array默认自然排序
{
	public static void main(String[] args)
	{
		int[] arr = {1,88,6,9};
		for(int x:arr)
		{
			System.out.print(x);
			System.out.println(",");
		}
		System.out.println("----------------------");
		Arrays.sort(arr);
		for(int x:arr)
		{
			System.out.print(x);
			System.out.println(",");
		}

		int index = Arrays.binarySearch(arr,99);
		System.out.println(index);

		//关于排序
		//存单值，一个变量
		//存多个值，数组，集合(ArrayList,LinkedList,Set)
		

	}
}