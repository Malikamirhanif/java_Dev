import java.util.Scanner;
public class Parkchar
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
double  h,i,c;
System.out.print("\nEnter Number Of Hours\n");
h=input.nextDouble();
c=calculateCharges(h);
System.out.printf("\nCharges Are %.2f \n",c);}
public static double calculateCharges(double n)
{double ch=2;
if(n<=3)
{ch=2;
}
else if(n==12)
{ch=10;
}
else 
{int j;
for(j=3;j<n;j++)
{ch=ch+0.5;
}
}
return ch;
}
}