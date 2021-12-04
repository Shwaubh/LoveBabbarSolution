package lovebubbar_linkedList;

public class checkIfCirrcular {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	private static Node head;
	public static void main(String args[]) {
		checkIfCirrcular c = new checkIfCirrcular();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		
		printLL(head);
		
		System.out.println();
		
		System.out.print(isCircular(head)? "Yes\n" : "No\n" );
		
		head.next.next.next.next = head;//making it circular
		 
	    System.out.print(isCircular(head)? "Yes\n" :
	                    "No\n" );
	}
	
	private static boolean isCircular(Node head) {
		Node cur = head.next;
		while(cur != null && cur != head) {
			cur = cur.next;
		}
		return (cur == head);
	}

	private static void printLL(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	public void add(int data) {
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
