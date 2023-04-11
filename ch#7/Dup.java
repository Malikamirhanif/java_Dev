import java.util.Scanner;
public class Dup
{
public static void main(String[] args)
{int arr[]=new int[5];
Scanner input=new Scanner(System.in);
int i;
for( i=0;i<arr.length;i++)
{System.out.println("\nEnter Number");
int n=input.nextInt();
if(n>=10 && n<=100)
{for(int j=0;j<=i;j++)
{if(arr[j] != n)
arr[i]=n;
}
}
else
{i-=1;
}
}
System.out.println("\n\nYou Entered");
for(int j=0;j<5;j++)
{System.out.print("\t");
System.out.println(arr[j]);
}
}
}