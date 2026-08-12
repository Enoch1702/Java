import java.util.Scanner;

public class Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] stack = new char[s.length()];
        int top = -1;
        boolean ok = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                top++;
                stack[top] = ch;
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (top == -1) {        // no opening bracket
                    ok = false;
                    break;
                }

                char open = stack[top];
                top--;

                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    ok = false;
                    break;
                }
            }
        }

        if (ok && top == -1) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}

/*import java.util.Scanner;
import java.util.Stack;

public class Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> st = new Stack<Character>();
        boolean ok = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (st.isEmpty()) {     // no opening bracket
                    ok = false;
                    break;
                }

                char open = st.pop();

                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    ok = false;
                    break;
                }
            }
        }

        if (ok && st.isEmpty()) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}*/