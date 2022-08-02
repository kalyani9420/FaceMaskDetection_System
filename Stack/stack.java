package Stack;

import java.util.EmptyStackException;
import java.util.Stack;


//LIFO

//Insert nd Remove from top
public class stack {

    private Listnode top;
    private int length;

    public class Listnode {
        private int data;
        private Listnode next;

        private Listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public stack() {
        top = null;
        length = 0;
    }

    public int Length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        Listnode temp = new Listnode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Listnode temp = top;
        top = top.next;
        temp.next = null;
        length--;

        return temp.data;

    }

    public void display() {
        Listnode temp = top;
        while (temp != null) {
            System.out.print(temp.data + "---->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;

    }

    public Listnode ReverseStack() {
        Listnode temp = null;
        while (temp != null) {
            temp.next = new Listnode(pop());
            top = temp;
            temp = temp.next;

        }

        return top;
    }

    public boolean validParenthesis(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);

            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    char top = st.peek();
                    if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                        st.pop();
                    } else {
                        return false;
                    }

                }

            }
        }

        return st.isEmpty();

    }

    // for each elemnent of array finds its next greater elemnt in array find its
    // greater next element in array
    // and it should towards right

    public int[] nextGreaterElement(int[] arr) {

        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }

                stack.push(arr[i]);
            }

        }

        // valid parenthesis

        return result;

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // System.out.println(s.pop());
        // System.out.println(s.peek());

        // s.display();
        // Listnode s1 = null;
        // s1 = s.ReverseStack();
        // System.out.println(s1);

        // int[] arr = { 4, 7, 3, 4, 8, 1 };
        // int[] temp = s.nextGreaterElement(arr);

        // System.out.println(s.nextGreaterElement(arr));

        // for (int i = 0; i < temp.length; i++) {
        //     System.out.print(temp[i] + " ");
        // }

        System.out.println(s.validParenthesis("{[]"));
        System.out.println(s.validParenthesis("{[]}"));
        System.out.println(s.validParenthesis("]["));

    }

}
