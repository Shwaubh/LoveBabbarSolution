package lovebubbar_linkedList;

public class deleteFromCLL {
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
		deleteFromCLL d = new deleteFromCLL();
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		
		d.head.next.next.next.next = d.head;
		
		System.out.printf("List Before Deletion: ");
		printLL(head);
		
		head = deleteNode(head, 3);
		
		System.out.printf("\nList After Deletion: ");
		printLL(head);
		
	}
	private static Node deleteNode(Node head, int key) {
		if (head == null)
            return null;
		
		Node cur = head;
		Node prev = null;
		
		while(cur.data != key) {
			if(cur.next == head) {
				System.out.print("Element not found");
				break;
			}
			prev = cur;
			cur = cur.next;
		}
		
		if(cur == head && cur.next == head) {//agr ek hi element hai use hi delete krna hai to
			head = null;
			return head;
		}
		
		if(cur == head) {//agr pehla element hi delete krna hai to last tak jakr akri k next ko cur k next se jodde
			prev = head;
			while(prev.next != head) {
				prev = prev.next;
			}
			head = cur.next;
			prev.next = head;
		}else if(cur.next == head) {//agr aakri element hai to
			prev.next = head;
		}else {
			prev.next = cur.next;
		}
		return head;
	}
	private static void printLL(Node head) {
		Node temp = head;
		if(head != null) {
			do {
				System.out.print(temp.data +" ");
				temp = temp.next;
			}while(temp != head);
		}
	}
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
