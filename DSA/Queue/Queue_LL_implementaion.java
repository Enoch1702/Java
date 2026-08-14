public class Queue_LL_implementaion{
    public static void main(String[] args){
        Queue q=new Queue();
        
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        q.enQueue(60);
        q.enQueue(70);
        q.enQueue(80);
        
        q.display();
        
        q.deQueue();
        q.display();
        q.isEmpty();
        q.peek();
        
        
    }
}
class Node{
    int data;
    Node next; 
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Queue{
    Node front=null;
    Node rear=null;
    
    
    void enQueue(int data){
        Node newNode=new Node(data);
        
        if(rear==null){
            rear=newNode;
            front=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
        
    }
    
    void deQueue(){
        if(front==null){
            System.out.println("empty");
            return;
        }
        int r=front.data;
        front=front.next;
        
        if(front==null){
            rear=null;
        }
        
        System.out.println(r);
        
        
    }
    
    void peek(){
        if(front==null){
            System.out.println("empty");
            return;
        }
        System.out.println(front.data);
    }
    
    void isEmpty(){
        if(front==null){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
    void display(){
        Node temp=front;
        
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
            
        }
        System.out.println();
    }
}