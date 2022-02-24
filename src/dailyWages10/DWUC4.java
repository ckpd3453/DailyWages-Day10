package dailyWages10;

class Attend {

	void wages() {
		// variable
		int empRatePerHr = 20;
		int empHrs = 0;
		double salary = 0;

		// Random check for attendance
		double randomCheck = Math.floor(Math.random() * 10) % 3;
		int i = (int) randomCheck;

		// switch case
		switch (i) {

		case 2:
			System.out.println("Employee is FullTime");
			empHrs = 8;
			break;
		case 1:
			System.out.println("Employee is PartTime");
			empHrs = 4;
			break;
		case 0:
			System.out.println("Employee is Absent");
			empHrs = 0;
			break;
		}

		// print employee salary
		salary = empHrs * empRatePerHr;
		System.out.println("Employee Salary" + salary);
	}
}

public class DWUC4 {

	public static void main(String[] args) {
		// creating an object
		Attend emp = new Attend();

		// calling method
		emp.wages();
	}

}
