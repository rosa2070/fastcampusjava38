package streams.coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee americano = new KenyaAmericano();
		americano.brewing();
		System.out.println();
		
		Coffee kenyaLatte = new Latte(new KenyaAmericano());
		kenyaLatte.brewing();
		System.out.println();

		
		Coffee KenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
		KenyaMocha.brewing();

	}

}
