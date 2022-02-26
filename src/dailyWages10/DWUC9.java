package dailyWages10;

import java.util.Random;
import java.util.Scanner;

public class DWUC9 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;

	
	//  Constructor with parameters required to calculate employee wage
	 
	public DWUC9(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	
	// Method to calculate employee wage
	 
	public void totalEmpWage() {
		Random random = new Random();
		int totalWorkingDays = 0;
		int totalWorkingHours = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		while (totalWorkingDays < numOfWorkingDays && totalWorkingHours < maxHoursPerMonth) {
			totalWorkingDays++;
			int empCheck = random.nextInt(3);
			int empHrs = 0;
			switch (empCheck) {

			case IS_PART_TIME -> empHrs = 4;

			case IS_FULL_TIME -> empHrs = 8;

			default -> empHrs = 0;

			}
			totalWorkingHours = empHrs + totalWorkingHours;
			empWage = empHrs * empRatePerHour;
			System.out.println("day " + totalWorkingDays + " = " + empWage);
			totalEmpWage = empWage + totalEmpWage;

		}
		System.out.println("salary of " + company + " employee is " + totalEmpWage);

	}

	public static void main(String[] args) {
		
		//User Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of companies");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter company name");
			String name = scanner.nextLine();
			sc.nextLine();
			System.out.println("Enter Rate per hour");
			int empRatePerHour = scanner.nextInt();
			System.out.println("Enter Working Days");
			int numOfWorkingDays = scanner.nextInt();
			System.out.println("Enter Max Allowed working hours");
			int maxWorkingHours = scanner.nextInt();
			
			System.out.println(name + "  " + empRatePerHour + "  " + numOfWorkingDays + "  " + maxWorkingHours);
			DWUC9 company = new DWUC9(name, empRatePerHour, numOfWorkingDays, maxWorkingHours); // Object

			company.totalEmpWage();// calling method
			scanner.close();
		}
	}

}
