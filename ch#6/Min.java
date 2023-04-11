import java.util.Scanner;
public class Min
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
double a=0,b=0,c=0,mn=0;
System.out.print("\nEnter Three Floating Numbers\n");	
a=input.nextDouble();
b=input.nextDouble();
c=input.nextDouble();
mn=Math.min(a,Math.min(b,c));
System.out.printf("\nSmallest Is %.2f\n",mn);
}
}