
public class Invoice3
{private String number;
private String description;
private int quantity;
private int price;
public Invoice3 (String n,String d,int  q,int p)
{number=n;
description=d;
quantity=q;
price=p;
}
public void set (String n1,String d1,int q1,int p1)
{number=n1;
description=d1;
quantity=q1;
price=p1;

}
public int geta ()
{return price*quantity;
}
public void get ()
{System.out.printf("\nItem Name %s\nItem Description %s\n Quantity %d\n Price %d",number,description,quantity,price);
}
}