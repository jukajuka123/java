package Cconverter;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		convert convert = new convert();
		
		String eur = "EUR";
		String usd = "USD";
		String din = "RSD";
		String km = "KM";
		String lira = "LIRA";
		System.out.println(eur+"\n"+usd+"\n"+km+"\n"+din+"\n"+lira+"\n");
		
		System.out.println("iz koje valute prebacujete: ");
		String prvavaluta = scan.nextLine();
		
		System.out.println("ukucaj kolicinu: ");
		double prvakolicina = scan.nextDouble();
		
		System.out.println("ukucaj valutu u koju prebacujete: ");
		String drugavrsta = scan.next();
		
		if(prvavaluta.equals(eur)) {
			convert.eur(prvakolicina, drugavrsta);
		}
		if(prvavaluta.equals(usd)) {
			convert.usd(prvakolicina, drugavrsta);
		}
		if(prvavaluta.equals(din)) {
			convert.din(prvakolicina, drugavrsta);
		}
		if(prvavaluta.equals(km)) {
			convert.km(prvakolicina, drugavrsta);
		}
		if(prvavaluta.equals(lira)) {
			convert.lira(prvakolicina, drugavrsta);
		}
	}
	
}
