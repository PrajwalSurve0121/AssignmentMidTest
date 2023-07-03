package Mid_Test_Assignment;

class Person
{
	int addharNo;
	String name;
	int age;
	int mnum;
	
	public Person(int addharNo, String name, int age, int mnum) {
		this.addharNo = addharNo;
		this.name = name;
		this.age = age;
		this.mnum = mnum;
	}
	
	public Person(int addharNo, String name, int age)
	{
		this.addharNo = addharNo;
		this.name = name;
		this.age = age;
	}
	
	public Person(int addharNo,int age, int mnum)
	{
		this.addharNo = addharNo;
		this.age = age;
		this.mnum = mnum;
	}
	
	public Person(String name, int age, int mnum)
	{
		this.name = name;
		this.age = age;
		this.mnum = mnum;
	}
	

	@Override
	public String toString() {
		return "Person [addharNo=" + addharNo + ", name=" + name + ", age=" + age + ", mnum=" + mnum + "]";
	}
	
	
}


public class Q4Constructor {

	public static void main(String[] args) {
		// 4. Show Constructor overloading and  chaining  in Person class. 
//		Person class contains addharNo,name,age,mobile. Demonstrate use of 'this' keyword where ever possible.
		
		Person p=new Person(15000,"Nayan",20,2545646);
		Person p1=new Person(213546, "Ram", 36543423);
		Person p2=new Person(12351, 22, 3544210);
		Person p3=new Person("Karan", 23, 354421131);
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		

	}

}
