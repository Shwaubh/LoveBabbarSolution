package lovebubbar_linkedList;

public class intersectionPointoftwoLL {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	private static Node head1;
	private static Node head2;
	public static void main(String args[]) {
		intersectionPointoftwoLL list = new intersectionPointoftwoLL();
		list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);
        
        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);
        
        Node ptr1 = head1;
        Node ptr2 = head2;
        int c1=0,c2=0;
        
        while(ptr1 !=  null) {
        	c1++;
        	ptr1 = ptr1.next;
        }
        
        while(ptr2 !=  null) {
        	c2++;
        	ptr2 = ptr2.next;
        }
        
        ptr1 = head1;
        ptr2 = head2;
        
        if(c1 > c2) {
        	int d = c1-c2;
        	for(int i = 0; i < d; i++) {
        		ptr1 = ptr1.next;
        	}
        }else {
        	int d = c2-c1;
			for(int i = 0; i < d; i++) {
			    ptr2 = ptr2.next;		
			}
        }
        
        while(ptr1.data != ptr2.data) {
        	ptr1 = ptr1.next;
        	ptr2 = ptr2.next;
        }
        
        if(ptr1 != null) {
        	System.out.print("Intersection point is : " + ptr1.data);
        }
        
 
	}
}
