import java.util.Scanner;
public class Esc
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int h=1;
while(h != 0)
{int r=0,e=0,s=0;
	System.out.print("\nPlease Enter Hours\n");
h=input.nextInt();
System.out.print("\nPlease Enter Hourly Rate\n");
r=input.nextInt();
if(h>40)
{e=h-40;
e=e*(r/2);
s=((40*r)+e);
}
else
{s=40*r;
}
System.out.printf("\nSalary IS %d\n",s);
}

}}