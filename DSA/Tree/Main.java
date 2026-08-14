import java.util.Queue;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.root = new Node(10);

        tree.root.left = new Node(20);
        tree.root.right = new Node(30);

        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(70);
        
        tree.levelOrder(tree.root);
    } 

     
}
class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


class Tree{
    
    Node root;
    
    void levelOrder(Node k){
        if(k==null){
            System.out.println("empty");
            return;
        }
        Queue<Node> q=new LinkedList<>();
        
        q.add(k);
        
        while(!q.isEmpty()){
            
            Node temp=q.poll();
            
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            
        }
        
    }
    
    
}