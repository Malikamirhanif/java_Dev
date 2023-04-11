import java.util.Scanner;
public class Clc
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int an,bb,ti,tc,al,nb;
System.out.print("\nPlease Enter Account Number\n");
an=input.nextInt();
System.out.print("\nPlease Enter Beginning Balance\n");
bb=input.nextInt();
System.out.print("\nPlease Enter Total Items Cost\n");
ti=input.nextInt();
System.out.print("\nPlease Enter Total Credit\n");
tc=input.nextInt();
System.out.print("\nPlease Enter Allowable Limit\n");
al=input.nextInt();
nb=bb+ti-tc;
System.out.printf("\nNew Balance Is %d\n",nb);
if(nb>al)
	System.out.print("\nExceeded Allowable Limit\n");
}
}