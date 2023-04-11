import java.util.Scanner;
public class DiaCirc
{public static void main(String[] args)
{double n1,a,e,c;
Scanner input=new Scanner(System.in);
System.out.print("\nEnter  Numbers\n");
n1=input.nextInt();
System.out.printf("\nArea Is  %d",3.14*n1*n1);
System.out.printf("\nCircumference Is  %d",2*3.14*n1);
System.out.printf("\nDiameter Is  %d",2*n1);
}
}