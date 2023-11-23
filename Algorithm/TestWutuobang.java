import java.util.Scanner;
class TestWutuobang
{
	/*
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int grow = scan.nextInt();
		int high = 1;
		for (int i =grow;i>0;i--)
		{
			if(i%2==1)
			{
				high=high*2;
			}
			else
			{
				high++;
			}
		}
		System.out.println(high);
		
	}*/

     public static void main(String [] args)
     {
         int high=1;
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         for(int i=1;i<=n;i++)
         {
             if(i%2==0)
                 high++;
             else
                 high=high*2;
         }
         System.out.println(high);
}
}