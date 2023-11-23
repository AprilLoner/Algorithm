import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
class Test
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList list = new ArrayList();
        for(int i=0;i<n;i++)
        {
            list.add(scan.nextInt());
        }
        list.sort(Comparator.reverseOrder());
        Object[] arr1 = list.toArray();
        for (int i=0;i<n ;i++ ) {

            System.out.print(arr1[i]);
            if(i!=n-1)
            {
                System.out.print(" ");
            }
        }

    }
}