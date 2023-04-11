import java.util.Scanner;
public class Deob
{public static void main (String[] args)
{int n=0,c=0,t=0,r=0,f=1,j=0,l=1,m=1,s=0;
Scanner input=new Scanner (System.in);
System.out.print("\nEnter Binary Number\n");
n=input.nextInt();
t=n;
for(int i=0;t !=0;i++)
{l=1;
r=t%10;
t=t/10;
c++;
}
System.out.printf("\nDigits Are %d\n",c);
for( j=0;n!=0;j++)
{l=1;
f=n%10;
if (j==0)
{m=f*1;
}
else 
{for(int k=1;k<=j;k++)
{l=l*2;
}}
m=f*l;

s=s+m;
n=n/10;
}
System.out.printf("\nDecimal Equivalance is %d\n",s);
}}