package dailyWages10;

class Emp {
	public void wages() {
		// Variables
		int RatePerHr = 20;
		int numofworkingDays = 20;
		int empHrs = 0;
		double DailyWages = 0;
		double TotalSalary = 0;
		int day = 1;

		// Loop for Monthly Calculation
		for (day = 1; day <= numofworkingDays; day++) {
			// random check daily basis for a month
			double empCheck = Math.floor(Math.random() * 10) % 3;
			int i = (int) empCheck;

			// for calculating hours worked each day
			switch (i) {
			case 1:
				empHrs = 8;
				break;
			case 2:
				empHrs = 4;
				break;
			case 0:
				System.out.println("Absent");
				break;
			}
			// calculating daily wage
			DailyWages = (RatePerHr * empHrs);

			// adding every days salary
			TotalSalary = (TotalSalary + DailyWages);
			System.out.println(DailyWages);
		}
		System.out.println("Total Salary" + TotalSalary);
	}

}

public class DWUC5 {

	public static void main(String[] args) {
		// Creating object
		Emp total = new Emp();

		// calling Method
		total.wages();
	}

}
