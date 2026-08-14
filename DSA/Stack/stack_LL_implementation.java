public class stack_LL_implementation {
    public static void main(String[] args) {

        stack s = new stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Top element: " + s.peek());

        System.out.println("Popped element: " + s.pop());

        s.display();

        System.out.println("Is stack empty? " + s.isEmpty());
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class stack {
    Node head = null;

    void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        System.out.println(data + " pushed");
    }

    int pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = head.data;
        head = head.next;

        return value;
    }

    int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        return head.data;
    }

    boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = head;

        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}