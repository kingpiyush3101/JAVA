package LinkedList;

class node4{
	int data;
	node4 prev,next;
	node4 insert(node4 head,int data) {
		node4 newnode = new node4();
		newnode.data=data;
		newnode.next=null;
		newnode.prev=null;
		if(head==null) {
			newnode.prev=head;
			head=newnode;
			return head;
		}
		node4 temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		newnode.prev=temp;
		temp.next=newnode;
		return head;
	}
	
	void display(node4 head) {
		node4 temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
}

public class DoublyLinkList {
	public static void main(String[] args) {
		node4 head = null;
		node4 obj = new node4();
		head = obj.insert(head, 11);
		head = obj.insert(head, 12);
		head = obj.insert(head, 13);
		obj.display(head);
		
		
	}
}
