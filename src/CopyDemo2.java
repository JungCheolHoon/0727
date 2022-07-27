
public class CopyDemo2 {
	public static void main(String[] args) {
		Product mouse = new Product();   
		mouse.price = 20_000;
		
		Product keyboard = mouse;			//주소복사
		
		System.out.println("-----Before Change------");
		System.out.println("mouse's price = " + mouse.price);
		System.out.println("keyboard's price = " + keyboard.price);
		
		System.out.println("------After Change-------");
		mouse.price = 100_000;
		System.out.println("mouse's price = " + mouse.price);
		System.out.println("keyboard's price = " + keyboard.price);
		
	}
}

class Product{
	int price;
	
}