public class Queue_operations
{
    int size;
    int Queue[];
    int front=-1;
    int rear =-1;
    Queue_operations(int size){
        this.size= size;
        Queue =new int[size];
    }
    void enqueue(int data){
        if(rear==size-1){
            System.out.println("Queue is full");
        }
        else{
            if(front==-1){
                Queue[++rear]=data;
                front++;
            }
            else{
                Queue[++rear]=data;
            }
        }
    }
    void dequeue(){
        if(front==-1){
            System.out.println("Queue is Empty");
            return;
        }
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
    }
    void peek(){
        System.out.println("Queue Front Elements :"+Queue[front]);
        System.out.println("Queue Rear Elements :"+Queue[rear]);
    }
    void isempty(){
        if(front==-1&&rear==-1){
            System.out.println("Queue is Empty");
        }
    }
    void isfull(){
        if(rear==size-1){
            System.out.println("Queue is full");
        }
    }
    void Queuereverse(){
        int Queue2[]=new int[size];
        int j=0;
        for(int i=rear;i>=front;i--){
            Queue2[j]=Queue[i];
            j++;
        }
        for(int i=0;i<j;i++){
            System.out.print(Queue2[i]+" ");
        }
        System.out.println("");
    }
    void palindrome(){
        int Queue2[]=new int[size];
        int j=0;
        for(int i=rear;i>=front;i--){
            Queue2[j]=Queue[i];
            j++;
        }
        String check="Palindrome";
        for(int i=0;i<j;i++){
            if(Queue[front]!=Queue2[i]){
                check="Not Palindrome";
            }
            front++;
        }
        System.out.println(check);
    }
    void display(){
        if(rear==-1){
            System.out.println("Queue is Empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(Queue[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue_operations q = new Queue_operations(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(20);
        q.enqueue(10);
        q.display();
        q.enqueue(60);
        q.enqueue(70);  
        q.display();
        q.display();
        q.peek();
        q.isempty();
        q.isfull();
        q.Queuereverse();
        q.palindrome();
        q.dequeue();
        q.display();
    }
    
}