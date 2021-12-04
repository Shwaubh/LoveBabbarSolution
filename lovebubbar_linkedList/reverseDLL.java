package lovebubbar_linkedList;

import java.util.Stack;

public class reverseDLL {
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
		reverseDLL a = new reverseDLL();
		a.push(4);
		a.push(3);
		a.push(2);
		a.push(1);
		
		System.out.print("before : ");
		a.printDLL(head);
		
		a.reverse();
		
		System.out.print("\nAfter : ");
		a.printDLL(head);
	}

	private void reverse() {
		
//Uncomment to run through stack

//		Stack<Integer> s = new Stack<Integer>();
//		Node temp = head;
//		while(temp != null) {
//			s.push(temp.data);
//			temp = temp.next;
//		}
//		
//		temp = head;
//		while(temp != null) {
//			temp.data = s.pop();
//			temp = temp.next;
//		}
		
		Node temp = null;
		Node cur = head;
		
		while(cur != null) {
			temp = cur.prev;
			cur.prev = cur.next;
			cur.next = temp;
			cur = cur.prev;
		}
		
		System.out.println(temp.data);
		
		if (temp != null) {
            head = temp.prev;
        }
	}

	private void printDLL(Node node) {
		while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
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
