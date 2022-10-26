package Cconverter;
import java.util.Scanner;
public class convert{
		convar conv = new convar();
		String eur = "EUR";
		String usd = "USD";
		String din = "RSD";
		String km = "MARKA";
		String lira = "LIRA";
		Scanner scan = new Scanner(System.in);
	public void eur(double prvakolicina, String drugavrsta) {
		switch(drugavrsta) {
		case "USD": System.out.println(prvakolicina * conv.Eusd+" USD"); break;
		case "RSD": System.out.println(prvakolicina * conv.Edin+" RSD"); break;
		case "KM": System.out.println(prvakolicina * conv.Ekm+" KM"); break;
		case "LIRA": System.out.println(prvakolicina * conv.Elira+" LIR"); break;
		}
	}
	public void usd(double prvakolicina, String drugavrsta) {
		switch(drugavrsta) {
		case "EUR": System.out.println(prvakolicina * conv.Ueur+" EUR"); break;
		case "RSD": System.out.println(prvakolicina * conv.Udin+" RSD"); break;
		case "KM": System.out.println(prvakolicina * conv.Ukm+" KM"); break;
		case "LIRA": System.out.println(prvakolicina * conv.Ulira+" LIR"); break;
		}
	}
	public void din(double prvakolicina, String drugavrsta) {
		switch(drugavrsta) {
		case "USD": System.out.println(prvakolicina * conv.Dusd+" USD"); break;
		case "RSD": System.out.println(prvakolicina * conv.Deur+" EUR"); break;
		case "KM": System.out.println(prvakolicina * conv.Dkm+" KM"); break;
		case "LIRA": System.out.println(prvakolicina * conv.Dlira+" LIR"); break;
		}
	}
	public void km(double prvakolicina, String drugavrsta) {
		switch(drugavrsta) {
		case "USD": System.out.println(prvakolicina * conv.Keur+" EUR"); break;
		case "RSD": System.out.println(prvakolicina * conv.Kdin+" RSD"); break;
		case "KM": System.out.println(prvakolicina * conv.Kusd+" USD"); break;
		case "LIRA": System.out.println(prvakolicina * conv.Klira+" LIR"); break;
		}
	}
	public void lira(double prvakolicina, String drugavrsta) {
		switch(drugavrsta) {
		case "USD": System.out.println(prvakolicina * conv.Lusd+" USD"); break;
		case "RSD": System.out.println(prvakolicina * conv.Ldin+" RSD"); break;
		case "KM": System.out.println(prvakolicina * conv.Lkm+" KM"); break;
		case "LIRA": System.out.println(prvakolicina * conv.Leur+" EUR"); break;
		}
	}
}
