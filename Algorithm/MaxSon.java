class MaxSon
{
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int sum = maxSubArray(nums);
		System.out.println(sum);
	}

	private static int maxSubArray(int[] nums)
	{
		int n=nums.length;
		if(n==1)
			return nums[0];
		int maxSum = nums[0];
		int curSum = 0;
		for(int i=0;i<n;i++)
		{
			curSum=curSum+nums[i];
			if(curSum<nums[i])
			{
				curSum=nums[i];
			}
			if(maxSum<curSum)
			{
				maxSum = curSum;
			}
		}
		return maxSum;
	} 

}
