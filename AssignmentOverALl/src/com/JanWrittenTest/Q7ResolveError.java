package com.JanWrittenTest;

class Parent 
{ 
	private int i;



	public Parent() {
		System.out.println("I will Call"); 
	}



   public Parent(int i) {
	   this.i=i;
   }
   void display()
   {
	   System.out.println(i);  
   }

}

class Child extends Parent {

	public Child() {

		super(10);
	}

	public Child(int i) {

	}

}

public class Q7ResolveError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p=new Child();
		p.display();
		
//		Child c=new Child();
//		c.display();
		
		

	}

}
