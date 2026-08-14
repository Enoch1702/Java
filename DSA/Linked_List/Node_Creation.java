public class Node_Creation{
    class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next =null;
    }
}
    Node head=null;

    void insertend(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void insertfront(int data){
        Node newNode = new Node(data);

        newNode.next=head;
        head=newNode;
    }
    void delfront(){
        head=head.next;
    }
    void delend(){
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    void disp(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.print("null\n");
    }
    public static void main(String[] args) {
            // Node obj1 =new Node(10);
            Node_Creation obj=new Node_Creation();
            obj.insertend(10);
            obj.insertfront(20);
            obj.delfront();
            obj.delend();
            obj.disp();
    }
}
