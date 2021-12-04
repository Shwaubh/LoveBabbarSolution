package lovebubbar_linkedList;

public class mergeSortLL {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static void main(String args[]) {
		mergeSortLL li = new mergeSortLL();
		li.push(15);
        li.push(10);
        li.push(5);
        li.push(20);
        li.push(3);
        li.push(2);
        
        System.out.println("Before : ");
        
        printll(head);
        
        System.out.println("\nAfter : ");
        Node head1 = mergeSort(head);
        printll(head1);
	}
	private static Node mergeSort(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node middle = getMiddle(head);
		Node nextofmiddle = middle.next;
		middle.next = null;
		 
		Node left = mergeSort(head);
		Node right = mergeSort(nextofmiddle);
		
		Node sortedList = mergeSorted(left, right);
 		return sortedList;
	}
	
	
	private static Node mergeSorted(Node left, Node right) {
		Node result = null;
		if(left == null) {
			return right;
		}
		if(right == null) {
			return left;
		}
		
		if(left.data <= right.data) {
			result = left;
			result.next = mergeSorted(left.next, right);
		}else {
			result = right;
			result.next = mergeSorted(left, right.next);
		}
		return result;
	}
	
	private static Node getMiddle(Node head) {
		if(head == null) {
			return head;
		}
		Node slow = head, fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	private static void printll(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	private static Node head;
	
	private void push(int data) {
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
