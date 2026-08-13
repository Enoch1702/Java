public class BST{
    public static void main(String[] args) {
        Tree t=new Tree();
        t.root=new Node(20);
        t.root.left=new Node(15);
        t.root.right=new Node(30);
        t.root.left.left=new Node(5);
        t.root.left.right=new Node(18);
        t.root.right.left=new Node(25);
        t.root.right.right=new Node(35);
        System.out.print("Preorder : ");
        t.preorder(t.root);
        System.out.println();
        System.out.print("Inorder : ");
        t.inorder(t.root);
        System.out.println();
        System.out.print("Postorder : ");
        t.postorder(t.root);
        System.out.println();
        System.out.print("Leafnodes : ");
        t.leafnode(t.root);
        System.out.println();
        System.out.print("LevelOrder : ");
        System.out.println(t.levelorder(t.root));
        t.insert(t.root,50);
        System.out.println();
        t.deleteNode(t.root, 18);
        System.out.println();
        System.out.print("Inorder : ");
        t.inorder(t.root);
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

    Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left, data);
        }
        else{
            root.right=insert(root.right, data);
        }
        return root;
    }
    
    void dispTree(Node root){
        if(root==null){
            System.out.println("[]");
            return;
        }
        
    }

    public Node deleteNode(Node root, int data) {
        if(root == null){
            return null;
        }
        if(root.data > data){
            root.left = deleteNode(root.left,data);
        }
        else if(root.data < data){
            root.right = deleteNode(root.right,data);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            Node temp = root.right;
            
            while(temp.left != null){
                temp = temp.left;
            }
            root.data = temp.data;
            root.right = deleteNode(root.right,temp.data);
        }
        return root;
    }

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

    void leafnode(Node root){
        if(root==null){
            return;
        }
        if(root.right==null&&root.left==null){
            System.out.print(root.data+" ");
            return;
        }
        if(root.left!=null){
            leafnode(root.left);
        }
        if(root.right!=null){
            leafnode(root.right);
        }
    }

    int levelorder(Node root){
        if(root==null){
            return -1;
        } 
        int lheight = levelorder(root.left);
        int rheight = levelorder(root.right);
        int level;
        if(lheight>rheight){
            level = lheight + 1;
        }
        else{
            level = rheight + 1;
        }
        return level;
    }
}
