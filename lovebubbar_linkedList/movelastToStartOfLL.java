package lovebubbar_linkedList;

import lovebubbar_linkedList.delete_duplicate_in_sorted_ll.Node;

public class movelastToStartOfLL {
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
		movelastToStartOfLL a = new movelastToStartOfLL();
		a.head = new Node(11);
		a.head.next = new Node(11);
		a.head.next.next = new Node(11);
		a.head.next.next.next = new Node(12);
		a.head.next.next.next.next = new Node(13);
		a.head.next.next.next.next.next = new Node(14);
		
		System.out.println("Linked List before deletion of duplicate : ");
		printLL(head);
		movelastToStartOfLinkList();
		System.out.println("\nLinked List after deletion of duplicate : ");
		printLL(head);
	}
	private static void movelastToStartOfLinkList() {
		if(head == null || head.next == null) {
			return;
		}
		Node secLast = null;
        Node last = head;
        while (last.next != null)  
        {
           secLast = last;
           last = last.next; 
        }
        secLast.next = null;
        last.next = head;
        head = last;
	}
	public static void printLL(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
}
