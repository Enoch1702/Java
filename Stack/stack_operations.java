import java.util.Scanner;
public class stack_operations
{
    int size;
    int stack[];
    int top=-1;
    stack_operations(int size){
        this.size= size;
        stack =new int[size];
    }
    void push(int data){
        if(top==size-1){
            System.out.print("Stack is full\n");
        }
        else{
            stack[++top]=data;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty\n");
        }
        else{
            top--;
        }
        
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack is empty\n");
        }
        else{
            System.out.println(stack[top]);
        }
    }
    void isempty(){
        if(top==-1){
            System.out.println("Stack is empty\n");
        }
    }
    void isfull(){
        if(top==size-1){
            System.out.print("Stack is full\n");
        }
    }
    void stackreverse(){
        int top2=-1;
        int stack2[]=new int[size];
        for(int i=top;i>=0;i--){
            stack2[++top2]=stack[i];
        }
        System.out.println("\nReverse of Stack");
        for(int i=top2;i>=0;i--){
            System.out.println(stack2[i]);
        }
        System.out.println();
        System.out.println(stack2[top2]);

    }
    void palindrome(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            int start=0;
            int end=top;
            while(start<end){
                if(stack[start]!=stack[end]){
                    System.out.println("Not Palindrome");
                    return;
                }
                start++;
                end--;
            }
            System.out.println("Palindrome");
        }
    }
    void display(){
        if(top==-1){
            System.out.println("Stack is empty\n");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of stack :");
        int size=sc.nextInt();
        stack_operations obj = new stack_operations(size);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.display();
        obj.pop();
        obj.display();
        obj.peek();
        obj.isempty();
        obj.isfull();
        obj.stackreverse();
        obj.palindrome();

    }
    
}