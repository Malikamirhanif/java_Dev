import java.util.Scanner;
public class Comparing 
{
public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int n1;
int n2;
int eq,l;
System.out.println("Please Enter A Number");
n1=input.nextInt();
System.out.println("Please Enter A Number");
n2=input.nextInt();
if(n1==n2)
{eq=1;
System.out.println("Equal");}
else if(n1>n2)
{l=n1;
System.out.printf("Larger Is %d\n",n1);
}
else
{l=n2;
System.out.printf("Larger Is %d\n",n2);
}
}

}