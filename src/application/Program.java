package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int numberOfEmployee = sc.nextInt();
		sc.nextLine();
		
		List<Employee> emp = new ArrayList<Employee>();
				
		for (int i = 0; i < numberOfEmployee; i++) {
			
			System.out.println("Employee #"+(i+1)+" data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0); 
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			sc.nextLine();
			if (ch == 'y') {
				System.out.print("Additional charge:");
				double additionalCharge = sc.nextDouble();
				emp.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else 
				emp.add(new Employee(name, hours, valuePerHour));
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee c : emp) {
			System.out.println(c);
		}
		sc.close();
	}
}
