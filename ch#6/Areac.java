import java.util.Scanner;
public class Areac
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
	double r=0,e=0;
	System.out.print("\nEnter Radius Of Circle\n");
	r=input.nextDouble();
	e=area(r);
	System.out.printf("\nArea Is %.2f\n",e);
	}
	public static double area(double x)
	{return 3.142*x*x;
	}
}