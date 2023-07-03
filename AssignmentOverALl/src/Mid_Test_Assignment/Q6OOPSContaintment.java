package Mid_Test_Assignment;

class Watchman
{
	private String name;
	private int experience;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class Building
{
	private int srno;
	private String name;
	private int noFlats;
	private String landmark;
	private Watchman w;
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoFlats() {
		return noFlats;
	}
	public void setNoFlats(int noFlats) {
		this.noFlats = noFlats;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public Watchman getW() {
		return w;
	}
	public void setW(Watchman w) {
		this.w = w;
	} 
	
}


public class Q6OOPSContaintment {

	public static void main(String[] args) {
		// 6.Create class   Building with srNo,name,noOfFlats,landmark and Watchman. 
//		Watchnan class has name,experience,age. Implement containment using setter method. Both classes should be fully encapsulated classes. 
//		Write required methods in class and create two Building objects and show details of it.
		
		Building b=new Building();
		b.setSrno(1);
		b.setName("SurveComplex");
		b.setNoFlats(150);
		b.setW(new Watchman());
		b.getW().setName("Vilas");
		b.getW().setAge(52);
		b.getW().setExperience(12);
		
		System.out.println(b.getSrno()+"  "+b.getName()+"  "+b.getNoFlats()+"  "+b.getW().getName()+"  "+b.getW().getAge()+"  "+b.getW().getExperience());

	}

}
