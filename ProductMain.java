package product.books.toys;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String typeOfProduct="Book";
		Books b=new Books("Java",120);
		Toys t=new Toys("Car",150);
		Toys t=new Toys("A1234",12000);
		
		if(typeOfProduct=="Book") {
			
			b.orderBy("Java", 60);
			
		}
		else
		{
			t.orderBy("Car", 5);
		}
	}

}
