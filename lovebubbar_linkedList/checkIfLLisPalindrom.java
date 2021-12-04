package lovebubbar_linkedList;

import java.util.Stack;

public class checkIfLLisPalindrom {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static void main(String args[]) {
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(3);
		Node six = new Node(2);
		Node seven = new Node(1);
		
		one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
		
		boolean condition = isPalindrome(one);
        System.out.println("isPalidrome :" + condition);
	}
	private static boolean isPalindrome(Node head) {
		Node temp = head;
		boolean  ispal = false;
		Stack<Integer> s = new Stack<Integer>();
		while(temp != null) {
			s.push(temp.data);
			temp = temp.next;
		}
		
		while(head != null) {
			int i = s.pop();
			if(head.data == i) {
				ispal = true;
			}else {
				ispal = false;
				break;
			}
			head = head.next;
		}
		return ispal;
	}
}
