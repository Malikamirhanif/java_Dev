import java.util.Scanner;
public class Multiple
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int n1,n2;
System.out.print("\nEnter One Nmuber\n");
n1=input.nextInt();
n2=input.nextInt();
if(n1%n2==0)
{
System.out.print("\nYES");
}
else
{System.out.print("\nNo");
}
}
}