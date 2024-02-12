import java.util.Stack;

public class StackAlgo{
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();


        stack.push(20);
        stack.push(50);
        System.out.println(stack);
        int topElement=stack.pop();
        System.out.println("top element of stack is :"+topElement +"\n");


        System.out.println("Peek element "+stack.peek() +"\n");

        if(isEmpty(stack)){
            System.out.println(" stack is empty");
        }else{
            System.out.println( stack +"\t Stack is not empty");
        }

        stack.push(30);
        stack.push(60);
        System.out.println(stack);

        System.out.println("Size of stack is :" +stack.size());


        // traversing
        while(!stack.isEmpty()){
            int element=stack.pop();
            System.out.println("Element :" + element);
        }

        // clearing stack
        stack.clear();
        System.out.println("Syack has been cleared ");

            
    }
  
    public static boolean isEmpty(Stack<?> stack){
        return stack.isEmpty();
    }

}