
public class Account3
{private int  bal;
public Account3(int b)
{bal=b;
}
public void withDraw (int a)
{if(a<=bal)
	{bal=bal-a;
	}
	else
	{System.out.print("Exceed Limit");
	}
}
public int get ()
{return bal;
}


}