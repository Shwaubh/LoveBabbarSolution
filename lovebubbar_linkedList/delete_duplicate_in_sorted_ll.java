package lovebubbar_linkedList;

public class delete_duplicate_in_sorted_ll {
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
		delete_duplicate_in_sorted_ll a = new delete_duplicate_in_sorted_ll();
		a.head = new Node(11);
		a.head.next = new Node(11);
		a.head.next.next = new Node(11);
		a.head.next.next.next = new Node(12);
		a.head.next.next.next.next = new Node(13);
		a.head.next.next.next.next.next = new Node(14);
		
		System.out.println("Linked List before deletion of duplicate : ");
		printLL(head);
		deleteDuplicate(head);
		System.out.println("\nLinked List after deletion of duplicate : ");
		printLL(head);
	}
	private static void deleteDuplicate(Node head) {
		Node cur = head;
		while(cur != null) {
			Node temp = cur;
			while(temp != null && temp.data == cur.data){
				temp = temp.next;		
			}
			cur.next = temp;
			cur = cur.next;
		}
	}
	private static void printLL(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
}
