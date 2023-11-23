import java.util.Scanner;
class Main2
{
	public static void main(String[] args) {
		int tall=1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=1)
			{
				tall++;
			}
			else
			{
				tall=tall*2;
			}
		}
		System.out.println(tall);
	}
}