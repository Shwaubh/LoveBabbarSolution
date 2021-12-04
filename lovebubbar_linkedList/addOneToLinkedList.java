package lovebubbar_linkedList;

public class addOneToLinkedList {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static Node head;
	public static void main(String agrs[]) {
		addOneToLinkedList a = new addOneToLinkedList();
		a.head = new Node(9);
		a.head.next = new Node(9);
		a.head.next.next = new Node(9);
		a.head.next.next.next = new Node(9);
		System.out.println("Before : ");
		a.printList(head);
		head = addOne(head);
		System.out.println("\nAfter : ");
		a.printList(head);
	}
	public static Node addOne(Node head) {
		head = reverse(head);
		head = addOneUtil(head);
		head = reverse(head);
		return head;
	}
	private static Node addOneUtil(Node head) {
		int carry = 1;
		int sum;
		Node res = head;
		Node temp = null;
		while(head != null) {
			sum = carry + head.data; //as we need to add 1 for the first time
			carry =  (sum >= 10) ? 1 : 0;
			sum = sum % 10;
			head.data = sum;
			temp = head;
			head = head.next;
		}
		if(carry > 0) {//if carry is still 1 untill we traverse the last node case 9999  
			temp.next = new Node(carry);
		}
		return res;
	}
	public static Node reverse(Node head) {
		Node prev = null;
		Node nex = null;
		Node cur = head;
		while(cur != null) {
			nex = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nex;
		}
		return prev;
	}
	public void printList(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
}
