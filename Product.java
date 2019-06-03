package product.books.toys;

public class Product {

	String productName;
	String productUID;
	int stock;
	float price;
	double billAmt;
	String productDesc;
	int productQty;
	
	 public void dispInfo() {
		 System.out.println("product name is "+productName);
		 System.out.println("product UID is "+productUID);
		 System.out.println("Stock Available:"+stock);
		 System.out.println("Price of the Product:"+price);
		 System.out.println("Prodcut Description:"+productDesc);
		 System.out.println("Product Quantity:"+productQty);
	 }
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	
}
