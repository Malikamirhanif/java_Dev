public  class Date3
{
	private int dd;
	private int mm;
	private int yy;
	public Date3(int a,int b,int c)
	{dd=a;
	mm=b;
	yy=c;
	}
	public void set (int a1,int b1,int c1)
	{dd=a1;
	mm=b1;
	yy=c1;
	}
	public void disp ()
	{System.out.printf("\n%d / %d  / %d\n",dd,mm,yy);
	}
	
}
