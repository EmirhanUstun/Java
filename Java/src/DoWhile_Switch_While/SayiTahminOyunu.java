package DoWhile_Switch_While;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("Sayi tahmin oyununa hoþ geldiniz!");
		System.out.println("Lütfen 1-100 arasinda bir sayi giriniz: ");
		// Kullanicidan sayi aliyoruz
		int tahmin = input.nextInt();
		// Bilgisayardan rastgele sayi aliyoruz
		int sayi = rnd.nextInt(101);
		while (tahmin != sayi) {
			if (tahmin < 0 || tahmin > 100) {
				System.out.println("1 ile 100 arasinda bir deðer giriniz: ");
				tahmin = input.nextInt();
			} else if (tahmin < sayi) {
				System.out.println("Daha büyük bir sayi giriniz: ");
				tahmin = input.nextInt();
			} else {
				System.out.println("Daha küçük bir sayi giriniz: ");
				tahmin = input.nextInt();
			}
		}
		// Eðer sayimiz ve tahmin birbirine eþitse while döngüsüne girmez
		// ve print komutunu yazdiririz
		System.out.println("Tebrikler, kazandiniz!");
		
	}

}
