package oops;

public class EmployeeSalary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager(40000.0,40000.0);
		Labour l=new Labour(10000,9);
		System.out.println(m.getTotalSalary());
		System.out.println(l.getTotalSalary());
		System.out.println("Total salary amount="+(m.getTotalSalary()+l.getTotalSalary()));
	}

}


