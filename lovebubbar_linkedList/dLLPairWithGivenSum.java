package lovebubbar_linkedList;

public class dLLPairWithGivenSum {
	public static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data = data;
			next = prev = null;
		}
	}

	private static Node head;
	
	public static void main(String args[]) {
		dLLPairWithGivenSum d = new dLLPairWithGivenSum();
		d.push(9);
		d.push(8);
		d.push(6);
		d.push(5);
		d.push(4);
		d.push(2);
		d.push(1);
		
		printDLL(head);
		
		int x = 7;
		CheckTheSum(head, x);
	}

	private static void CheckTheSum(Node head, int d) {
		System.out.println();
		Node first = head;
		Node second = head;
		
		while(second.next != null) {
			second = second.next;
		}
		
		boolean found = false;
		
		while(first != second && second.next != first) {
			if((first.data + second.data) == d) {
				found = true;
				System.out.println("("+first.data+","+second.data+")");
				first = first.next;
				second = second.prev;
			}else {
				if((first.data + second.data) < d) {
					first = first.next;
				}else {
					second = second.prev;
				}
			}
		}
		
		if(found == false) {
			System.out.println("No pair found");
		}
	}

	private static void printDLL(Node head2) {
		while(head2 != null) {
			System.out.print(head2.data +" ");
			head2 = head2.next;
		}
	}

	private void push(int data) {
		Node newNode = new Node(data);
		newNode.prev = null;
		newNode.next = head;
		
		if(head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}
}
