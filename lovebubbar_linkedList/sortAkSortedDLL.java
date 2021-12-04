package lovebubbar_linkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class sortAkSortedDLL {
	public static class Node{
		int data;
		Node next, prev;
		Node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}

	private static Node head;
	
	public static void main(String args[]) {
		sortAkSortedDLL s = new sortAkSortedDLL();
		s.push(8);
		s.push(56);
		s.push(12);
		s.push(2);
		s.push(6);
		s.push(3);
		
		  int k = 2;
		  
	    System.out.println("Original Doubly linked list:");
	    s.printList(head);
	 
	    Node sortedDLL = s.sortAKSortedDLL(head, k);
	    System.out.println("");
	    System.out.println("Doubly Linked List after sorting:");
	    s.printList(sortedDLL);
		
	}
	
	class compareNode implements Comparator<Node>{
		public int compare(Node n1, Node n2) {
			return n1.data-n2.data;
		}	
	}
	
	private Node sortAKSortedDLL(Node head, int k) {
		if(head == null) {
			return head;
		}
		PriorityQueue<Node> pq = new PriorityQueue<Node>(new compareNode());
		
		for(int i = 0 ; head != null && i <= k; i++) {
			pq.add(head);
			head = head.next;
		}
		
		Node newHead = null;
		Node temp = null;
		
		while(!pq.isEmpty()) {
			if(newHead == null){
				newHead = pq.peek();
				newHead.prev = null;
				temp = newHead;
			}else {
				temp.next = pq.peek();
				pq.peek().prev = temp;
				temp = pq.peek();
			}
			
			pq.poll();//remove element 2 in this case
			
			if(head != null) {
				pq.add(head);
				head = head.next;
			}
		}
		temp.next = null;
		return newHead;
	}

	private static void printList(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
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
