package Queue;

public class Circularqueuearray {
	int arr[];
	int front;
	int rear;
	int size;
	
	public Circularqueuearray(int size)
	{
		this.size=size;
		arr = new int[size];
		front=-1;
		rear=-1;
		
	}
	public void enqueue(int value)
	{
		if(front==0 && rear==arr.length-1 || rear==front-1)
		{
			System.out.println("Overflow");
		}
		else
		{
			if(front==-1 && rear==-1)
			{
				front++;
				rear++;
				arr[rear]=value;
			}
			else if(rear+1==size)
			{
				rear=0;
				arr[rear]=value;
			}
			else
			{
				rear++;
				arr[rear] = value;
				System.out.println("element inserted..");
			}
		}
	}
	public void dequeue()
	{
		if(front==-1 || rear==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			if(front==rear)
			{
				System.out.println("deleted.."+arr[front]);
				front=-1;
				rear=-1;
			}
			else if(front < rear)
			{
				System.out.println("deleted.."+arr[front]);
				front+=1;
			}
			else if( (rear<front) && (front<arr.length-1) )
			{
				System.out.println("deleted.."+arr[front]);
				front+=1;
			}
		}
	}
	public void traverse()
	{
		if(front==-1 || rear==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			if(rear<front)
			{
				for(int i=front ; i<=arr.length-1 ; i++)
				{
					System.out.print(arr[i]+" ");
				}
				for(int i=0 ; i<=rear ; i++)
				{
					System.out.print(arr[i]+" ");
				}
			}
			else
			{
				for(int i=front ; i<=rear ; i++)
				{
					System.out.print(arr[i]+" ");
				}
			}
		}	
		}
	}


