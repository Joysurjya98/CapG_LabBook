package com.cg.eis.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employeee;

public class EmployeeDemo extends Employeee {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String,Employeee> hmap = new HashMap<String,Employeee>();
		HashMap<String,Integer> alist = new HashMap<String,Integer>();
		int choice;
		char ch='y';
		while(ch=='y') {
			System.out.print("\n1. Add Employee Details\n2. Display Employee Details Corresponding to Insurance Scheme\n3. Delete Employee Details\nEnter your choice : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.print("Enter the number of employees : ");
			int numOfEmp = sc.nextInt();
			Employeee emp[]=new Employeee[numOfEmp];
			for(int i=0;i<numOfEmp;i++) {
				emp[i]=new Employeee();
			}
			for(int i=0;i<numOfEmp;i++) {
				System.out.println("Enter id : ");
				emp[i].id = sc.nextInt();
				System.out.println("Enter name : ");
				emp[i].name = sc.next();
				System.out.println("Enter salary : ");
				emp[i].salary = sc.nextDouble();
				System.out.println("Enter designation : ");
				sc.nextLine();
				emp[i].designation = sc.nextLine();
				hmap.put(emp[i].getInsuranceScheme(), emp[i]);
				alist.put(emp[i].getInsuranceScheme(),emp[i].id);
				System.out.println();
			}
			System.out.println("Hash Map after adding employee details :\n");
			for(HashMap.Entry<String, Employeee> m : hmap.entrySet()) {
				System.out.println(m.getValue());
			}
			break;
			case 2 : if(hmap.size()<1) {
				System.out.println("\nNo data found...");
			}else {
				System.out.print("Enter the insurance scheme : ");
				sc.nextLine();
				String ins_scheme = sc.nextLine();
				System.out.print("The employee details for the given insurance scheme are :\n ");
				for(HashMap.Entry<String, Employeee> m : hmap.entrySet()) {
					if(m.getKey().equalsIgnoreCase(ins_scheme))
						System.out.println(m.getValue());
				}
			}
			break;
			case 3 :if(hmap.size()<1) {
				System.out.println("\nNo data found...");
			}else {
				System.out.print("Enter the id of the employee you want to delete : ");
				int id = sc.nextInt();
				for(Map.Entry<String,Integer> m : alist.entrySet()) {
					if(m.getValue()==id)
						hmap.remove(m.getKey());
				}
				System.out.println("Hash Map after deleting employee details :\n");
				for(HashMap.Entry<String, Employeee> m : hmap.entrySet()) {
					System.out.println(m.getValue());
				}
			}
			break;
			default : System.out.println("Enter correct choice (1-3)....");
			}
			System.out.println();
			System.out.print("Do you want to continue?(y/n) ");
			ch = sc.next().charAt(0);
		}
		sc.close();
	}


}
