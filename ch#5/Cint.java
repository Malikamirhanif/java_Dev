import java.util.Scanner;
public class Cint
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
	double i=0,in=0,e=0,p=0,y=1,a=0;
System.out.print("\nEnter Principle Amount\n");
p=input.nextDouble();
	for(i=5;i<=10;i++)
	{e=i/100;
a=p*Math.pow(1.0+e,y);
System.out.printf("\nInterest At %.0f Percent is %.2f\n",i,a);
	}
}}