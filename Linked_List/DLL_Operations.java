public class DLL_Operations{
    class Node{
    Node prev;    
    int data;
    Node next;
    Node(int data){
        this.prev =null;
        this.data = data;
        this.next =null;
    }
}
    Node head=null;
    void insertend(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }
    void insertfront(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    void insertpos(int pos,int data){
        Node newNode=new Node(data);
        if(pos==1){
            head.prev=newNode;
            newNode.next=head;
        }
        else{
            Node temp=head;
            for(int i=1;i<pos-1&&temp.next!=null;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            newNode.prev=temp;
            temp.next.prev=newNode;
            temp.next=newNode;
        }
    }
    void dispBack(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.prev;
        } 
        System.out.println("null");
    }
    void disp(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DLL_Operations obj=new DLL_Operations();
        obj.insertend(20);
        obj.insertend(10);
        obj.insertfront(30);
        obj.insertfront(40);
        obj.insertfront(50);
        obj.insertfront(60);
        obj.disp();
        obj.dispBack();
        obj.insertpos(3, 70);
        obj.disp();
       
    }
}
