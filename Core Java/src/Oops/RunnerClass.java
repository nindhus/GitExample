package Oops;

public class RunnerClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee E1 = new Employee();
E1.Name="Mike";
E1.Empid=1000;
E1.Department="HR";
E1.Display();

Employee E2 = new Employee("Jack",1001,"Finance");
E2.Display();

Bank B = new Bank();
B.AccountBalance();

int Bal = B.GetBalance();

System.out.println("The Balance is " + B.GetBalance());
System.out.println("The Balance is " +Bal);

BOABank B1 = new BOABank();
B1.CCBalance();
B1.AccountBalance();

B1.AccountNum = 100;

OverLoadingExample obj = new OverLoadingExample();
int RecArea = obj.GetArea(3,6);
int SqArea = obj.GetArea(7);

System.out.println("Area of the Rectangle is"+ RecArea);
System.out.println("Area of the Square is"+ SqArea);

//over ridding example

	}

}
