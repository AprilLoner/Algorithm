import java.io.*;
import java.util.Scanner;
class TestBestWord
{
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line=br.readLine();
		//String[] arr=line.split(" ");
		Scanner scan = new Scanner(System.in);
		String line1 = scan.next();
		String line2 = scan.next();
		char[] sequence = line1.toCharArray();
		char[] word = line2.toCharArray();

		int i=0,j=0,count=0,k=0,maxcount=0;
		int g=word.length-1;
		while(i!=sequence.length)
		{
			if(sequence[i]==word[j])
			{
				i++;
 				j++;
				if(j==word.length)
				{
					j=0;
					count++;
					if(maxcount>=1&&word.length>1)
					{

						k=i-g;
					}
					else
						k=i;
					if(count>maxcount)
					{
						maxcount=count;
					}
			    }
			}
			else
			{			
				i=k;
				k++;
				j=0;
				count=0;
			}	
		}
		
		System.out.println(maxcount);
	}

}