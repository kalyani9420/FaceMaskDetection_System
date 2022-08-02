package Queue;


import java.util.NoSuchElementException;

//FIFO

//Insert from Rear
//Remove from front
public class Queue {

    private Listnode front;
    private Listnode rear;

    private int length;

    public class Listnode {

        private int data;
        private Listnode next;

        private Listnode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public Queue() {
        front = null;
        rear = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    private void enqueu(int data) {
        Listnode newNode = new Listnode(data);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }  
        rear = newNode;
        length++;

    }

    private int dequeu() {

        Listnode temp = null;
        if (isEmpty()) {
            throw new NoSuchElementException("queue is already empty");
        } else {
            temp = front;
            front = front.next;
            temp.next = null;

        }
        length--;
        return temp.data;

    }

    private void display() {
        if (isEmpty()) {
            return;
        } else {
            Listnode temp = front;
            while (temp != rear) {
                System.out.print(temp.data + "---->");
                temp = temp.next;
            }

            System.out.println("null");
        }

    }

    // public String[] generateArrayOfBinaryNumber(int n){

    //     String[] result = new String[n];
    //     Queue q  = new Queue();
    //     q.enqueu('1');
    //    for(int i = 0 ; i< n ; i++){
    //         result[i] = String( q.dequeu());
    //         String n1 = result[i] + "0";
    //         String n2 = result[i] + "1";

    //         q.enqueu(n1);
    //         q.enqueu(n2);
    //     }

    //     return result;

    // }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueu(1);
        q.enqueu(2);
        q.enqueu(3);
        q.enqueu(4);
        q.display();

        System.out.println(q.dequeu()); 
        q.display();

    // System.out.println(q.generateArrayOfBinaryNumber(5));

    }

}
