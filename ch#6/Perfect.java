import java.util.Scanner;
public class Perfect
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int  a,b,c,d;
System.out.print("\nEnter One Numbers\n");
a=input.nextInt();
d=perfect (a);
if(d==1)
System.out.print("Answer Is\t YES");
if(d==0)
System.out.print("Answer Is\t NO");
}
public static int perfect (int a)
{int h,s=0,so,m;
so=a;
m=a;
h=a/2;
for(int i=1;i<=h;i++)
{if(m%i==0)
{s=s+i;
}
}
if(s==so)
return 1;
else
return 0;
}

}