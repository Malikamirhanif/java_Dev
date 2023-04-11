import java.util.Scanner;
public class Gwfq
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
		int q1,q2,q3;
int t=0;
for(int i=1;i<=5;i++)
{
System.out.print("\n (Q.1) We Should Avoid Throwing Outside\n");
System.out.print("(1) Garbage\n");
System.out.print("(2) Water\n");
System.out.print("\n(3)Bread\n");
System.out.print("\n(4) Fruit\n");
q1=input.nextInt();
switch(q1)
{case 1:
t++;	
}
System.out.print("\n (Q.2) We Should Avoid From\n");
System.out.print("(1) Water\n");
System.out.print("(2) Smoking\n");
System.out.print("\n(3)Brushing\n");
System.out.print("\n(4) Fruit\n");
q2=input.nextInt();
switch(q2)
{case 2:
t++;	
}
System.out.print("\n (Q.3) We Should Avoid Expose In Air\n");
System.out.print("(1) Smoke\n");
System.out.print("(2) Breath\n");
System.out.print("\n(3) Light\n");
System.out.print("\n(4) Fruit\n");
q3=input.nextInt();
switch(q3)
{case 3:
t++;	
}}
if(t>=10)
{System.out.print("\nOutstanding Performance\n");
}
else if(t>=7)
{System.out.print("\nBest Performance\n");
}
else if(t>=5)
{System.out.print("\nSaticfactory Performance\n");
}
else
{System.out.print("\nPoor Performance\n");
}
}}