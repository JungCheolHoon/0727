
public class CopyDemo1 {
	public static void main(String[] args) {
		
		Car sonata = new Car();
		sonata.price = 25_000_000;
		
		Car matiz = new Car();
		matiz.price = sonata.price;
		
		System.out.println("-----Before Change-----");
		System.out.println("Sonata's price = " + sonata.price);
		System.out.println("Matiz's price = " + matiz.price);
		System.out.println("------After Change------");
		sonata.price = 100_000_000;
		System.out.println("Sonata's price = " + sonata.price);
		System.out.println("Matiz's price = " + matiz.price);
	}
}

class Car{
	int price;
}