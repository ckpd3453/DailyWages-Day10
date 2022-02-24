package dailyWages10;

class employee1 {

	// method
	void attendance() {
		int IsFullTime = 1;

		double empCheck = Math.floor(Math.random() * 10) % 2;

		// Equation check is present or not
		if (empCheck == IsFullTime) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}

public class DWUC1 {

	public static void main(String[] args) {
		// creating an object
		employee1 mark = new employee1();

		// calling method attendance
		mark.attendance();

	}

}
