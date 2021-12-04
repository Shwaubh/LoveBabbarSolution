package lovebubbar_linkedList;

public class flattenALinkedList {
	public static class Node{
		int data;
		Node right, down;
		Node(int data){
			this.data = data;
			right = null;
			down = null;
		}
	}

	Node head;
	
	public static void main(String args[]) {
		flattenALinkedList L = new flattenALinkedList();
		 L.head = L.push(L.head, 30);
		 L.head = L.push(L.head, 8);
		 L.head = L.push(L.head, 7);
		 L.head = L.push(L.head, 5);
		 
		 L.head.right = L.push(L.head.right, 20);
	     L.head.right = L.push(L.head.right, 10);
	     
	     L.head.right.right = L.push(L.head.right.right, 50);
	     L.head.right.right = L.push(L.head.right.right, 22);
	     L.head.right.right = L.push(L.head.right.right, 19);
	     
	     L.head.right.right.right = L.push(L.head.right.right.right, 45);
	     L.head.right.right.right = L.push(L.head.right.right.right, 40);
	     L.head.right.right.right = L.push(L.head.right.right.right, 35);
	     L.head.right.right.right = L.push(L.head.right.right.right, 20);
	     
	     L.head = L.flatten(L.head);
	     
	     L.printList();
	}

	private void printList() {
		Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.down;
        }
        System.out.println();
	}

	private Node flatten(Node head) {
		if (head == null || head.right == null)
            return head;
		head.right = flatten(head.right);
		head = merge(head, head.right);
		return head;
	}

	private Node merge(Node head, Node right) {
		if (head == null) {
			return right;
		}
	
		if(right == null) {
			return head;
		}
		
		Node result;
		
		if (head.data < right.data)
        {
            result = head;
            result.down =  merge(head.down, right);
        }
		else
        {
            result = right;
            result.down = merge(head, right.down);
        }
		
		result.right = null; 
        return result;
	}

	private Node push(Node head, int data) {
		Node new_node = new Node(data);
		new_node.down = head;
		head = new_node;	
		return head;
	}	
}
