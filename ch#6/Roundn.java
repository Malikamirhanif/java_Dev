import java.util.Scanner;
public class Roundn
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
		double no,t;
System.out.print("\nEnter Number To Round Off To Integers\n");
no=input.nextDouble();;
t=rni(no);
System.out.printf("\nValue After Round Off Is %f\t",t);
System.out.print("\nEnter Number To Round Off To Tenth\n");
no=input.nextDouble();;
t=rnt(no);
System.out.printf("\nValue After Round Off Is %f\t",t);
System.out.print("\nEnter Number To Round Off To Hundreds\n");
no=input.nextDouble();
t=rnh(no);
System.out.printf("\nValue After Round Off Is %f\t",t);
System.out.print("\nEnter Number To Round Off To Thousands\n");
no=input.nextDouble();
t=rnth(no);
System.out.printf("\nValue After Round Off Is %f\t",t);
}
public static double rni (double n)
{
double g;
g=Math.floor (n+0.5);
return g;
}
public static double rnt (double n)
{
double g;
g=Math.floor ((n*10)+0.5)/10;
return g;
}
public static double rnh (double n)
{
double g;
g=Math.floor ((n*100)+0.5)/100;
return g;
}
public static double rnth (double n)
{
double g;
g=Math.floor ((n*1000)+0.5)/1000;
return g;
}
		
}