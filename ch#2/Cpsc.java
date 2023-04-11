import java.util.Scanner;
public class Cpsc
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	int tm,cg,s=0,am=0,p=0,to,r;
	System.out.printf("\nEnter Total Miles\n");
	tm=input.nextInt();
	System.out.printf("\nEnter Cost Per Gallon\n");
	cg=input.nextInt();
	System.out.printf("\nEnter Average Miles Per Gallon\n");
	am=input.nextInt();
	System.out.printf("\nEnter Parking Fee\n");
	p=input.nextInt();
	System.out.printf("\nEnter Toll\n");
	to=input.nextInt();
	r=tm/am;
	r=r*cg;
	s=r+p+to;
	System.out.printf("\nTotal Cost Is %d",s);
	}

}