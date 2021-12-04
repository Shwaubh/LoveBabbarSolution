package lovebubbar_linkedList;

public class multiply2LL {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String args[]) {
		 Node first = new Node(9);
		 first.next = new Node(4);
		 first.next.next = new Node(6);
         System.out.print("First List is: ");
         printList(first);
		
         Node second = new Node(8);
         second.next = new Node(4);
         System.out.print("Second List is: ");
         printList(second);
         
         System.out.print("Result is: ");
         System.out.println(multiplyTwoLists(first, second));
	}

	private static long multiplyTwoLists(Node first, Node second) {
		long N = 1000000007;
		long num1 = 0;
		long num2 = 0;
		while(first != null) {
			num1 = (num1*10 + first.data) % N;
			first = first.next;
		}
		while(second != null) {
			num2 = (num2*10 + second.data) % N;
			second = second.next;
		}
		
		return (num1*num2) % N;
	}

	private static void printList(Node head) {
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
	}
}
