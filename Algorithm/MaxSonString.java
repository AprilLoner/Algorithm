import java.io.*;
class MaxSonString
{
	/*
		最大重复子串
		原始串和重复串均由键盘输入，二者在一行，中间以空格进行分割
		ababc ab..
	*/

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] arr = line.split(" ");

		int k = MaxSonString(arr[0],arr[1]);
		System.out.println(k);
	}
	
	public static int MaxSonString(String sequence,String word)
	{
		//原始串长度
		int n = sequence.length();
		//子串长度
		int m = word.length();
		int k = 1;
		String subs = word;

		while(m*k <= n)
		{
			if(tryString(subs,sequence)!=-1)
			{
				k++;
				subs= subs+word;
				System.out.println(subs+" "+k);

			}else
			{

				break;
			}
		}

		return k-1;
	}
	public static int tryString(String subs,String im)//待解决，等学了C的串结构就好了。
	{
		char[]  chararray = im.toCharArray();
		char[]  small = subs.toCharArray();
		int n = chararray.length;
		int m = small.length;
		int k = -1; 
		//int c = 0;
		for(int i = 0;i<n;i++)
		{
			
			for(int j = 0;j<m;j++)
			{
				if(chararray[i]==small[j])
				{
					i++;
					j++;
					if(j+1==m)
					{
						k=1;
						i=0;
						break;
						//return k;
					}
				}
				else
				{
					i++;
					j=0;
				}
			}

		}
		return k;
	}
}
