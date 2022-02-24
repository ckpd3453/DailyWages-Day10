package dailyWages10;

class Attendance {

	void wages() {

		// variable declaration
		int isPartTime = 1;
		int isFullTime = 2;
		int empRatePerHr = 20;
		int empHrs;
		int salary;

		// random to check whether full time or part time or absent
		double randomCheck = Math.floor(Math.random() * 10) % 3;

		// Conditions to find employee hrs
		if (isFullTime == randomCheck) {
			System.out.println("Employee is FullTime");
			empHrs = 8;
		} else if (isPartTime == randomCheck) {
			System.out.println("Employee is PartTime");
			empHrs = 4;
		} else {
			System.out.println("Employee is Absent");
			empHrs = 0;
		}

		// Calculating Salary for number of Hrs
		salary = empHrs * empRatePerHr;
		System.out.println("Employee Salary" + salary);
	}
}

public class DWUC3 {

	public static void main(String[] args) {
		// creating an object
		Attendance emp = new Attendance();

		// Calling method to execute
		emp.wages();
	}

}
