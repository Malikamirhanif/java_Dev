import java.util.Scanner;
public class Palindrome
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int l,n,d,r=0;
System.out.print("\nPlease Enter Number\n");
n=input.nextInt();
l=n;
do
{d=n%10;
r=(r*10)+d;
n=n/10;
}
while(n != 0);
if(r==l)
{System.out.print("\nYes Palindrome  Number\n");
}
else
{System.out.print("\nNot Palindrome Number\n");
}
}}