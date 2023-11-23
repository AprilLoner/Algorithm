import java.io.BufferedReader;  //导入包
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Lunch
{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        //分割两部分内容
        String[] arr = line.split(" ");

        //对每个部分再次进行分割
        String[] stuStrArr = arr[0].split(",");//代表学生信息数组
        String[] sandStrArr = arr[1].split(",");//代表三明治信息数组

        //字符串类型数组转换为整形数组
        int[] students = new int[stuStrArr.length];
        int[] sandwiches = new int[stuStrArr.length];
        for(int i = 0;i<stuStrArr.length;i++){
            students[i] = Integer.parseInt(stuStrArr[i]);
            sandwiches[i] = Integer.valueOf(sandStrArr[i]);
        }
        //调用方法
        System.out.println(countStudents(students,sandwiches));
    }


    public static int countStudents(int[] students,int[] sandwiches){
        //学生信息要存放在队列中
        Queue<Integer> qu = new LinkedList<>();
        //三明治信息要放在栈中
        Stack<Integer> st = new Stack<>();

        //学生信息入队 数组里第一个元素就是队列里的第一个元素 三明治堆栈应该反着来
        for(int x:students){
            qu.offer(x);
        }
        //三明治入栈
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }

        //问题规模 人数 三明治数量
        int n = students.length;
        //结束条件，失败计数器  i=0--->失败
        int i = n;
		/*如果队列最前面的学生喜欢栈顶的三明治，那么会拿走它并离开队列，
		否则这名学生会放弃这个三明治并回到队列的尾部(出队，去队尾在进队)。
		这个过程会一直持续到队列里所有学生都不喜欢栈顶的三明治为止。*/
        while(i>0){
            if(qu.peek() == st.peek()){   //学生拿到了喜欢的三明治
                //三明治出栈 学生出队
                st.pop(); //栈顶元素出栈
                qu.poll(); //队首元素出队
                n--;   //问题规模更新
                i = n; //失败计数器更新

            }else{ //学生没有拿到喜欢的三明治
                int tmp = qu.poll();  //队列元素出队
                qu.offer(tmp); //队列入队
                i--;
            }
        }
        return st.size();
    }

                
	public static void main1(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		String[] arr = line.split(" ");
		
		String[] student = arr[0].split(",");
		String[] sandwich = arr[1].split(",");
		
		int[] stu = new int[student.length];
		int[] sand = new int[student.length];
		for(int i = 0;i<student.length;i++)
		{
			stu[i] = Integer.valueOf(student[i]);
			sand[i] = Integer.valueOf(sandwich[i]);
		}

		System.out.println(Wucan(stu,sand));
	} 
	public static int Wucan(int[] student,int []sandwich )
	{
		Queue<Integer> qu = new LinkedList<>();
		Stack<Integer> st = new Stack<>();
		for(int i = 0;i<student.length;i++)
		{
			qu.offer(student[i]);
			st.push(sandwich[student.length-i]);
		}

		//问题规模：
		int n = student.length;
		//结束条件：失败的计数器
		int k=n;
		for(int i = 0;i<student.length;i++)
		{
			if(qu.peek() == st.peek())
			{
				st.pop();
				qu.poll();
				
			}
			else
			{
				int val = qu.poll();
				qu.offer(val);
			}
		}
		return st.size();

	}

}