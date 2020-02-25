package Queue;
class Node
{
	int data;
	int priority;
	Node next;
	public Node(int d , int p)
	{
		data=d;
		priority=p;
		next=null;
	}
}

public class PriorityQueuewithlinked 
{
	Node front;
	Node rear;
	public PriorityQueuewithlinked()
	{
		front=null;
		rear=null;
	}
	public void enqueue(Node newnode)
	{
		if(front==null || newnode.priority<front.priority)
		{
			newnode.next=front;
			front=newnode;
		}
		else
		{
			Node temp=front;
			while(temp.next!=null && temp.next.priority<= newnode.priority)
			{
				temp = temp.next;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
	}
	public void dequeue()
	{
		Node temp = front;
		if(front==null)
		{
			System.out.println("Empty queue");
		}
		else
		{
			temp=temp.next;
		}
	}
	public void traverse()
	{
		if(front==null)
			System.out.println("Empty queue");
		else
		{
			Node temp=front;
			while(temp!= null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}			
		}
	}
}
