public class insert_at_spec_pos{
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
        while(head==null){
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
    void insertpos(int pos,int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        if(head.next==null){
            newNode.next=head;
            head=newNode;
        }
        else{
             Node temp=head;
             for(int i=1;i<pos-1&&temp.next!=null;i++){
                temp=temp.next;
             }
             newNode.next=temp.next;
             temp.next=newNode;
        }
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
            insert_at_spec_pos obj=new insert_at_spec_pos();
            obj.insertend(20);
            obj.insertfront(30);
            obj.insertfront(40);
            obj.insertfront(50);
            obj.insertfront(60);
            obj.disp();
            obj.insertpos(7, 10);
            obj.disp();
    }
}
