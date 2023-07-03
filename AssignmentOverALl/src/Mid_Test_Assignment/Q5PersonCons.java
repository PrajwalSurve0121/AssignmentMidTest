package Mid_Test_Assignment;

class Person1
{
	int addharNo;
	String name;
	int age;
	int mnum;
	
	public Person1(int addharNo, String name, int age, int mnum) {
		this.addharNo = addharNo;
		this.name = name;
		this.age = age;
		this.mnum = mnum;
	}
	
	public void display()
	{
		System.out.println("Person Details");
	}

	@Override
	public String toString() {
		return "Person1 [addharNo=" + addharNo + ", name=" + name + ", age=" + age + ", mnum=" + mnum + "]";
	}
}

class Employee extends Person1
{

	public Employee(int addharNo, String name, int age, int mnum) {
		super(523154, "Ram", 25, 3543543);
		// TODO Auto-generated constructor stub
	}
	
	public void displayEmployee()
	{
		System.out.println("Hello I am Ram "); 
	}
	
}

class Manager extends Employee
{

	public Manager(int addharNo, String name, int age, int mnum) {
		super(addharNo, name, age, mnum);
		// TODO Auto-generated constructor stub
	}
	
	public void displayMan()
	{
		System.out.println("I am Manager"); 
	}
	
}



public class Q5PersonCons {

	public static void main(String[] args) {
		//5. Show how constructors in inheritance works. Create Person class with addharNo,name,age,mobile and few methods init.
//		Use Person class in Employee class, and further Employee class in used in Manager class with some properties and methods.   
		Manager m=new Manager(21, null, 22, 252354);

		System.out.println(m);
		m.display();
		m.displayEmployee();
		m.displayMan();
		
		

	}

}
