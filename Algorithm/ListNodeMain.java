import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ListNodeMain
{
	public static void main(String[] args) throws IOException {
		
		//int[] a = {1,2,3,4};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[]arr = line.split(",");
		int[] nums = new int[arr.length];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=Integer.valueOf(arr[i]);
		}
		ListNode head = initList(nums);
		ListNode h = reverseList(head);
		showList(h);
	}			
	//根据给定的整形数组，创建一个不带头结点的链表
	public static ListNode initList(int[] a)
	{
		ListNode head = new ListNode(a[0]);
		ListNode h = head;

		for(int i = 1;i < a.length;i++)
		{
			ListNode p = new ListNode(a[i]);
			h.next = p;
			h = p;
		}
		return head;
	}
	//遍历给定的链表，输出每个结点的值
	public static void showList(ListNode head)
	{
		ListNode p = head;
		while(p!=null)
		{
			System.out.print(p.val+" ");
			p=p.next;
		}
	}
	public static int add(int i,int j)//传值，相当于复制了一份
	{
		i++;
		return i+j;
	}
	public static int add(int[] a)//传地址，相当于把首地址复制了一份，不是把整个复制了一遍
	{
		a[0]++;
		return a[0]+a[1];
	}
	//将指定链表进行反转,使用一个头结点
	public static ListNode reverseList(ListNode head)
	{
		ListNode h = new ListNode();
		ListNode p = head;

		while(p!=null)
		{
			ListNode q = p.next;
			p.next = h.next;
			h.next = p;
			p=q;
		}
		return h.next;
	}
}