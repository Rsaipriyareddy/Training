package product.books.toys;

public class Books extends Product {
	
	public Books(String productName, int stock) {
		super();
		this.productName = productName;
		this.stock = stock;
	}
	public Books(String productUID,float price,String productDesc) {
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
	
	public double discount()
	{
		billAmt=price*0.1;
		return billAmt;
	}
	
}
