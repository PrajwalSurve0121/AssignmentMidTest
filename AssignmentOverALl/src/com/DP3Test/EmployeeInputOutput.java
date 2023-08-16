package com.DP3Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeInputOutput {

	static Scanner sc = new Scanner(System.in);
//	Employee e=new Employee();

	public void writeEmployee(File f) {
		try {
			if (f.exists()) {
				f.createNewFile();
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
				ArrayList<Employee> list = new ArrayList<>();

				for (int i = 0; i <= 2; i++) {
					System.out.println("Enter Employee id: ");
					int eid = sc.nextInt();
					System.out.println("Enter Employee NAme");
					String ename = sc.next();
					System.out.println("Enter Employee Salary");
					float sal = sc.nextFloat();
					System.out.println("Enter Employee Code");
					int code = sc.nextInt();

					list.add(new Employee(eid, ename, sal, code));

				}
				list.add(new Employee(5,"Vastal",6500,120));
				out.writeObject(list);
				System.out.println("=-=--=-=-=-=-=-=-=-=Added=-=-=-=-=-=-=-=-=-=-=-=-");
				out.close();
			} else {
				System.out.println("File Does Not Exist........");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void readEmployee(File f) {
		try {
			if (f.exists()) {
				ObjectInputStream oin = new ObjectInputStream(new FileInputStream(f));

				ArrayList<Employee> e = (ArrayList<Employee>) oin.readObject();
//				System.out.println(e);
				Iterator<Employee> it = e.iterator();
				while (it.hasNext()) {
					Employee em = it.next();
					System.out.println(em);
				}

				oin.close();
			} else {
				System.out.println("File Does Not Exist");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeInputOutput e = new EmployeeInputOutput();

		File f = new File("F:\\JavaWork\\MyFileHandling\\Employee2.ser");
//		e.writeEmployee(f);
		e.readEmployee(f);

	}

}
