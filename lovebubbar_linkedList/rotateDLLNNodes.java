package lovebubbar_linkedList;

public class rotateDLLNNodes {
	public static class Node{
		int data;
		Node next, prev;
		Node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}

	private static Node head;
	
	public static void main(String args[]) {
		rotateDLLNNodes r = new rotateDLLNNodes();
		r.push(5);
		r.push(4);
		r.push(3);
		r.push(2);
		r.push(1);
		
		int n = 2;
		
		System.out.println("Given linked list ");
	    printList(head);
	    
	    rotate(n);
	    
	    System.out.println("Rotated linked list ");
	    printList(head);
	}

	private static void rotate(int n) {
		if (n == 0) {
			return;
		}
		
		Node cur = head;
		
		int count = 1;
		
		while(count < n && cur != null) {
			cur = cur.next;
			count++;
		} 
		Node nthNode = cur;
		
		while(cur.next != null){
			cur = cur.next;
		}
		
		cur.next = head;
		head.prev = cur;
		
		head = nthNode.next;
		
		head.prev = null;
		nthNode.next = null;
	}

	private static void printList(Node head) {
		while(head != null){
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	private void push(int data) {
		Node newNode = new Node(data);
		newNode.prev = null;
		newNode.next = head;
		
		if(head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}
}
