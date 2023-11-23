import java.util.Scanner;
class TestReverse
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String line = scan.next();
		char[] arr = line.toCharArray();
		for(int i = arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}

	}
}