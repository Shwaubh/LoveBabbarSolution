package lovebubbar_linkedList;
//a program to detect a loop, remove a loop and find the start point of loop
//i love millie
import java.util.HashSet;

public class detect_a_loop {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static Node head;
	public static void main(String args[]) {
		detect_a_loop a = new detect_a_loop();
		a.head = new Node(50);
		a.head.next = new Node(20);
		a.head.next.next = new Node(15);
		a.head.next.next.next = new Node(4);
		a.head.next.next.next.next = new Node(10);
		
		a.head.next.next.next.next.next = a.head.next.next;
					
		if(detectLoop(head)) {
			System.out.println("Loop Found");
			Node startofloop = FindStartOfLoop(head);
			System.out.println("Loop started here : " + startofloop.data);
			detectandRemoveLoop(head);	
			printList(head);
			if(detectLoop(head)) {
				System.out.println("\nLoop Found Again");
			}else {
				System.out.println("\nLoop Removed");
			}
		}else {
			System.out.println("Loop Not Found");
		}		
	}
	
	public static Node FindStartOfLoop(Node head) {
		HashSet<Node> s = new HashSet<Node>();
		while(head != null) {
			if(s.contains(head)) {
				return head;
			}else {
				s.add(head);
				head = head.next;
			}
		}
		return null;
	}

	public static void printList(Node head) {
		 while (head != null) {
           System.out.print(head.data + " ");
           head = head.next;
	     }
	}
	
	private static void detectandRemoveLoop(Node head) {
		HashSet<Node> hs = new HashSet<Node>();
		Node temp = null;
		while(head != null) {
			if(hs.contains(head)) {
				temp.next = null;
				return;
			}else {
				hs.add(head);
				temp = head;
				head = head.next;
			}
		}
		return;
	}
	private static boolean detectLoop(Node head) {
		HashSet<Node> s = new HashSet<Node>();
		while(head != null) {
			if(s.contains(head)) {
				return true;
			}else {
				s.add(head);
				head = head.next;
			}
		}
		return false;
	}
}
