package ocjpjava;


class Product {
	//static을 해줘야 오류가 사라진다.
	static double price;
}
public class Test {
public void updatePrice(Product product, double price) {
	price = price * 2;
	
	//dump Error 
	//덤프에서 에러가 났다. 이유는 double price;가 오류가 났기 때문이다.
	//static을 해주면 오류가 사라진다.
	Product.price = product.price + price;
}
	
	public static void main(String[] args) {
		Product prt = new Product();
		prt.price = 200;
		double newPrice = 100;
		
		Test t = new Test();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price + ":" + newPrice);

	}

}
/*
 What is the result?
 A)200.0 : 100.0
 B)400.0 : 200.0
 C)400.0 : 100.0
 D)Compilation fails.
 
 Answer : C
 */

