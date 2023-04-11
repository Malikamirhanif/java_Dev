import java.util.Scanner;
public class Mileage
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int d=1,g,i=1,j=1;
int  m,s=0,tm;
while (d != 0)
{System.out.print("\nPlease Enter Miles\n");
d=input.nextInt();
System.out.print("\nPlease Enter Gallons\n");
g=input.nextInt();
m=d/g;
System.out.printf("\nMileage For %d Trip Is %d\n",i,m);
s=s+m;
i=i+g;
j=j+1;}
tm=s/j;
System.out.printf("\nTotal Mileage Is %d\n",tm);

}}