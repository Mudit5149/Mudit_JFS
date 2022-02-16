package generics;

public class Employee {
	int id;
	String name,department;
	double salary;
	
	public Employee(int id,String name,String department,double salary){
		this.id=id;
		this.department=department;
		this.name=name;
		this.salary=salary;
	}
	public void displayDetails() {
		System.out.println("Employee details:"+"\nId="+id+"Name="+name+"Department="+department+"Salary="+salary);
		
		
	}

}




