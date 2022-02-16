package oops;

public class Labour extends Employees{
	public double salary;
	public double overtime;
	public double totalSalary;
	public Labour(double s,double o) {
		salary=s;
		overtime=o;
	}
	
	public double getTotalSalary() {
		totalSalary=salary+(overtime*100);
		return totalSalary;
	}


}
