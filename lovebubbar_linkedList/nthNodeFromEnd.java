package lovebubbar_linkedList;

public class nthNodeFromEnd {
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
		nthNodeFromEnd n = new nthNodeFromEnd();
		n.push(1);
		n.push(2);
		n.push(3);
		n.push(4);
		n.push(5);
		n.push(6);
		
		int c = 4;
		
		Node end = head;
		
		int length = 0;
		while(end != null) {
			end = end.next;
			length++;
		}
		
		end = head;
		for(int i = 1; i < length - c + 1; i++) {
			end = end.next;
		}
		
		System.out.println("nth node from end : "+end.data);
		
	}

	private void push(int data) {
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
