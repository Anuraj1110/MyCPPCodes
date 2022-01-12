class Employee{
	public int employeeId;
	private double basicSalary;
	private double totalSalary;
	public Employee(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public double calculateTotalSalary(int bonusPercent) {
		//line 22
        this.totalSalary = this.basicSalary * (1 + (double)bonusPercent / 100);

		return totalSalary;
	}
}

public class infytq {
	public static void main(String[] args) {
		Employee employee = new Employee(2150);
		employee.employeeId = 101;
		employee.calculateTotalSalary(8);
		// line 32
        System.out.println("Employee Id: " + employee.employeeId + ", Total salary: " + employee.getTotalSalary());
	}
}
