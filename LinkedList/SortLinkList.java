package LinkedList;
import java.util.Scanner;

class node2{
	int data;
	node2 next;
	
	node2 insert(node2 head,int data){
		node2 newnode = new node2();
		newnode.data = data;
		newnode.next = null;
		
		if(head == null) {
			head=newnode;
			return head;
		}
		
		node2 temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		return head;
	}
	
	void display(node2 head) {
		node2 temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	node2 Sort(node2 head) {
		node2 temp = head;
		while(temp!=null) {
			node2 i = temp.next;
			while(i!=null) {
				if(temp.data>i.data) {
					int t = temp.data;
					temp.data = i.data;
					i.data = t;
				}
				i=i.next;
			}
			temp=temp.next;
		}
		return head;
		
	}
	
}
public class SortLinkList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		node2 head = null;
		node2 obj = new node2();
		
		int n = sc.nextInt();
		while(n-->0) {
			head = obj.insert(head, sc.nextInt());
		}
		obj.display(head);
		
		System.out.println();
		head = obj.Sort(head);
		obj.display(head);
	}
}

