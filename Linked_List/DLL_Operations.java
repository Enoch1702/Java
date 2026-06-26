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
    // Insert at End 
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
    // Insert at Front
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
    // Insert at a specific position
    void insertpos(int pos,int data){
        Node newNode=new Node(data);
        
        if(head==null){
            head=newNode;
            return;
        }
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
    // Delete front node
    void delfront(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            if(head.next==null){
                head=null;  
            }
            else{
                head=head.next;
                head.prev.next=null;
                head.prev=null;
            }
        }
    }
    // Delete last/end node
    void delend(){
        Node temp=head;
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            if(head.next==null){
                head=null;  
            }
            else{
                while(temp.next.next!=null){
                temp=temp.next;
                }
                temp.next.prev=null;
                temp.next=null;
            }
        }
    }
    // Delete node at a specific position
    void del_spec_pos(int pos){
        Node temp=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(pos==1){
            head.next.prev=null;
            head.next=null;
        }
        else{
            for(int i=1;i<pos-1&&temp.next!=null;i++)//if(int i=1;i<p&&temp!=null;i+=)
            {
                temp=temp.next;
            }
            if(temp.next==null){
                System.out.println("Invalid Position");
                return;
            }
            temp.next.next.prev=temp;//temp.next.prev=temp.next;
            temp.next=temp.next.next;//temp.prev.next=temp.next;
                                     //temp=null;
        }
    }
    // Display reverse of the DLL
    void dispreverse(){
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
    // Display the List
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
        obj.dispreverse();
        obj.insertpos(3, 70);
        obj.disp();
        obj.delend();
        obj.disp();
        obj.delfront();
        obj.disp();
        obj.insertfront(60);
        obj.insertend(10);
        obj.disp();
        obj.del_spec_pos(3);
        obj.disp();
        obj.del_spec_pos(7);
        obj.disp();
    }
}
