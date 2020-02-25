package Queue;
class Element
{
	int data;
	int priority;
	Element(int data,int priority)
	{
		this.data=data;
		this.priority=priority;
		
	}
}
public class Priorityqueuewitharray 
{
	int front;
	int rear;
	Element arr[];
	public Priorityqueuewitharray (int size)
	{
		front=rear=-1;
		arr=new Element[size];
	}
	public boolean isEmpty()
	{
		return front==-1;
	}
	public boolean isfull()
	{
		return rear==arr.length-1;
	}
	public void enqueue(Element newelement)
	{
		int i;
		if(arr == null) {
			System.out.println("Not created");
			return;
		}
		else if(isfull())
		{
			System.out.println("Overflow");
		}
		else if(isEmpty())
		{
			front++;
			rear++;
			arr[rear]=newelement;	
		}
		else
		{
			for(i=rear ; i>=front ; i--)
			{
				if(newelement.priority < arr[i].priority) {
					arr[i+1] = arr[i];
				}
				else {
					break;
				}
			}
			arr[++i]=newelement;
			rear++;
		}
	}
	public void dequeue() 
	{
		if(isEmpty())
		{
			System.out.println("empty queue");
		}
		else 
		{
			front++;
			if(front>rear)
			{
				front=rear=-1;
			}
		}
	}
	public void traverse()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(int j=front ; j<=rear ; j++)
			{
				System.out.print(arr[j].data+" ");
			}
			System.out.println();
		}
	}
		
	
		
}
