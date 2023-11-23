import java.util.Scanner;
class TestSort1
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] arr = new int[length];
		for(int i=0;i<length;i++)
		{
			arr[i]=scan.nextInt();
		}

		for(int j=1;j<length;j++)
		{
			int key=arr[j];
			int i=j-1;
			while(i>=0 && arr[i]>key)
			{
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
			if(i!=0)
				System.out.print(" ");
		}
	}
}