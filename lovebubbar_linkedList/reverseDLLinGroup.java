package lovebubbar_linkedList;

public class reverseDLLinGroup {
	public static void main(String args[]) {
		Node head = null;
		head = push(head, getNode(4));
		head = push(head, getNode(3));
		head = push(head, getNode(2));
		head = push(head, getNode(1));
		
		int k = 2;
        
        System.out.print("Original list: \n");
        printList(head);
        
        head = reverseInGroup(head, k);
        
        System.out.print("\nReversed list: \n");
        printList(head);
 
	}

	private static Node reverseInGroup(Node head, int k) {
		Node cur = head;
		Node next = null;
		int count = 0;
		Node newHead = null;
		
		while(cur != null && count < k) {
			next = cur.next;
			newHead = push(newHead, cur);
			cur = next;
			count++;
		}
		
		if(next != null) {
			head.next = reverseInGroup(next, k);
			head.next.prev = head;
		}
		return newHead;
	}

	private static Node push(Node head, Node new_node) {
		new_node.prev = null;
		new_node.next = head;
		if(head != null) {
			head.prev = new_node;
		}
		head = new_node;
		return head;
	}

	private static Node getNode(int data) {
		Node new_node = new Node();
		new_node.data = data;
		new_node.prev = null;
		new_node.next = null;
		return new_node;
	}
	
	static void printList(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

class Node{
	int data;
	Node next, prev;
}