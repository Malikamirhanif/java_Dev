import java.util.Scanner;
public class Prime
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int a,b,c,d;
System.out.print("\nEnter One Numbers\n");
a=input.nextInt();
d=po(a);
if(d==1)
System.out.printf("Answer Is\t Yes");
if(d==0)
System.out.print("Answer is\tNO");
pr ();
}
public static int po (int x)
{int s=x,c=0;
for(int i=1;i<=s;i++)
{if(x%i==0)
{c++;
}
}
if(c==2)
return 1;
else
return 0;
}
public static void pr ()
{int c=0,j;
for(int i=2;i<=10000;i++)
{for( j=1;j<=10000;j++)
{if(i%j==0)
c++;
}
if(c==2)
{System.out.printf("\nThis Number %d Is  Prime\t",i);
}
c=0;
j=1;
}
}
}