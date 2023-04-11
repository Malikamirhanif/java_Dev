import java.util.Scanner;
public class CmdArgs
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int arr[];
if(args.length <=0)
{System.out.println("\nPlease Re-Enter Command\n");
}
else
{
int c=Integer.parseInt(args[0]);
arr=new int[c];

System.out.println("\nEnter Values\n");
for(int i=0;i<arr.length;i++)
arr[i]=input.nextInt();
System.out.println("\nYou Enter Values\n");
for(int i=0;i<arr.length;i++)
System.out.printf("\n%d",arr[i]);
}
}}