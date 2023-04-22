public class Stack {
    
    int arr[] = new int[5];
    int top=0;
    
    private boolean push(int x){
        top++;
        arr[top]=x;
        System.out.println("element pushed into stack = "+x);
        return true;
    }

    private int pop(){
        int x= arr[top--];
        System.out.println("element popped from stack = " + x);
        return x;
    }

    private int peek(){
        return arr[top];    
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
       System.out.println(stack.peek());
    }
}
