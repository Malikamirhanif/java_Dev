import java.util.Scanner;
public class Sepd
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
	int s,so,h,l;

System.out.print("\nEnter First Number\n");
s=input.nextInt();
System.out.print("\nEnter Second Number\n");
so=input.nextInt();
h=q(s,so);
System.out.printf("\nQuotient Is %d\t",h);
h=r(s,so);
System.out.printf("\nReminder is %d\t",h);
System.out.print("\nEnter A Number To Seperate Its Digits\n");
l=input.nextInt();
so1(l);
}
public static int q (int a,int b)
{int ho;
return (a/b);
}
public static int r(int a,int b)
{return((a%b));
}
public static void so1 (int  a)
{int c=0,d,e;
int rev=0;
do
{d=a%10;
rev=(rev*10)+d;
a=a/10;
}
while(a!=0);
a=rev;
e=a;
while(a!=0)
{d=a%10;
a=a/10;
c++;
}
for(int j=0;j<c;j++)
{d=e%10;
e=e/10;
System.out.printf("  %d",d);
}
}
	
}