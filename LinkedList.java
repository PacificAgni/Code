class Node{
    int data;
    Node next;
    Node(int value)
    {
        this.data=value;
    }
}
public class Main
{
	public static void main(String[] args) {
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		Node curr=head;
		while(curr!=null)
		{
		    System.out.print(curr.data+"->");
		    curr=curr.next;
		}
		System.out.print("NULL");
		System.out.println();
		
		Node prev=null;
		Node current=head;
		while(current!=null)
		{
		    Node temp=current.next;
		    current.next=prev;
		    prev=current;
		    current=temp;
		}
		
		while(prev!=null)
		{
		    System.out.print(prev.data+"->");
		    prev=prev.next;
		}
		System.out.print("NULL");
		System.out.println();
	}
}
