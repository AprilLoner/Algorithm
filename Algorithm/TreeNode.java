/*
	树的初始化，数据录入要求
	提供数据按照满二叉树的形式提供，空节点用0表示，树中节点值均大于0
	例：{1,2,3,4,5,6,7};
	二叉树链式存储
*/
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TreeNode
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
	//树的初始化
	public static TreeNode initTree (int[] nums)
	{
		//根据整型数组创建所有树节点 也给val赋值
		TreeNode[] nodes = new TreeNode[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
				nodes[i] =  new TreeNode(nums[i]);
			else
				nodes[i]=null;
		}
		
		//指定节点之间的关系
        int leftIndex = 1;
        int rightIndex = 2;
        //设置leftindex与rightindex：1.为了得到数组对应元素，2.确保没有超出数组nums/nodes的范围，
        //但是这就出现了个问题：在空节点的时候，这两个参数依然保持增长，就会有后面的数据录入不进去，数组越界的问题(测试用例：1,0,2,3)
        //解决：把头结点作单独处理，初始值定为1，2,(后置是为了下次元素的添加);  设置当不空的时候才增长，空的时候不增长。
        for(int i=0;i<nums.length;i++)
        {

            if(nodes[i]!=null) {

                if (leftIndex < nums.length) {
                    nodes[i].left = nodes[leftIndex];
                }
                if (rightIndex < nums.length) {
                    nodes[i].right = nodes[rightIndex];
                }
                leftIndex = 2*(i+1)+1;
                rightIndex = 2*(i+1)+2;
            }
        }
		return nodes[0];
	}
	//先序遍历
	public static void PreOrder(TreeNode root)
	{
		//递归条件:1.规律 2.出口

		if(root==null)
		{
			return;
		}
		System.out.print(root.val+" ");
		PreOrder(root.left);
		PreOrder(root.right);
	}
	//中序遍历
	public static void InOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		//递归条件:1.规律 2.出口
		InOrder(root.left);
		System.out.print(root.val+" ");
		InOrder(root.right);
	}
	//后序遍历
	public static void PostOrder(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		//递归条件:1.规律 2.出口
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.val+" ");
	}
	//层次遍历:队列，结点先进队，出队，输出结果，当前结果若存在左（右）结点，则左（右）孩子结点进队
	private static void LevelOrder(TreeNode root)
	{
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while(!q.isEmpty())
		{
			TreeNode node = q.poll();//当前节点:出队
			System.out.print(node.val+" ");
			if(node.left!=null)
			{
				q.offer(node.left);
			}
			if(node.right!=null)
			{
				q.offer(node.right);
			}
		}

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
		//先序遍历
		System.out.println("先序遍历：");
		PreOrder(root);
		System.out.println();
		//中序遍历
		System.out.println("中序遍历：");
		InOrder(root);
		System.out.println();
		//后序遍历
		System.out.println("后序遍历：");
		PostOrder(root);
		System.out.println();
		//层次遍历
		System.out.println("层次遍历：");
		LevelOrder(root);
		System.out.println();
		//判断是否是完全二叉树
		boolean b = is_CompleteTree(root);
		if(b)
		{
			System.out.println("该树是完全二叉树");
		}
		else
		{
			System.out.println("该树不是完全二叉树");
		}
	}
}
/*
private static boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        //标志位
        boolean flag = false; //目前还没有出现以下情况，一个节点没有右孩子，或者之前的结点都有右孩子
        //根节点进队
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll(); //出队 node为当前节点
            //条件1
            if(node.left == null && node.right != null){
                return false;
            }
            //条件2
            if(flag && (node.left!=null || node.right!=null)) { // flag(flag==true)  flag 是上一轮的结点
                return false;
            }
            //其他节点（当前节点的孩子结点）进队 修改标志位 要有修改标志位的语句
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null){
                q.offer(node.right);
            }else{ //如果当前节点没有右孩子
                flag = true; //必须要有改变标志位的语句，否则标志位没有用处
            }
        }
        return true;
    }
}
*/