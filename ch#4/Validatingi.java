import java.util.Scanner;
public class Validatingi
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int q=1;
do
{System.out.print("\nPlease Enter A Number 1 Or 2\n");
q=input.nextInt();
}
while(q!=1  && q!=2 );
}}