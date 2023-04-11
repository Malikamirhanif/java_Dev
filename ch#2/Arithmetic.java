import java.util.Scanner;
public class Arithmetic 
{
public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int n1;
int n2;
int sum,dif,pro,div;
System.out.println("Please Enter A Number");
n1=input.nextInt();
System.out.println("Please Enter A Number");
n2=input.nextInt();
sum=n1+n2;
dif=n1-n2;
pro=n1*n2;
div=n1/n2;
System.out.printf("Sum Is %d\n",sum);
System.out.printf("Difference Is %d\n",dif);
System.out.printf("Product is %d\n",pro);
System.out.printf("Division Is%d\n",div);

}


}