package Fonksiyon_IsEven_Muhasebe_Overloading_Polindrom;

import java.util.Scanner;

public class IkiSayidanBuyukOlan {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.println("B�y�k Olan Say�y� Bulma;");
		System.out.print("Say� 1: ");
		double sayi1 = girdi.nextInt();
		System.out.print("Say� 2: ");
		double sayi2 = girdi.nextInt();
		System.out.println(sayi1+" ve "+sayi2+" i�erisinden b�y�k olan: "+Buyuk(sayi1, sayi2));
	}

	public static double Buyuk(double a, double b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}
	}

}
