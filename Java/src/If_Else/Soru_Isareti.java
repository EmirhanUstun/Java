package If_Else;

import java.util.Scanner;

public class Soru_Isareti {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String sonuc;
		double not;
		System.out.println("S�nav notu(0-100) giriniz:");
		not = giris.nextDouble();
		sonuc = not >= 50 ? "Basar�l�" : "Basar�s�z";
		
		System.out.println("Sonuc:" + sonuc);

	}

}
