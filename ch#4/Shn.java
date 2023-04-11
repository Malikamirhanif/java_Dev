import java.util.Scanner;
public class Shn
{
public static void main(String[] args)
{
Scanner input=new Scanner (System.in);
int i=0,n=0,max1=0,max2=0,t=0;
System.out.printf("\nEnter Numbers\n");
for(i=0;i<5;i++)
{n=input.nextInt();
if (n>max1)
{t=max1;
max1=n;
}
else
{
t=n;
}
if(t>max2 && t<max1)
max2=t
;}
System.out.printf("\nMax %d\t",max1);
System.out.printf("\nMax2 %d\t",max2);
}
}