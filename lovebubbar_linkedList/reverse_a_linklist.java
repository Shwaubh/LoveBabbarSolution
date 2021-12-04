package lovebubbar_linkedList;
// a program to reverse a linked list and linkedlist in batch
public class reverse_a_linklist {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public static Node head;

	public static void main(String args[]) {
		reverse_a_linklist a = new reverse_a_linklist();
		a.head = new Node(1);
		a.head.next = new Node(2);
		a.head.next.next = new Node(3);
		a.head.next.next.next = new Node(4);
		a.head.next.next.next.next = new Node(5);
		a.head.next.next.next.next.next = new Node(6);
		a.head.next.next.next.next.next.next = new Node(7);
		a.head.next.next.next.next.next.next.next = new Node(8);
		
		System.out.println("Given Linked list");
        a.printList(head);
        
        head = a.reverse_linkedList(head);
        
        System.out.println("\nGiven Linked list After Reversal");
        a.printList(head);
        
	}

	public Node reverse_linkedList(Node head) {
		Node prev = null;
//		System.out.print(prev.data);
		Node nex = null;
		Node cur = head;
		int k = 0;
		while(cur != null && k < 4) {
			nex = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nex;
			k++;
		}
		if(nex != null) {
			head.next = reverse_linkedList(nex);
		}
		return prev;
	}

	public void printList(Node head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}
