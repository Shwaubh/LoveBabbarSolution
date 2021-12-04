package lovebubbar_linkedList;

public class splitCircularInto2 {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	private static Node head;
	private static Node head1;
	private static Node head2;
	
	public static void main(String args[]) {
		splitCircularInto2 s = new splitCircularInto2();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		
		s.head.next.next.next.next = s.head;
		
		System.out.println("Original Circular Linked list ");
        s.printList(head);
        
        s.splitList();
        System.out.println("");
        System.out.println("First Circular List ");
        s.printList(head1);
        System.out.println("");
        System.out.println("Second Circular List ");
        s.printList(head2);
		
		
	}
	private void splitList() {
		Node slow = head;
		Node fast = head.next;
		
		while(fast.next != head && fast != head) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		head1 = head;
		head2 = slow.next;
		
		slow.next = head1;
		Node cur = head2;
		while(cur.next != head) {
			cur = cur.next;
		}
		cur.next = head2;
	}
	private void printList(Node node) {
		Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
	}
	private void add(int data) {
		if(head == null) {
			head = new Node (data);
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
