import java.util.Scanner;
class Solution {
	public int maxRepeating(String sequence, String word) {

	 	Scanner scan = new Scanner(System.in);
    	char[] sequence1 = sequence.toCharArray();
		char[] word1 = word.toCharArray();

		int i=0,j=0,count=0,k=0;
		while(i!=sequence1.length)
		{
			if(sequence1[i]==word1[j])
			{
				i++;
 				j++;
				if(j==word1.length)
				{
					j=0;
					count++;
					k=i;
			    }
			}
			else
			{
				i=k+1;
				k++;
				j=0;
			}	
		}
		return count;
	}
}