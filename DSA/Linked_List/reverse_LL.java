public class reverse_LL{
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
    void dispreverse(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        temp=head;
        int a[]=new int[c];
        for(int i=0;i<c;i++){
            a[i]=temp.data;
            temp=temp.next;
        }
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" --> ");
        }
        System.out.print("null\n");

    }
    void palindrome(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        temp=head;
        int a[]=new int[c];
        for(int i=0;i<c;i++){
            a[i]=temp.data;
            temp=temp.next;
        }
        int start=0;
        int end=a.length-1;
        String check="Palindrome";
        while(start<end){
            if(a[start]!=a[end]){
                check="Not Palindrome";
            }
            start++;
            end--;
        }
        System.out.println(check);
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
            reverse_LL obj=new reverse_LL();
            obj.insertend(20);
            obj.insertend(10);
            obj.insertfront(30);
            obj.insertfront(40);
            obj.insertfront(50);
            obj.disp();
            obj.dispreverse();
            obj.palindrome();
    }
}
