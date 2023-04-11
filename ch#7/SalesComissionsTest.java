
import java.util.Scanner;
public class SalesComissionsTest
{public static void main(String[] args)
{int e[];
e=new int[10];
Scanner input=new Scanner(System.in);
for (int i=0;i<e.length;i++)
{System.out.println("Enter Data");
e[i]=input.nextInt();
}
SalesComissions obj=new SalesComissions(e);
obj.calc(e);
}}