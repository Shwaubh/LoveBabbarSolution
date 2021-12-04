package lovebubbar_linkedList;

public class cloneWithNextAndRandom {
	public static class Node{
		int data;
		Node next, random;
		Node(int data){
			this.data = data;
			next = null;
			random = null;
		}
	}

	private static Node head;
	
	public static void main(String args[]) {
		cloneWithNextAndRandom a = new cloneWithNextAndRandom();
		a.head = new Node(1);
		a.head.next = new Node(2);
		a.head.next.next = new Node(3);
		a.head.next.next.next = new Node(4);
		a.head.next.next.next.next = new Node(5);
		
		a.head.random = a.head.next.next;
		a.head.next.random = a.head.next;
		a.head.next.next.random = a.head.next.next.next.next;
		a.head.next.next.next.random = a.head.next.next.next;
		a.head.next.next.next.next.random = a.head;
		
		System.out.println("Original list : ");
        print(head);
        
        Node cloned_list = clone(head);
        
        System.out.println("\nCloned list : ");
        print(cloned_list);
	}

	private static Node clone(Node head) {
		Node cur = head;
		Node temp = null;
		
		while(cur != null) {//this will create a new similar node just after each node >> 1>2>3>4>5 >> 1>1`>2>2`>3>3`>4>4`>5>5`
			temp = cur.next;
			cur.next = new Node(cur.data);
			cur.next.next = temp;
			cur = temp;
		}
		
		cur = head;
		
		while(cur != null) {//this makes adjustment to the random pointers
			if(cur.next != null) {
				cur.next.random = (cur.random != null) ? cur.random.next : cur.random;
				cur = cur.next.next;
			}
		}
		
		// seperate both original and cloned LL
		
		Node original = head;
		Node copy = head.next;
		temp = copy;
		
		while(original != null) {
			original.next = original.next.next;
			copy.next = (copy.next != null) ? copy.next.next : copy.next;
			original = original.next;
			copy = copy.next;
		}
		
		return temp;
	}

	private static void print(Node head) {
		Node ptr = head;
		while(ptr != null) {
			System.out.println("Data = " + ptr.data + ", Random = " + ptr.random.data);
			ptr = ptr.next;
		}
	}
}
