package oops;

public class Manager extends Employees {
	public double incentive;
	public double salary;
	public double totalSalary;
	Manager(double i,double s) {
		incentive=i;
		salary=s;
		
	}
	public double getTotalSalary() {
		totalSalary=salary+incentive;
		return salary+incentive;
	}

}

	


