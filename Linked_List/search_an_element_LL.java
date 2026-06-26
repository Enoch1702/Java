public class search_an_element_LL
{
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
    void search_target(int target){
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==target){
                
            }
        }
    }
    /*void disp(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.print("null\n");
    }*/
    public static void main(String[] args) {
            search_an_element_LL obj=new search_an_element_LL();
            obj.insertend(20);
            obj.insertend(10);
            obj.insertfront(30);
            obj.insertfront(40);
            obj.insertfront(50);
            obj.insertfront(60);
            obj.search_target(20);
    }
}
