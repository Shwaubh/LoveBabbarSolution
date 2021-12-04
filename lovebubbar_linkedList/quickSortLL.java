package lovebubbar_linkedList;

public class quickSortLL {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static void main(String args[]) {
		quickSortLL q = new quickSortLL();
		q.addNode(8);
		q.addNode(2);
		q.addNode(5);
		q.addNode(10);
		q.addNode(1);
		q.addNode(12);
		q.addNode(4);
		
		
		System.out.println("Before :");
		q.print(head);
		
		Node n = head;
		while(n.next != null) {
			n = n.next;
		}
		
		q.sort(head, n);
		
		System.out.println("\nAfter : ");
		q.print(head);
			
	}
	private void sort(Node start, Node end) {
		if(start == null || start == end) {
			return;
		}
		System.out.println("\nstart : "+start.data);
		Node pivot_prev = partition(start, end);
		System.out.println(start.data +" "+pivot_prev.data);
		sort(start, pivot_prev);
		
		if(pivot_prev != null && pivot_prev == start) {
			sort(pivot_prev.next, end);
		}
		else if(pivot_prev != null && pivot_prev.next != null){
			sort(pivot_prev.next.next, end);
		}
		
	}
	private Node partition(Node start, Node end) {
		if(start == end || start == null || end == null) {
			return start;
		}
		Node pivot_prev = start;
		Node cur = start;
		int pivot = end.data;
		while(start != end) {
			if(start.data < pivot) {
				pivot_prev = cur;
				int temp = cur.data;
				cur.data = start.data;
				start.data = temp;
				cur = cur.next;
			}
			start = start.next;
		}
		int temp = cur.data;
		cur.data = end.data;
		end.data = temp;
		return pivot_prev;
	}
	private void print(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	private static Node head;
	private void addNode(int data) {
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
