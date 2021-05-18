package com.cg.eis.service;

import com.cg.eis.bean.Employee;

import java.util.Scanner;
interface EmployeeService {
    void getempDetails();
    void insuranceScheme();
    void displayempDetails();
}

public class Service extends Employee implements EmployeeService{
	Employee emp1 = new Employee();

    public void getempDetails() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter Employee id: ");
        emp1.id = sc1.nextInt();
        System.out.print("Enter Employee name: ");
        emp1.name = sc2.nextLine();
        System.out.print("Enter Employee salary: ");
        emp1.salary = sc1.nextInt();
        System.out.print("Enter Employee designation: ");
        emp1.designation = sc2.nextLine();
        System.out.print("Enter Insurance Scheme: ");
        emp1.insuranceScheme = sc2.nextLine();

        sc1.close();
        sc2.close();
    }

    public void insuranceScheme() {
        System.out.println("Insufficient data. Insurance conditions are not provided");
    }

    public void displayempDetails() {
        System.out.println("Employee id: " + emp1.id);
        System.out.println("Employee name: " + emp1.name);
        System.out.println("Employee salary: " + emp1.salary);
        System.out.println("Employee designation: " + emp1.designation);
        System.out.println("Employee insurance scheme: " + emp1.insuranceScheme);
    }

}
