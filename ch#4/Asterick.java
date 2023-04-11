import java.util.Scanner;
public class Asterick
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int l;
System.out.print("\nPlease Enter Length Of Square\n");
l=input.nextInt();
for(int i=0;i<l;i++)
{for(int j=0;j<l;j++)
	{System.out.print("* ");
	}
System.out.print("\n");
}
}}