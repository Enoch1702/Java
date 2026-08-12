public class tree{
    public static void main(String[] args) {
        Tree t=new Tree();
        t.root=new Node(10);
        t.root.left=new Node(20);
        t.root.right=new Node(30);
        t.root.left.left=new Node(5);
        System.out.print("Preorder : ");
        t.preorder(t.root);
        System.out.println();
        System.out.print("Inorder : ");
        t.inorder(t.root);
        System.out.println();
        System.out.print("Postorder : ");
        t.postorder(t.root);
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
class Tree{
    Node root=null;
    void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
}
