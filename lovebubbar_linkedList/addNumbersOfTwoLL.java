package lovebubbar_linkedList;

public class addNumbersOfTwoLL {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static Node head1;
	public static Node head2;
	public static void main(String args[]) {
		addNumbersOfTwoLL list = new addNumbersOfTwoLL();
		list.head1 = new Node(7);
        list.head1.next = new Node(5);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(6);
       
        System.out.print("First List is ");
        list.printList(head1);
        
        head1 = reverse(head1);
        
        list.head2 = new Node(8);
        list.head2.next = new Node(4);
        
        System.out.print("Second List is ");
        list.printList(head2);
        
        head2 = reverse(head2);
          
        System.out.print("First List is ");
        list.printList(head1);
        
        System.out.print("Second List is ");
        list.printList(head2);
        
        Node head3 = sumThem(head1, head2);
        
        list.printList(head3);
	}
	
	private static Node sumThem(Node head1, Node head2) {
		Node res = new Node(-1);
		Node temp = res;
		int carry = 0;
		while(head1 != null || head2 != null || carry != 0) {
			int sum = carry + (head1 != null ? head1.data : 0) + (head2 != null ? head2.data : 0);
			int ld = sum % 10;
			carry =  sum / 10;
			
			temp.next = new Node(ld);
			temp = temp.next;
			
			if(head1 != null) head1 = head1.next;
			if(head2 != null) head2 = head2.next;
		}
		return reverse(res.next);
	}

	private static Node reverse(Node head) {
		Node prev = null;
		Node cur = head;
		Node nex = null;
		while(cur != null) {
			nex = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nex;
		}
		return prev;
	}

	public void printList(Node head) {
		while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
	}
}
