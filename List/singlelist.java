package List;

public class singlelist {
    private ListNode head;

	private static class ListNode {
		private int data; // Can be a generic type
		private ListNode next; // Reference to next ListNode in list

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
		
	}


	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}

	public int length() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

	public void insert(int position, int value){
		// 1 -> 4 -> 5
		// 1 -> 6 -> 4 -> 5
		ListNode node = new ListNode(value);

		if(position == 1){
			node.next = head;
			head = node;
		} else {
			ListNode previous = head;
			int count = 1; // position - 1

			while(count < position - 1){
				previous = previous.next;
				count++;
			}

			ListNode current = previous.next;
			previous.next = node;
			node.next = current;
		}


	}

	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}

	public ListNode deleteFirst() {
		if(head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

	public void delete(int position){
		// position is valid and starting from 1
		// 3 -> 4 -> 7 -> 8 -> 9 -> null
		if(position == 1){
			head = head.next;
		} else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1){
				previous = previous.next;
				count++;
			}

			ListNode current = previous.next;
			previous.next = current.next;
		}
	}

	public ListNode deleteLast() {
		if(head == null) {
			return head;
		}

		if(head.next == null) {
			ListNode temp = head;
			head = head.next;
			return temp;
		}

		ListNode current = head;
		ListNode previous = null;

		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null; // break the chain
		return current;
	}

	public boolean find(int searchKey) {
		if(head == null) {
			return false;
		}

		ListNode current = head;
		while(current != null) {
			if(current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public ListNode reverse() {
		if(head == null) {
			return null;
		}

		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public ListNode getMiddleNode() {
		if(head == null) {
			return null;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	public ListNode getNthFromEnd(int n){
	
		if(n <= 0) {
			throw new IllegalArgumentException("Invalid value: n = " + n);
		}
		ListNode ref = head;
		ListNode current = head;
		int count = 0;
		while(count < n){
			ref = ref.next;
			count++;
		}

		while (ref != null){
			ref = ref.next;
			current= current.next;

		}
		return current;

	}

	public ListNode RemoveDuplicateFromSortedList(){
		if(head == null){
			return null;
		}
		ListNode current = head;
		while(current != null && current.next != null){
			if(current.data == current.next.data){
				current.next = current.next.next;
			}
			else{
				current = current.next;


			}
		}
		return current;
	}

	public ListNode InsetInSorted(int value){
		ListNode newNode = new ListNode(value);
		if(head == null) {
			return newNode;
		}
		ListNode current = head;
		ListNode temp = null;

		while(current != null && current.data < newNode.data  ){

			temp = current;
			current = current.next;

		}

		newNode.next = current;
		temp.next = newNode;
		return head;


	}

	public ListNode DeleteKey(int value){

		ListNode current = head;
		ListNode newNode = new ListNode(value);
		ListNode temp = head;

		while(current != null && current.data != newNode.data){
			temp = current;
			current = current.next;
		}
		
		if(current == null){
			return null;
		}

		temp.next = current.next;
		return head;

	}

	public void creatLoop(){
		ListNode f = new ListNode(1);
		ListNode s = new ListNode(2);

		ListNode t = new ListNode(3);

		ListNode fo = new ListNode(4);

		ListNode fi = new ListNode(5);

		ListNode si = new ListNode(6);

		ListNode se = new ListNode(7);

		ListNode ei = new ListNode(8);

		head = f;

		f.next = s;
		s.next = t;
		t.next= fo;
		fo.next = fi;
		fi.next = si;
		si.next = se;
		se.next = ei;
		ei.next = fi;


	}

	//floyd's cycle detection algo---->11
	public boolean isLoop(){ 
		ListNode fast = head;
		ListNode slow = head;

		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;

			if(fast == slow){
				return true;
			}
		}
		return false;
	}

	public int whereisLoop(){
		ListNode fast = head;
		ListNode slow = head;

		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;

			if(fast == slow){
				return slow.data;
				// return getStartLoopNode(ListNode slow);
			}
		}
		return 0;
	}

	private ListNode RemoveLoop(ListNode slowPtr){
		ListNode temp = head;
		while(temp != slowPtr){
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
		return head; // starting node of the loop


	}

	public void RemoveLoop(){
		ListNode fast = head;
		ListNode slow = head;

		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;

			if(fast == slow){
			
				RemoveLoop(slow);
			}
		}
	}


	// private ListNode getStartingNode(ListNode slowPtr) {
	// 	ListNode temp = head;
	// 	while(temp != slowPtr){
	// 		temp = temp.next;
	// 		slowPtr = slowPtr.next;
	// 	}
	// 	return temp; // starting node of the loop
	// }


	public static ListNode mergeTwoSortedList(ListNode a , ListNode b){

		ListNode dumy = new ListNode(0);
		ListNode temp = dumy;

		while (a != null && b!= null){
			if(a.data <= b.data){
				temp.next = a;
				a= a.next;

			}
			else{
				temp.next = b;
				b = b.next;
			}

			temp = temp.next;
		}

		if(a == null){
			temp.next = b;
			
		}
		else{
			temp.next = a;
		}

		return dumy.next;
	}

	public static ListNode AddTwoList(ListNode a , ListNode b){

		ListNode temp = new ListNode(0);
		ListNode ptr = temp;
		int carry = 0;

		while (a != null && b != null){


			int x = (a!= null) ? a.data : 0;
			int y = (b!= null) ? b.data : 0;

			int sum = carry + x +y;
			carry = sum / 10;

			ptr.next = new ListNode(sum % 10);
			ptr = ptr.next;
			if(a!= null) a = a.next;
			if(b!= null) b = b.next;
		
		}

		if(carry > 0){
			ptr.next = new ListNode(carry);
		}
		return ptr.next;

	}


    public static void main(String[] args) {
		singlelist sll = new singlelist();
		singlelist sll2 = new singlelist();
		// sll.createALoopInLinkedList();
		// System.out.println(sll.containsLoop());
		// System.out.println(sll.startNodeInALoop().data);
		// sll.removeLoop();

		sll.insertLast(5);
		sll.insertLast(6);
		sll.insertLast(9);
		sll.insertLast(13);
		

		
		sll2.insertLast(1);
		sll2.insertLast(3);
		sll2.insertLast(7);
		sll2.insertLast(10);
		sll2.insertLast(15);
		sll2.insertLast(30);


		// sll.deleteLast();
		// sll.deleteLast();
		// sll.deleteLast();
		// System.out.println(sll.deleteLast().data);
		// sll.getMiddleNode();
		// System.out.println(sll.getMiddleNode().data);
		// int nth = sll.getNthFromEnd(4).data;
		//  System.out.println(nth);

		// sll.RemoveDuplicateFromSortedList();
		// sll.InsetInSorted(11);

		// sll.DeleteKey(9);

		// sll.DeleteKey(26);
		// sll.creatLoop();
		// // sll.whereisLoop();

		// sll.RemoveLoop();


		// sll.display();
		// System.out.println(" ");
		// sll2.display();
		// System.out.println(" ");


		// singlelist tempList = new singlelist();
		// tempList.head = mergeTwoSortedList(sll.head, sll2.head);

		singlelist templist2 = new singlelist();
		templist2.head = AddTwoList(sll.head , sll2.head);
	 
		System.out.println(" ");
		templist2.display();

		



	}

    
}
