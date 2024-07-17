package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<Employee>();
		System.out.println("Employee Database: ");
		System.out.println("How many employees:");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println("Employe #" + (i+1) + " data:");
			System.out.println("Outsourced (y/n)?");
			char outsourced = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (outsourced == 'y') {
				System.out.println("Additional charge: ");
				double addCharge = sc.nextDouble();
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, addCharge);
				list.add(employee);
			}
			else {
				Employee employee = new Employee(name, hours, valuePerHour);
				list.add(employee);
			}			
		}
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}

}
