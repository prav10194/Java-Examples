class Node
{
	int value;
	Node next;
	
	public Node()
	{
		value=0;
		next=null;
	}
	
	public Node(int value,Node next)
	{
		this.value=value;
		this.next=next;
	}
	
	public String toString()
	{
		return value + "";
	}
}

public class LinkedList {
	
	public static void main(String[] args)
	{
		Node ns=new Node(1,null);
		Node ns12=new Node(2,null);
		Node ns14=new Node(3,null);
		Node ns16=new Node(4,null);
		ns.next=ns12;
		ns12.next=ns14;
		ns14.next=ns16;
		ns16.next=null;
		
		Node start=ns;
		while(start!=null)
		{
			System.out.println(start);
			start=start.next;
		}
		System.out.println();
	}

}
