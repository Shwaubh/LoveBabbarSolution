package lovebubbar_linkedList;

public class segregateEvenOddLL {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	private static Node head;
	
	public static void main(String agr[]) {
		segregateEvenOddLL s = new segregateEvenOddLL();
		s.push(3);
		s.push(2);
		s.push(1);
		s.push(7);
		s.push(8);
		s.push(5);
		s.push(4);
		s.push(11);
		
		System.out.print("Original LinkedList :\n");
		s.printLL(head);
		
		s.segregate();
		
		System.out.print("\nSegregated LinkedList :\n");
		s.printLL(head);
	}	

	private static void segregate() {
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		
		while(head != null) {
			int element = head.data;
			if(element % 2 == 0) {
				if(evenStart == null) {
					evenStart = head;
					evenEnd = evenStart;
				}else {
					evenEnd.next = head;
					evenEnd = evenEnd.next;
				}
			}else {
				if(oddStart == null) {
					oddStart = head;
					oddEnd = oddStart;
				}else {
					oddEnd.next = head;
					oddEnd = oddEnd.next;
				}
			}
			head = head.next;
		}
		
		if(evenStart == null || oddStart == null) {
			return;
		}
		
		evenEnd.next = oddStart;
		oddEnd.next = null;
		head = evenStart;
	}

	private static void printLL(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	private void push(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node cur = head;
		while(cur.next != null) {
			cur = cur.next;
		}
		Node newNode = new Node(data);
		cur.next = newNode;
	}
}
