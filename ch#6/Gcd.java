import java.util.Scanner;
public class Gcd
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int x,y;
System.out.print("\nEnter Two Numbers\n");
x=input.nextInt();
y=input.nextInt();
int g;
g=gcd(x,y);
System.out.printf("\nGreatest Common Divisior is %d\t",g);
}
public static int gcd (int a,int b)
{int i,max=0;
if(a>max)
max=a;
if(b>max)
max=b;
int v=0;
for(i=1;i<=max;i++)
{if(a%i==0&&b%i==0)
{if(i>v)
v=i
;}
}
return v;
}
}