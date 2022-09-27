package LinkedList;

class Node{
	String data;
	Node next; //node class ka object next
	
	Node insertEnd(Node head,String data){
		
		Node newnode = new Node(); //nayi node banani
		newnode.data=data; //nayi node ke data mei data dala
		newnode.next=null; //nayi node ke next mei null dala
		
		if(head==null) { //check kiya ki khai head pe null to nahi hai 
			head = newnode; //nayi node ka reference daal do head pe
			return head; //return karado head
		}
		
		Node temp = head;
		while(temp.next!=null) { //jabtak head/temp ke next mei null na aa jaye
			temp = temp.next; //next mei agali node ka reference daala
		}
		temp.next=newnode; //last mei pahuchne pe newnode ka refernce daal do
		return head;
	}
	
	void display(Node head) {
		Node temp = head; //head kharab na ho jaye
		while(temp!=null) { //jab tak temp mei null na aye 
			System.out.print(temp.data+"->");
			temp = temp.next; //ye line na likhe toh infinite chlega
		}
	}
	
	Node insertBeg(Node head,String data) {
		Node newnode = new Node(); //pehele node banayege
		newnode.data=data;
		newnode.next=null; 
		
		//head ke baad newnode ko jaodege
		newnode.next=head; //nayi node ke next pe head daal denge
		head = newnode; //head mei newnode ka reference daal do
		return head;
	}

	Node insertAfter(Node head,String data,String str) {
		Node newnode = new Node();
		newnode.data=data;
		newnode.next=null;
		Node temp = head;
		while(temp.next != null) { //akhir tak traverse karege 
			if(str.equals(temp.data)) {
				break;
			}
			temp = temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		return head;
	}

	Node insertBefore(Node head,String data,String str) {
		
		if(str.equals(head.data)) {
			head = insertBeg(head, data);
			return head;
		}
		
		Node newnode = new Node();
		newnode.data=data;
		newnode.next=null;
		Node temp=head;
		while(temp!=null) {
			if(str.equals(temp.next.data )) { //temp ki next ke data ko match kiya 
				break;
			}
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		return head;
	}
	
	void reversePrint(Node head) {
		if(head == null) {
			return;
		}
		else {
			reversePrint(head.next);
			System.out.print(head.data+"->");
		}
	}
	
	void reverse(Node head) {
		Node current = head;
		Node previous = null;
		Node nexte = null;
		while(current!=null) {
			nexte=current.next;
			current.next=previous;
			previous = current;
			current = nexte;
		}
		head = previous;
		display(head);
	}
	
	Node deleteEnd(Node head) {
		if(head.next==null) {
			return null;		
		}
		Node temp = head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next = null;
		return head;
	}
	
	Node deleteAtGiven(Node head,String str) {
		Node temp = head;
		if(head.next==null) {
			head = null;
			return head;
		}
		while(!temp.next.data.equals(str)) {
			temp=temp.next;
		}
		temp.next = temp.next.next;
		return head;
	}
	
	Node swap(Node head,String a,String b) {
		Node temp=head;
//		while(temp.next!=null) {
//			String t = temp.data;
//			temp.data=temp.next.data;
//			temp.next.data=t;
//			temp=temp.next;
//		}
		while(temp!=null) {
			if(temp.data.equals(a)) {
				temp.data=b;
			}
			else if(temp.data.equals(b)) {
				temp.data=a;
			}
			temp = temp.next;
		}
		
		return head;
	}
	
}
public class SinglyListList {
	public static void main(String[] args) {
		Node head = null; //survat mei head mei null hota hai
		Node obj = new Node();
		head = obj.insertEnd(head,"suman");//head ko info aa gayi hai ki nayi node chipak gayi hai
		obj.display(head);
//		System.out.println();
//		head = obj.insertEnd(head,"tuman");
//		obj.display(head);
//		System.out.println();
//		head = obj.insertBeg(head,"duman");
//		obj.display(head);
//		System.out.println();
//		head = obj.insertAfter(head,"luman", "duman");
//		obj.display(head);
//		System.out.println();
//		head = obj.insertBefore(head, "kuman", "luman");
//		obj.display(head);
//		System.out.println();
//		obj.reversePrint(head);
//		System.out.println();
//		obj.reverse(head);
//		
//		System.out.println();
//		head=obj.deleteEnd(head);
//		obj.display(head);
		System.out.println();
		head=obj.deleteAtGiven(head, "suman");
		obj.display(head);
		head = obj.swap(head,"suresh","rakesh");
		obj.display(head);
		
	}
}
