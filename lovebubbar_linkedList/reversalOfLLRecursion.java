package lovebubbar_linkedList;

public class reversalOfLLRecursion {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String args[]) {
		reversalOfLLRecursion r = new reversalOfLLRecursion();
		r.add(20);
		r.add(4);
		r.add(15);
		r.add(85);
		
		System.out.print("Before : ");
		r.printLL(head);
		Node head1 = r.reverseRecursion(head);
		System.out.print("\nAfter : ");
		r.printLL(head1);
	}

	private Node reverseRecursion(Node head) {
		if(head == null) {
			return head;
		}
		
		if(head.next == null) {
			return head;
		}
		
		Node newHeadNode = reverseRecursion(head.next);
		head.next.next = head;
		head.next = null;
		return newHeadNode;
	}

	private void printLL(Node head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	private static Node head;

	private void add(int data) {
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
