import java.util.*;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class MaxSlidingWindow
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		String line = br.readLine();
		String[] arr1 = line.split(" ");
		String[]arr = arr1[0].split(",");
		int[] nums = new int[arr.length];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=Integer.valueOf(arr[i]);
		}
		int k = Integer.valueOf(arr1[1]);
		//int[] nums = {1,3,-1,-3,5,3,6,7};
		//int k=3;
		int[] ans = MaxSlidingWindow(nums,k);
		System.out.println(Arrays.toString(ans));
	}
	/*
	*队列中存储的是元素的索引
	*/

	public static int[] MaxSlidingWindow(int[] nums,int k)
	{
		//获取数组大小
		int n = nums.length;
		//声明双端队列
		Deque<Integer> dq = new LinkedList<>();
		//声明结果数组‘
		int[] ans = new int[n-k+1];
		//结果数组使用的索引
		int m = 0; 
		//遍历数组
		for(int i=0;i<n;i++)
		{
			//队列非空 且 当前元素大于队尾元素，则队尾出队 
			while(!dq.isEmpty()&&nums[i]>nums[dq.peekLast()])
			{
				dq.pollLast();
			}
			//队列为空，则元素索引入队
			dq.offerLast(i);
			//检查窗口是否过期
			if(i-dq.peek()>=k)
			{
				dq.poll();
			}
			if(i>=k-1)
			{
				ans[m++] = nums[dq.peek()];
			}
		}
		return ans;
	}
	public static int[] MaxSlidingWindow1(int []arr,int k)
	{
		int n = arr.length;
		int[] farr = new int[n-k+1];
		int i=0,j=k-1;
		while(i<n-k+1)
		{
			int max = arr[i];
			for(int t = i;t<=j;t++)
			{
				if(max<arr[t])
				{
					max=arr[t];
				}
			}
			farr[i] = max;
			i++;
			j++;
		}
		return farr;
	}
	public static int[] MaxSlidingWindow2(int[] nums,int k)
	{
		//获取数组大小
		int n = nums.length;
		//窗口数量
		int wins = n-k+1;
		//声明结果数组
		int[] ans = new int[wins];
		//依次获取每个窗口对应的数组，并求最大值，存放到结果数组
		for(int i=0;i<wins;i++)
		{
			int[] arr = new int[k];
			System.arraycopy(nums,i,arr,0,k);//第一个参数是第一个要被复制的数组，第二个
			Arrays.sort(arr);
			ans[i] = arr[arr.length-1];
		}
		return ans;
	}
}