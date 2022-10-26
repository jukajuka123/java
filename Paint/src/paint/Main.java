package paint;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int coverage = 10;
		
		System.out.println("ukucajte sirinu prostorije");
		double x = scan.nextDouble();
		
		System.out.println("ukucajte duzinu prostorije");
		double z = scan.nextDouble();
		
		System.out.println("ukucajte visinu prostorije");
		double y = scan.nextDouble();
		
		double pod = x * z;
		double zid1 = x * y;
		double zid2 = z * y;
		double ukupankvadrat = (zid1 + zid2) * 2;
		double bezvrataiprozora = ukupankvadrat - 35;
		double rezultat = (bezvrataiprozora + pod) / coverage;
		System.out.println(rezultat);
	}
}
