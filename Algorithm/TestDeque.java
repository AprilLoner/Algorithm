import java.io.*;;
class TestDeque
{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] arr1 = line.split(" ");
		int k = Integer.parseInt(arr1[1]);
		String[] arr2= arr1[0].split(",");
		int[] arr = new int[arr2.length];
		for(int i=0;i<arr2.length;i++)
		{
			arr[i] = Integer.valueOf(arr2[i]);
		}
		/*
			Scanner scan = new Scanner(System.in);
			//int n = scan.nextInt();
			int k = 3;
			int[] arr = new int[]{4,3,5,4,3,3,6,7};
			int n = arr.length;
			
			int[] arr = new int[n];
			
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = scan.nextInt();
			}
		 */
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
		for(int m: farr)
		{
			System.out.println(m);
		}
	}
	
}