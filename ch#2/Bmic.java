import java.util.Scanner;
public class Bmic
{public static void main(String[] args)
	{Scanner input=new Scanner(System.in);
	int b,w,h;
	System.out.printf("\nEnter Weight\n");
	w=input.nextInt();
	System.out.printf("\nEnter Height\n");
	h=input.nextInt();
	b=w/(h*h);
	System.out.printf("\nBody Mass Index Is %d",b);
	
	}

}