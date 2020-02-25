package Queue;

import java.util.Scanner;

public class MainpriorityLinked {

	public static void main(String[] args)
	{
		PriorityQueuewithlinked obj = new PriorityQueuewithlinked();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("\nPress 1 for enqueue.");
		System.out.println("Press 2 for dequeue.");
		System.out.println("Press 3 for traverse.");
		System.out.println("Press 4 for exit.");
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.println("Element and priority.");
				int d=sc.nextInt();
				int p=sc.nextInt();
				Node n1 = new Node(d,p);
				obj.enqueue(n1);
				break;
			}
			case 2:
			{
				obj.dequeue();
				break;
			}
			case 3:
			{
				obj.traverse();
				break;
			}
			case 4:
			{
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println("Wrong choice");
				break;
			}
		}
		}
	}

}
