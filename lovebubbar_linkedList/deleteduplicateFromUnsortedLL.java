package lovebubbar_linkedList;

public class deleteduplicateFromUnsortedLL {
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
		deleteduplicateFromUnsortedLL a = new deleteduplicateFromUnsortedLL();
		a.head = new Node(11);
		a.head.next = new Node(12);
		a.head.next.next = new Node(11);
		a.head.next.next.next = new Node(1);
		a.head.next.next.next.next = new Node(11);
		
		System.out.println("Before : ");
		a.printLL(head);	
		
		a.removeDuplicate(head);
		System.out.println("\nAfter :");
		a.printLL(head);
	}
	private void removeDuplicate(Node head) {
		Node p1 = null;
		Node p2 = null;
		p1 = head;
		while(p1 != null && p1.next != null) {
			p2 = p1;
			while(p2 != null && p2.next != null) {
				if(p1.data == p2.next.data) {
					p2.next = p2.next.next;
					System.gc();
				}else {
					p2 = p2.next;
				}
			}
			p1 = p1.next;
		}
	}
	private void printLL(Node head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}
