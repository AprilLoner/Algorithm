
class StringDemo
{
	public static void main(String[] args) {
		
		String s1 = "huigugu";
		String s2 = "uiwfuwgefwf";

		String hi = "hello";
		String name = "Xiaoming";
		//charAt();
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		//compareTo，对于字符串来说：==与equals规则相同，比较的都是内容，而非地址hashcode
		System.out.println(s1.compareTo(s2));//比较字典顺序（大写字母65-91比小写字母小97-123）
		System.out.println(s1==s2);//严格判等，hashcode（是否相等，不比大小）
		System.out.println(s1.equals(s2));//比较规则可以自定义
		System.out.println(s1.compareToIgnoreCase(s2));//比较忽视大小写
		//连接字符串
		System.out.println(hi.concat(name));
		System.out.println(hi+name);
		//看字符串是否以指定的后/前缀结束/开始。返回boolean值
		System.out.println(name.endsWith("ming"));
		System.out.println(name.startsWith("x"));

		//indexOf 是否包含指定信息-1，存在返回大于等于0；-1为不存在
		System.out.println(s1.indexOf("j"));
		//replace 替换字符串
		System.out.println(hi.replaceFirst("l","L"));
		System.out.println(hi.replaceAll("l","L"));
		
		String names = "tom,mike,rose";
		String arr[] = names.split(",");//shift+Alt+L

		String names2 = "tom,mike,rose,";
		String subs = names2.substring(0,names2.length()-1);//前闭后开[）；

		System.out.println(subs.toLowerCase());
		System.out.println(subs.toUpperCase());

		String name3 = "   tom    ";
		System.out.println(name3.trim());//去掉多余空格
	}
}