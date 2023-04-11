import java.util.Scanner;
public class Sqrest
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
int s,so,h;
System.out.print("\nEnter Side\n");
s=input.nextInt();
hyp(s);
}
public static void hyp (int a)
{int ho=a;
for(ho=0;ho<a;ho++)
{for(int g=0;g<a;g++)

System.out.print("*");
System.out.print("\n");
}
}}