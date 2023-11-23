import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
class MainTree
{
    public static void main(String[] args) throws IOException
	{
		//int nums[] = {1,2,3,4,5,6,7};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[]arr = line.split(",");
		int[] nums = new int[arr.length];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=Integer.valueOf(arr[i]);
		}
		//初始化一个二叉树
		TreeNode root = initTree(nums);
      boolean b = is_CompleteTree(root);
      System.out.println(b);
    }
    //树的初始化
	public static TreeNode initTree (int[] nums)
	{
		//根据整型数组创建所有树节点
		TreeNode[] nodes = new TreeNode[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
				nodes[i] =  new TreeNode(nums[i]);
			else
				nodes[i]=null;
		}
		//指定节点之间的关系
		for(int i=0;i<nums.length;i++)
		{
			int leftIndex = 2*i+1;
			int rightIndex = 2*i+2;
			if((nodes[i]!=null) && (leftIndex < nodes.length))
			{
				nodes[i].left = nodes[leftIndex];
			}
			if((nodes[i]!=null) && (rightIndex < nodes.length))
			{
				nodes[i].right = nodes[rightIndex];
			}
		}
		return nodes[0];
	}

   private static boolean is_CompleteTree(TreeNode root)
	{
		/*
			判定一个树是否为完全二叉树
			分层遍历
			当前节点，Node
			条件1：如果一个节点有右节点，但是没有左节点，肯定不是完全二叉树
			node.left==null&&node.right!=null
			条件2：如果已经出现过一个节点没有右节点，接着又出现了一个节点那肯定也不是
			node.right = null(由boolean值控制)，node.left!=null || node.right !=null
		*/
		Queue<TreeNode> q = new LinkedList<>();
		//标志位
		boolean flag = false;//表示已经出现过一个节点有右节点
		q.offer(root);
		while(!q.isEmpty())
		{
			TreeNode node = q.poll();//node 当前节点
			//条件1
			if(node.left==null && node.right !=null)
			{
				return false;
			}
			//条件2
			if(flag &&(node.left!=null || node.right!=null))//表示出现了一个节点没有右节点
			{
				return false;
			}
			//其他节点（当前节点的孩子结点）进队，修改标志位
			if(node.left!=null)
			{
				q.offer(node.left);
			}
			if(node.right!=null)
			{
				q.offer(node.right);	
			}
			else
			{
				flag=true;
			}
		}	
		return true;
	}
}
class TreeNode
{
   int val;
	TreeNode left;
	TreeNode right;

	public TreeNode()
	{
		super();
	}
	public TreeNode(int val)
	{
		super();
		this.val=val;
	}
	public TreeNode(int val,TreeNode left,TreeNode right)
	{
		super();
		this.val=val;
		this.left = left;
		this.right = right;
	}
	public TreeNode(TreeNode left,TreeNode right)
	{
		super();
		this.left = left;
		this.right = right;
	}
}