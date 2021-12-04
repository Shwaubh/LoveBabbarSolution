package lovebubbar_linkedList;

public class deleteNodeGreaterRight {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	private static Node head;
	
	public static void main(String args[]) {
		deleteNodeGreaterRight d = new deleteNodeGreaterRight();
		 d.push(3);//12>15>10>11>5>6>2>3
	     d.push(2);
	     d.push(6);
	     d.push(5);
	     d.push(11);
	     d.push(10);
	     d.push(15);
	     d.push(12);
	     
	     System.out.println("Given Linked List");
	     d.printList();
	 
	     d.delLesserNodes();
	 
	     System.out.println("\nModified Linked List");
	     d.printList();
	}	

	private void delLesserNodes() {
		reverseList();
		_delLesserNodes();
		reverseList();
	}

	private void _delLesserNodes() {
		Node cur = head;
		Node maxNode = head;
		Node temp;
		
		while(cur != null && cur.next != null) {
			if(cur.data > cur.next.data) {
				temp = cur.next;
				cur.next = temp.next;
				temp = null;
			}else {
				cur = cur.next;
				maxNode = cur;
			}
		}
	}

	private void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	private void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	private void reverseList() {
		Node cur = head;
		Node next = null;
		Node prev = null;
		
		while(cur != null) {
			next = cur.next;
			cur.next = prev; 
			prev = cur;
			cur = next;
		}
		head = prev;
	}
}
