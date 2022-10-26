package tictactoe;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
public class Main {

	private static Process exec;

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Rezultat rez = new Rezultat();
		
		String pitanje2 = "koji je maksimalan broj do kojeg nasumicni brojevi mogu da idu?";
		System.out.println(pitanje2);
		int skenpitanje2 = scan.nextInt();
		
		System.out.println("koliko vremena prije nego sto igrica izbrise brojeve? u milisekundama");
		int vrijeme = scan.nextInt();
		
		int nasbr1 = rand.nextInt(skenpitanje2);
		int nasbr2 = rand.nextInt(skenpitanje2);
		int nasbr3 = rand.nextInt(skenpitanje2);
		int nasbr4 = rand.nextInt(skenpitanje2);
		int nasbr5 = rand.nextInt(skenpitanje2);
		int pitanja = 5;
		
		System.out.print("\t"+nasbr1 +"\t"+ nasbr2 +"\t"+ nasbr3+"\t"+ nasbr4 +"\t"+ nasbr5);
		Thread.sleep(vrijeme);
		System.out.println();
		for(int i = 0; i<=500; i++) {
			System.out.println();
		}
		System.out.println("vrijeme isteklo!");
		System.out.println();
		
		System.out.println("koji je prvi broj: ");
		int auth1 = scan.nextInt();
		
		if(auth1==nasbr1) {
			System.out.println("tacno!");
			System.out.println();
		}else {
			System.out.println("ne tacno!");
			System.out.println();
		}
		
		System.out.println("koji je drugi broj: ");
		int auth2 = scan.nextInt();
		if(auth2==nasbr2) {
			System.out.println("tacno!");
			System.out.println();
		}else {
			System.out.println("ne tacno!");
			System.out.println();
		}
		
		System.out.println("koji je treci broj: ");
		int auth3 = scan.nextInt();
		if(auth3==nasbr3) {
			System.out.println("tacno!");
			System.out.println();
		}else {
			System.out.println("ne tacno!");
			System.out.println();
		}
		
		System.out.println("koji je cetvrti broj: ");
		int auth4 = scan.nextInt();
		if(auth4==nasbr4) {
			System.out.println("tacno!");
			System.out.println();
		}else {
			System.out.println("ne tacno!");
			System.out.println();
		}
		
		System.out.println("koji je peti broj: ");
		int auth5 = scan.nextInt();
		if(auth5==nasbr5) {
			System.out.println("tacno!");
		}else {
			System.out.println("ne tacno!");
		}
		System.out.println("KRAJ!");
	}
	
}
