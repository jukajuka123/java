package vezba3;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("ako ti se odustaje ukucaj 0 i tacan broj ce se prikazati! (nula ne spada pod broj pogadjanja)");
		System.out.println("mozes ti to, ne odustaj!");
		
		
		int odust = 0;
		int nevazeci = 0;
		
		//import variable
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("koji je max broj do kojeg moze program random da smisli? to ne moze biti 0!");
		int br = scan.nextInt();
		if(br==nevazeci) {
			System.out.println("0 je nevazeci broj!");
			scan.close();
			System.exit(br);
		}
		
		int x = rand.nextInt(br)+1;
		System.out.println("gotovo! pogadjaj :)");
		
		while(true) {
			int y = scan.nextInt();
			if(y!=x) {
				System.out.println("eeh, ne tacno!");
			}
			if(y==x) {
				System.out.println("Tacno!");
				System.out.println("A evo i medalje!");
				System.out.println("\\\\//");
				System.out.println(" ()");
				scan.close();
				break;
			}
			if(y>br) {
				System.out.println("to je vise od onoga sto si postavio " + "("+br+")");
			}
			if(y==odust) {
				System.out.println("odustao si, tacan broj je bio "+x+"!");
				}
			}	
		}
	}
