public class Graph_LL_Implementation{
    public static void main(String[] args){
        Graph g= new Graph(5);
        g.addEdges(0,1);
	    g.addEdges(0,4);
	    g.addEdges(1,3);
	    g.addEdges(1,1);
	    g.addEdges(2,3);
	    g.addEdges(3,2);
	    g.display();
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

class Graph{
    int size;
    Node a[];

    Graph(int size){
        this.size=size;
        a = new Node[size];
    }

    void addEdges(int s,int d){
        Node newNode = new Node(d);
        newNode.next=a[s];
        a[s] = newNode;

        newNode = new Node(s);
        newNode.next=a[d];
        a[d] = newNode;
    }

    void display(){
        for(int i=0;i<size;i++){
            System.out.print(i+" ");
            Node temp=a[i];
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    }
}