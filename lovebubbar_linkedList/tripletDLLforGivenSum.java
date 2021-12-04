package lovebubbar_linkedList;

public class tripletDLLforGivenSum {
	public static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}
	private static Node head;
	
	public static void main(String args[]) {
		tripletDLLforGivenSum t = new tripletDLLforGivenSum();
		t.push(9);
		t.push(8);
		t.push(6);
		t.push(5);
		t.push(4);
		t.push(2);
		t.push(1);
		
		int x = 17;
		
		printDLL(head);
		
		System.out.print("Count = " + countTriplets(head, x));	
	}	

	private static int countTriplets(Node head, int x) {
		
		if (head == null) {
			return 0;
		}
		Node cur, first, last;

		last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		int count = 0;
		
		for(cur = head; cur != null ; cur = cur.next) {
			first = cur.next;
			count = count + countPairs(first, last, x-cur.data); 
		}
		return count;
	}

	private static int countPairs(Node first, Node last, int x) {
		int count = 0;
		while(first != null && last != null && first != last && last.next != first) {
			if((first.data + last.data) == x) {
				count++;
				first = first.next;
				last = last.prev;
			}else if((first.data + last.data) < x) {
				first = first.next;
			}else {
				last = last.prev;
			}
		}
		return count;
	}

	private static void printDLL(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	private void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		newNode.prev = null;
		
		if(head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}
}
