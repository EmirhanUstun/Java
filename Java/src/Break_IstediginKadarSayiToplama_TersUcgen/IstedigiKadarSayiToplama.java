package Break_IstediginKadarSayiToplama_TersUcgen;

import java.util.Scanner;

public class IstedigiKadarSayiToplama {

	public static void main(String[] args) {

		Scanner kullanici = new Scanner(System.in);
		double toplam = 0;
		double girdi = -1;
		int adet = 1;
		System.out.print("Toplanacak Say�lar� Girin (��kmak i�in 0 girin)\n\n");
		while (girdi != 0) {
			System.out.print(adet + ". Say�: ");
			girdi = kullanici.nextDouble();
			toplam = toplam + girdi;
			adet++;
		}
		System.out.println("\n\nToplam: " + toplam);
		
	}

}

