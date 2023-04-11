import java.util.Scanner;
public class AccountTest3
{public static void main(String[] args)
	{int n,m;
	Scanner input=new Scanner(System.in);
	Account3 obj=new Account3(100);
	System.out.print("Please Enter Amount\n");
	n=input.nextInt();
	obj.withDraw(n);
m=obj.get();
	System.out.printf("\nBalance is %d",m);
	}
}