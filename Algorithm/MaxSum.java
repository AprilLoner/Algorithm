class MaxSum
{
	public static void main(String[] args) {
		int[] a={-2,11,-4,13,-5,-2};

		int ret = MaxSum3(a);
		System.out.println(ret);
	}

	public static int MaxSum1(int[] a)
	{
		int n = a.length;
		int MaxSum = 0;//存放最终结果的
		int curSum;//当前序列的和

		for(int i=0;i<n;i++)
		{
			for(int j = i;j<n;j++)
			{
				//计算每个序列的和 a[i...j] ,关键是知道序列的起点i=2和终点j=4,curSum = a[2]+a[3]+a[4]
				curSum=0;
				for(int k = i;k<= j;k++)
				{
					curSum += a[k]; 
				}
				if(curSum>MaxSum)
				{
					MaxSum = curSum;
				}
			}
		}
		return MaxSum;
	}

	public static int MaxSum2(int a[])
	{
		int n = a.length;
		//新建数组，用于存放sum(i)的和，前i个元素的和，数组长度n+1
		int sum[] = new int[n+1];
		sum[0] = 0;
		//求sum(i)
		for(int i = 1;i<=n;i++)
		{
			sum[i] = sum[i-1]+a[i-1];
		}
		int curSum;
		int MaxSum=0;
		//开始计算所有的序列
		for(int i = 0;i<n;i++)
		{
			for(int j = i+1;j<=n;j++)
			{
				curSum = sum[j]-sum[i];
				if(curSum>MaxSum)
				{
					MaxSum = curSum;
				}
			}
		}
		return MaxSum;
	}

	public static int MaxSum3(int a[])
	{
		int n = a.length;
		int MaxSum = 0;//存放最终结果的
		int curSum;//当前序列的和

		for(int i=0;i<n;i++)
		{
			curSum = 0;
			for(int j=i;j<n;j++)
			{
				curSum += a[j];
				if(curSum>MaxSum)
				{
					MaxSum = curSum;
				}

			}
		}
		return MaxSum;
	}
}