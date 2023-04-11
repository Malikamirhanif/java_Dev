import java.util.Scanner;
public class Wpg
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
double p=0,r=0,i=0,s=0,e=0;
System.out.print("\nEnter Population\n");
p=input.nextDouble();
s=p;
System.out.print("\nEnter Rate\n");
r=input.nextDouble();
for( i=1;i<=75;i++)
{e=p*(r/100);
s=s+e;
System.out.printf("\nAt The End Of %.0f  Year Is %.2f\n",i,s);
}

}
}