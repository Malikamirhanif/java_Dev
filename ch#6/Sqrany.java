import java.util.Scanner;
public class Sqrany
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int a=0;
char ch;
System.out.print("\nEnter Side Of Square\n");
a=input.nextInt();
shape(a);
}
public static void shape (int x)
{int i=0;
for(i=0;i<x;i++)
{for(int j=0;j<x;j++)
{System.out.print("*");
}
System.out.print("\n");
}
}
}