package DE_Queue;

public class MainDE_Queue {

	public static void main(String[] args) 
	{
		DE_Queue obj = new DE_Queue(5);
	    obj.insertfront(10);
	    // obj.insertfront(14);
	    obj.insertrear(20);
	    obj.insertrear(30);
	    obj.insertrear(40);
	    obj.insertrear(50);
	    // obj.insertrear(60);
	    //obj.insertfront(15);
	    System.out.println("print all the data ");
	    obj.display();
	    System.out.println("\ndelete from front");
	    obj.removefront();
	    obj.removefront();
	    System.out.println("delete from rear");
	    obj.removerear();
	    System.out.println("insert new value at rear ");
	    obj.insertrear(90);
	    System.out.println("print the data");
	    obj.display();
	  }
	}
