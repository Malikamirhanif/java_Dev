import java.util.Scanner;
public class InvoiceTest3
{public static void main(String[] args)
	{String name;
	String dic;
	int qnt;
	int pr,t;
	Scanner input=new Scanner(System.in);
	Invoice3 obj=new Invoice3 ("Lever","Handle",1,24);
	obj.get();
	System.out.print("\nPlease Enter Item Quantity\n");
	qnt=input.nextInt();
	System.out.print("\nPlease Enter Item Price\n");
	pr=input.nextInt();
	obj.set("Screw","Khrpacha",qnt,pr);
	obj.get();
t=obj.geta();
System.out.printf("\nAmount Is %d\n",t);
	}
}