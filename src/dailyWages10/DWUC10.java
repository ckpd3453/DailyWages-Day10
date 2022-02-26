package dailyWages10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Company {
	ArrayList<Integer> Wage = new ArrayList<Integer>();
	ArrayList<String> Wages = new ArrayList<String>();

	@Override
	public String toString() {
		return "Company [Wage=" + Wage + ", Wages=" + Wages + "]";
	}
	//method to calculate employee wage
	void check() {
		
		int totalsalary = 0;
		int totalEmpHr = 0;
		int totalWorkingDays = 0;
		int empHrs = 0;
		int finalsalary = 0;

		System.out.println("enter company name ");

		Scanner p2 = new Scanner(System.in);
		String x = p2.nextLine();
		System.out.println(x);
		Wages.add(x);
		// System.out.println(Wages);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee rate Per hour of your Company :");
		int empRatePerHr1 = scanner.nextInt();

		System.out.println("Enter the total number of working days of your Company:");
		int numOfWorkingDays1 = scanner.nextInt();

		System.out.println("Enter the total number of hours of your Company in a month:");
		int maxRateInMonth1 = scanner.nextInt();

		while (totalEmpHr <= maxRateInMonth1 && totalWorkingDays <= numOfWorkingDays1) {
			totalWorkingDays++;
			double randomCheck = Math.floor(Math.random() * 10) % 3;
			int i = (int) randomCheck;
			switch (i) {
			case 2:
				// System.out.println("Employee is FullTime");
				empHrs = 8;
				break;
			case 1:
				// System.out.println("Employee is PartTime");
				empHrs = 4;
				break;
			case 0:
				// System.out.println("Employee is Absent");
				empHrs = 0;
				break;
			}

			totalEmpHr = totalEmpHr + empHrs;

		}
		//Total Salary in a month
		totalsalary = totalEmpHr * empRatePerHr1;
		finalsalary += totalsalary;

		Wage.add(finalsalary);
		System.out.println(Wages);
		System.out.println(Wage);
	}

}

public class DWUC10 {

	public static void main(String[] args) {
		System.out.println("How many company data you want to Enter ");

		Company mahindra = new Company();

		Scanner p1 = new Scanner(System.in);
		p1.toString();
		int noOfCompanys = p1.nextInt();

		for (int i = 1; i <= noOfCompanys; i++) {

			mahindra.check();

		}
	}

}
