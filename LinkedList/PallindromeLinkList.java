package LinkedList;

import java.util.*;

class node3{
	String data;
	node3 next;
	node3 insert(node3 head,String data){
		node3 newnode = new node3();
		newnode.data = data;
		newnode.next = null;

		if(head == null) {
			head=newnode;
			return head;
		}

		node3 temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		return head;
	}

	void display(node3 head) {
		node3 temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	boolean check(node3 head) {
		node3 temp=head;
		Stack<String> stk = new Stack<>();
		while(temp!=null) {
			stk.push(temp.data);
			temp = temp.next;
		}
		temp = head;
		while(temp!=null) {
			if(!temp.data.equals(stk.peek())) {
				return false;
			}
			temp = temp.next;
			stk.pop();
		}
		return true;	
	}
	
	
}
public class PallindromeLinkList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		node3 head = null;
		node3 obj = new node3();

		int n = sc.nextInt();
		while(n-->0) {
			head = obj.insert(head, sc.next());
		}
		obj.display(head);
		
		System.out.println(obj.check(head));
		
		
	}
}
