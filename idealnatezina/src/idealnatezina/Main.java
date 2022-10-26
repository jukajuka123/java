package idealnatezina;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int idealnaZ = 100;
		int idealnaM = 106;
		
		double inch = 2.54;
		System.out.println("koliko metara ste visoki?");
		int visinam = scan.nextInt();
		System.out.println("a koliko centimetara?");
		int visinacm = scan.nextInt();
		
		double h = visinam * 3.281;
		double f = h + (visinacm * 0.0328);
		
		if(f<5) {
			System.out.println("savrsena tezina za zene je "+idealnaZ);
			System.out.println("savrsena tezina za zene je "+idealnaM);
		}
		double feet1 = f - 5;
		double tezina1 = feet1 * 50;
		double tezina2 = feet1 * 60;
		double rezultatkg = (tezina1 + idealnaZ) / 2.205;
		System.out.println("savrsena tezina za zenu je " + rezultatkg + " kg");
			
		double rezultatkg3 = (tezina2 + idealnaM) / 2.205;
		System.out.println("savrsena tezina za muskarca je " + rezultatkg3 + " kg");

		
	}
}
