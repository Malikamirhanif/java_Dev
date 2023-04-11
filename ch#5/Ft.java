import java.util.Scanner;
public class Ft
{public static void main(String[] args)
	{Double to,t,h,f,c,e,hc,v;
Scanner input=new Scanner(System.in);
System.out.print("\nEnter Expecces For Housing\n");
h=input.nextDouble();
System.out.print("\nEnter Expecces For Food\n");
f=input.nextDouble();
System.out.print("\nEnter Expecces For Clothing\n");
c=input.nextDouble();
System.out.print("\nEnter Expecces For Transport\n");
t=input.nextDouble();
System.out.print("\nEnter Expecces For Education\n");
e=input.nextDouble();
System.out.print("\nEnter Expecces For Health Care\n");
hc=input.nextDouble();
System.out.print("\nEnter Expecces For Vacations\n");
v=input.nextDouble();
to=h+f+c+t+e+hc+v;
t=to*0.30;
System.out.printf("\nTotal Expences Are %.2f\t",to);
System.out.printf("\nTax is %.2f\n",t);
}}