public class del_at_spec_pos{
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
    void delpos(int pos){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(pos==1){
            head=head.next;
        }
        else{
            Node temp=head;
            for(int i=1;i<pos-1&&temp!=null;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(temp==null){
                System.out.println("Invalid Position");
            }

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
            del_at_spec_pos obj=new del_at_spec_pos();
            obj.insertend(10);
            obj.insertfront(20);
            obj.insertfront(30);
            obj.insertend(100);
            obj.disp();
            obj.delpos(4);
            obj.disp();
    }
}
