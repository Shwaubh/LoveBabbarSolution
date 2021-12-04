package lovebubbar_linkedList;

public class intersectionOfSortedLL {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	private static Node head1;
	private static Node head2;
	private static Node dummy = null;
	private static Node tail = null;
	
	public static void main(String args[]) {
		intersectionOfSortedLL list = new intersectionOfSortedLL();
		list.head1 = new Node(2);
        list.head1.next = new Node(4);
        list.head1.next.next = new Node(7);
        list.head1.next.next.next = new Node(8);
        list.head1.next.next.next.next = new Node(9);
       
        System.out.print("First List is ");
        list.printList(head1);
        
        list.head2 = new Node(1);
        list.head2.next = new Node(2);
        list.head2.next.next = new Node(4);
        
        System.out.print("\nSecond List is ");
        list.printList(head2);
        
        list.findIntersection(head1, head2);
        System.out.print("\nResultant is ");
        list.printList(dummy);
	}
	
	public void findIntersection(Node head1, Node head2) {
		while(head1 != null && head2 != null) {
			if(head1.data == head2.data) {
				push(head1.data);
				head1 = head1.next;
				head2 = head2.next;
			}else if(head1.data < head2.data)  {
				head1 = head1.next;
			}else {
				head2 = head2.next;
			}
		}
	}
	private void push(int d) {
		Node temp = new Node(d);
		if(dummy == null) {
			dummy = temp;
			tail = temp;
		}else {
			tail.next = temp;
			tail = temp;
		}
	}

	public void printList(Node head) {
		while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
	}
}
