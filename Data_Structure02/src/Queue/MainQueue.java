package Queue;

import java.util.Scanner;

public class MainQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circularqueuearray obj = new Circularqueuearray (4);
		while(true)
		{
			System.out.println("\nPress 1 for insert.");
			System.out.println("Press 2 for delete.");
			System.out.println("Press 3 for traverse.");
			System.out.println("Press 4 for exit.");
			System.out.println("Enter choice ");
			int c=sc.nextInt();
			switch(c)
			{
			case 1:
				System.out.println("Enter the element in queue: ");
				int value = sc.nextInt();
				obj.enqueue(value);
				break;
			case 2:
				obj.dequeue();
				break;
			case 3:
				obj.traverse();
				break;
			case 4:
				System.exit(0);
				break;
			}
		}
		// TODO Auto-generated method stub

	}

}
