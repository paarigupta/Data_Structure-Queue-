package Queue;

public class Mainpriority {

	public static void main(String[] args)
	{
		Element E1 = new Element(2,5);
		Element E2 = new Element(24,2);
		Element E3 = new Element(21,1);
		
		Priorityqueuewitharray obj = new Priorityqueuewitharray(5);
		obj.enqueue(E1);
		obj.enqueue(E2);
		obj.enqueue(E3);
		obj.traverse();
		obj.dequeue();
		obj.traverse();
	}

}
