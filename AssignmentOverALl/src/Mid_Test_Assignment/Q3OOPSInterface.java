
package Mid_Test_Assignment;

interface Finaniciable
{
	void deposite();
	void withdraw();
	default void show()
	{
		System.out.println("Welcome to the Finance Department");
	}
}

abstract class Bank
{
	abstract void bankInfo();
	Bank()
	{
		System.out.println("Welocome to Bank");
	}
}

class RBI extends Bank implements Finaniciable
{
	@Override
	void bankInfo() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to RBI BANK");

	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Deposite Section");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to withdraw Section");

	}

	
	
}

public class Q3OOPSInterface {

	public static void main(String[] args) {
		// 3. Write a Java code to demonstrate how you will use two interfaces and one abstract class in another class.
		Bank b=new RBI();
//		b.bankInfo();
		Finaniciable f=new RBI();
		f.show();
		RBI s=new RBI();
		s.bankInfo();
		s.deposite();
		s.withdraw();
		

	}

}
