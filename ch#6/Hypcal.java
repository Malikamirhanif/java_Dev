import java.util.Scanner;
public class Hypcal
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
		double s,so,h;
System.out.print("\nEnter Base\n");
s=input.nextDouble();
System.out.print("\nEnter Perpendicular\n");
so=input.nextDouble();
h=hyp(s,so);
System.out.printf("\nHypotenous  Is %f\t",h);
}
public static double hyp (double a,double b)
{double ho;
ho=Math.sqrt(a*a)+Math.sqrt(b*b);
return ho;
}
		
		
}