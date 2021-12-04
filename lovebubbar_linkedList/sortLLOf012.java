package lovebubbar_linkedList;

public class sortLLOf012 {
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static Node head;
	
	public static void main(String args[]) {
		sortLLOf012 s = new sortLLOf012();
		s.add(1);
		s.add(1);
		s.add(0);
		s.add(2);
		s.add(0);
		s.add(2);
		s.add(0);
		s.add(1);
		
		System.out.println("Linked list Before :\n");
		printLL(head);
		
		sort(head);
		
		System.out.println("Linked list After Sort :\n");
		printLL(head);
		
	}

	private static void sort(Node head2) {
		int count[] = {0,0,0};
		Node cur = head;
		
		while(cur != null) {
			count[cur.data]++;
			cur = cur.next;
		}
		
		int i = 0;
		Node ptr = head;
		
		while(ptr != null) {
			if(count[i] == 0) {
				i++;
			}else {
				ptr.data = i;
				count[i]--;
				ptr = ptr.next;
			}
		}
	}

	private static void printLL(Node head2) {
		while(head2 != null) {
			System.out.print(head2.data+" ");
			head2 = head2.next;
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
