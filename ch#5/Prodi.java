import java.util.Scanner;
public class Prodi
{public static void main(String[] args)
{Scanner input=new Scanner(System.in);
int i=0,n=1;
for( i=1;i<=15;i++)
{
if(i%2 !=0)
{n=n*i;
}
}
System.out.printf("\nProduct Is %d\n",n);
}
}