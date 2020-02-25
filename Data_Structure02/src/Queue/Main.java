
package Queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Queuewitharray obj = new Queuewitharray(5);
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Press 1 for insert.");
		System.out.println("Press 2 for delete element.");
		System.out.println("Press 3 for peak.");
		System.out.println("Press 4 for print.");
		System.out.println("Press 5 for delete queue.");
		System.out.println("Press 6 for exit.");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
		{
			System.out.println("Enter element: ");
			int s=sc.nextInt();
			obj.enqueue(s);
			break;
		}
		case 2:
		{
			obj.dequeue();
			break;
		}
		case 3:
		{
			obj.peakinqueue();
			break;
		}
		case 4:
		{
			obj.printqueue();
			break;
		}
		case 5:
		{
			obj.deletequeue();
			break;
		}
		case 6:
		{
			System.exit(0);
		}
		default:
			System.out.println("Wrong Choice");
		}
		}
	}

}
