package Mid_Test_Assignment;

interface Depositarable
{
	void deposite();
	
	default void show()
	{
		System.out.println("Welcome to deposite Section");
	}
}

class SBI implements Depositarable
{

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to deposite section of SBI");
	}
	
}

class AXSIS implements Depositarable
{

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to deposite section of AXSIS");

	}
	
}

class COSMOS implements Depositarable
{

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to deposite section of COSMOS");

	}
	
}

public class Q1OOPS {

	public static void main(String[] args) {
		// 1. Write  interface containing both concrete and abstract methods, use this interface in three classes. 
//		Demonstrate Dynamic polymorphism in code.
		
		Depositarable d=new SBI();
		d.show();
		d.deposite();
		
		Depositarable m=new AXSIS();
		m.deposite();
		
		Depositarable n=new COSMOS();
		n.deposite();


		
		
		

	}

}
