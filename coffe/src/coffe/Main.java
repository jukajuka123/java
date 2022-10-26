package coffe;

public class Main {

	public static void main(String[] args) {
		Coffe coffe = new Coffe();
		
		if (coffe.Empty()) {
			coffe.Reffil();
		}
		else {
			coffe.Drink();
		}
	}

}
