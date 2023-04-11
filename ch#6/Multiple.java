import java.util.Scanner;
public class Multiple
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int a=0,b=0,c=0;
System.out.print("\nEnter Two Numbers\n");
a=input.nextInt();
b=input.nextInt();
c=mul(a,b);
if(c==1)
System.out.print("\nYES\n");
else
System.out.print("\nNO\n");
}
public static int mul(int x ,int y)
{if(y%x==0 || x%y==0)
return 1;
else
return 0;
}
}