package product.books.toys;

public class Toys extends Product{
	public Toys(String productName, int stock) {
		super();
		this.productName = productName;
		this.stock = stock;
	}
	public Toys(String productUID,float price,String productDesc) {
		this.productUID = productUID;
		this.price=price;
		this.productDesc = productDesc;
	
	}
	
	public void orderBy(String productName,int qty) {
		if(stock>qty)
		{
			discount();
			dispInfo();
		}
		else
		{
			System.out.println("Out Of Stock");
		}
	}
	int age;
	public double discount()
	{
		if(age>=2 && age<=4)
		{
			billAmt=price*0.15;
		}
		else if(age>=4 && age<=5)
		{
			billAmt=price*0.05;	
		}
		else
		{
			billAmt=price;
		}
		return billAmt;
	}
	
}
