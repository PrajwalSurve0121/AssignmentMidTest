package Mid_Test_Assignment;
import java.util.*;
class Employee1
{
	int id;
	String name;
	int sal;
	
	public Employee1(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}

public class Q3EmployeeArray {

	public static void main(String[] args) {
		//  There is array of String having emp objects e.g.)
//s[]={{eid:1,enm:Tiya,sal:5000},{eid:2,enm:Siya,sal:8000},{eid:3,enm:Manasi,sal:5000}};
//Create  array and sort according to salary in descending order .
		
		Employee1 e[]=new Employee1[3];
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Employee Deatils");
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter Employee id");
			int eid=sc.nextInt();
			System.out.println("Enter Employee Name");
			String name=sc.next();
			System.out.println("Enter Employee Salary");
			int sal=sc.nextInt();
			
			e[i]=new Employee1(eid,name,sal);
		}
		
		for(Employee1 z:e)
		{
			System.out.println(z);
		}
		System.out.println("............................................................");
		
		for(int i=0;i<e.length;i++)
		{
			for(int j=i+1;j<e.length;j++)
			{
				if(e[i].sal<e[j].sal)
				{
					int temp=e[i].sal;
					e[i].sal=e[j].sal;
					e[j].sal=temp;
					
				}
			}
			System.out.println(e[i]);
		}
	}

}
