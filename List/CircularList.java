package List;

public class CircularList {

    private Listnode last;
    private int length;

    private class Listnode{
        private int data;
        private Listnode next;

        private Listnode(int data){
            this.data = data;
        }
    }

    public CircularList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length ==0;
    }

    public void InsertLast(int value){
        Listnode newNode = new Listnode(value);
        if(last == null){
            last = newNode;
            last.next = last;
        }
        else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        length++;
        
    }

    public void InsertFirst(int value){
        Listnode temp = new Listnode(value);
		if(last == null) {
			last = temp;
		}
        else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;


    }

    public void display(){

        if(isEmpty()){
            return;
        }
        Listnode first = last.next;
        while(first != last) {
			System.out.print(first.data + " --> ");
			first = first.next;
		}
        System.out.print(first.data + " --> ");
        System.out.print("null");


    }

    public Listnode RemoveFirst(){
        if(isEmpty()) {
			return null;
		}
        Listnode temp = last.next;

        if(temp.next == last){
            last = null;
        }
        else{
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;



    }


    public static void main(String[] args) {
        CircularList c = new CircularList();
        c.InsertLast(1);
        c.InsertLast(2);
        c.InsertLast(3);
        c.InsertFirst(4);

        System.out.println(c.RemoveFirst());
        
        c.display();
    }
    
}
