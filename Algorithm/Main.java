import java.util.Scanner;
class Arraylist
{
		int index=0;
		int max=0;int min=0; 
		int n;
		int[] arr;
		Scanner scan = new Scanner(System.in);
		Arraylist(int n,int[] arr)
		{
			this.n = n;
			this.arr = arr;
		}
		public int Min()
		{
			min=arr[0];
			for(int i=0;i<n;i++)
			{
				if(min>arr[i])
				{
					min=arr[i];
					index=i;
				}
			}
			return index;
		}
		public int Max()
		{
			max = arr[0];
			for(int i=0;i<n;i++)
			{
				if(max<arr[i])
				{
					max=arr[i];
					index=i;
				}
			}
			return index;
		}
		public void Swap(int a,int b)
		{
			int t = arr[a];
			arr[a] = arr[b];
			arr[b] = t;
		}
		public void Show()
		{
			for(int i=0;i<n;i++)
			{
				if(i!=n-1)
					System.out.print(arr[i]+" ");
				else
					System.out.println(arr[i]);
			}
		}
}
class Main//在类中录入
{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
        Arraylist a = new Arraylist(n,arr);	
        int index_min;int index_max;
        index_min = a.Min();
 		a.Swap(0,index_min);
		index_max = a.Max();
		a.Swap(n-1,index_max);
		a.Show();
	}

}