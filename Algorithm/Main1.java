import java.util.Scanner;
class Main1
{
	public static void main(String[] args)
	{	
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					int t=arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
			if(i==n-1)
			System.out.print(arr[i]);
			else
			{
				System.out.print(arr[i]);
				System.out.print(" ");
			}

		}
		/*for (int i=0;i<n;i++) {
			if(i==n-1)
			System.out.print(arr[i]);
			else
			{
				System.out.print(arr[i]);
				System.out.print(" ");
			}

		}*/


	}
}