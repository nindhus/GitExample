package Oops;

public class Employee {
	public String Name;
	public int Empid;
	public String Department;
	
	public Employee() {
		System.out.println("Default Cons");
	}
	public Employee(String P1,int p2, String P3) {
		Name = P1;
		Empid=p2;
		Department=P3;
	}
	public void Display() {
	System.out.println(Name);
	System.out.println(Empid);
	System.out.println (Department);
}
}
	




