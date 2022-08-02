package List;

public class DoublyList{

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{

        private int data;
        private ListNode next;
        private ListNode previous;


        ListNode(int data){
            this.data = data;
        }

    }

    public DoublyList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }


    public boolean isEmpty() {
        return length == 0; // or head == null
    }
    
    public int length() {
        return length;
    }

    public void displayForward() {
		if(head == null) {
			return;
		}
		
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

    public void displayBackward(){
        ListNode temp = tail;

        while(temp != head.previous){
            System.out.print(temp.data + " --> ");
			temp = temp.previous;

            
        }
        System.out.println("null");

        
    }



    public void insertLast(int value){

        ListNode newNode = new ListNode(value);
            if(isEmpty()){
                head = newNode;
            } 
            else{
                tail.next = newNode;
                newNode.previous = tail;
            } 
            tail = newNode;
            length ++;
            
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        } 
        else{
            newNode.next = head;
            head.previous= newNode;
            head = newNode;

        }
        length++;

    }

    public void deleteFirst(){
        ListNode temp = head;

        if(isEmpty()){
            return;
        } 
        else{
            head = head.next;
            head.previous = null;
            temp.next = null;
        }

        length--;

    }

    public void deleteLast(){
        ListNode temp = tail;

        if(isEmpty()){
            return;
        } 
        else{
            tail = tail.previous;
            tail.next = null;
            temp.previous = null;
        }

        length--;

        

    }


    public static void main(String[] args) {

        DoublyList d = new DoublyList();

        d.insertLast(1);
        d.insertLast(2);
        d.insertLast(3);
        d.insertFirst(4);


        d.displayForward();
        d.displayBackward();

        d.deleteFirst();

        d.displayForward();
        d.displayBackward();

        d.deleteLast();

        d.displayForward();
        d.displayBackward();
        

        System.out.println(d.head.data + " " + d.tail.data);

    }

}