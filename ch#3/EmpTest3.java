import java.util.Scanner;
public class EmpTest3
{public static void main(String[] args)
	{	double salo;
	Scanner input=new Scanner(System.in);
	Emp3 obj=new Emp3 ("Malik","Aamir",1200.78);
	obj.get();
	System.out.print("\nEnter Salary\n");
	salo=input.nextDouble();
	obj.set("Malik","Moiz",salo);
obj.inc();
System.out.print("\n\n\nAfter Increment\n\n\n");
	obj.get();
	}
}