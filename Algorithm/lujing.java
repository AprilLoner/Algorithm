import java.math.BigInteger;
class lujing
{
	public static void main(String[] args) {
		System.out.println(lujing(3,3));
	//long:(1-11) int:(1-7)
	}
	public static BigInteger lujing(int m,int n)
	{
		BigInteger t=jiecheng(m-1);
		BigInteger h=jiecheng(n-1);
		BigInteger j = jiecheng(m+n-2);
		//BigInteger b=(j/(t*h));
		BigInteger b = (j.divide(t.multiply(h)));
		return b;
	}
	public static BigInteger jiecheng(int j)
	{
		BigInteger x = BigInteger.valueOf(j);
		BigInteger sum = new BigInteger("1");
		BigInteger i = new BigInteger("1");
		for( ; !i.equals(x); i.add(new BigInteger("1"))) {
        	//sum *= i;//sum=sum*i;
        	sum = sum.multiply(i);
		}
		return sum;
	}
}