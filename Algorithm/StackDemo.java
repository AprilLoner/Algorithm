import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        //声明一个栈 泛型：指定栈中数据的类型，注意要使用引用数据类型 用<>来指定 自定义类都是引用数据类型
        Stack<Integer> st = new Stack<Integer>();
        // Stack<Character> st1 = new Stack<Character>();
        //Stack类的主要方法 栈方法
        //push元素入栈；pop元素出栈删除栈顶元素；peek拿到栈顶元素，不删除栈顶元素
        for(int i = 1;i<=5;i++){
            st.push(i); //5在栈顶
        }

        for(int x:st){
            System.out.print(x+" ");
        } //看栈的内容，把栈看成一个数组
        System.out.println();

        while(!st.isEmpty()){
            Integer x = st.pop();
            System.out.print(x+" ");
        }//这个是栈应该的样子 后进先出
    }
}