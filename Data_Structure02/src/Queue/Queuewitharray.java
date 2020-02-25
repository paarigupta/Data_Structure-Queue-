package Queue;

public class Queuewitharray
{
	int arr[];
	int top;
	int beginning;
	public Queuewitharray(int size)
	{
		arr = new int[size];
		top=-1;
		beginning=-1;
		
	}
	public boolean isqueuefull()
	{
		if(top == arr.length-1)
			return true;
		else
			return false;
	}
	public boolean isqueueempty()
	{
		if(beginning == -1)
			return true;
		else
			return false;
	}
	public void enqueue(int val)
	{
		if(arr == null)
		{
			System.out.println("Create queue first");
		}
		else if(isqueuefull())
		{
			System.out.println("Overflow");
		}
		else if(isqueueempty())
		{
			beginning++;
			top++;
			arr[top]=val;
		}
		else
		{
			top++;
			arr[top]=val;
		}
	}
	public void dequeue()
	{
		if(isqueueempty())
			System.out.println("Underflow");
		else
		{
			System.out.println("Deleted element is :"+arr[beginning]);
			arr[beginning]=0;
			beginning++;
			if(beginning>top)
			{
				top = beginning=-1;
			}
		}
	}
	public void printqueue()
	{
		if(arr == null)
		{
			System.out.println("No queue.");
		}
		else if(isqueueempty())
		{
			System.out.println("Underflow");
		}
		else
		{
			System.out.print("Queue is: ");
			for(int i=beginning ; i<=top ; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public void peakinqueue()
	{
		if(isqueueempty())
			System.out.println("Underflow");
		else 
		{
			if(beginning==-1)	
			{
			System.out.println("No element.");
			}
			else
			{
			System.out.println("");
			System.out.println("Element is : "+arr[beginning]);
			}
		}
	}
	public void deletequeue()
	{
		arr=null;
		System.out.println("queue deleted.");
	}
}
