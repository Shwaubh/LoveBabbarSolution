package lovebubbar_linkedList;

public class middleOfLL {
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
		middleOfLL l = new middleOfLL();
		l.head = new Node(1);
		l.head.next = new Node(2);
		l.head.next.next = new Node(3);
		l.head.next.next.next = new Node(4);
		l.head.next.next.next.next = new Node(5);
		l.head.next.next.next.next.next = new Node(6);
		l.head.next.next.next.next.next.next = new Node(7);
		
		int a = findMid(head);
		System.out.println("Mid is : " +a);
	}
	private static int findMid(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

}
