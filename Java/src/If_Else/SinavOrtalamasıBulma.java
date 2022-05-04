package If_Else;

import java.util.Scanner;

public class SinavOrtalamasýBulma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ogrenci numarasi giriniz");
		int ogrenciNumarasi = scan.nextInt();
		
		System.out.println("Ad ve soyad giriniz");
		scan = new Scanner(System.in);
		String adSoyad = scan.next();
		
		System.out.println("Vize sonucunu giriniz");
		scan = new Scanner(System.in);
		int vizeNotu = scan.nextInt();
		
		System.out.println("Final notunu giriniz");
		scan = new Scanner(System.in);
		int finalNotu = scan.nextInt();
		
		double ortalama = (vizeNotu*0.3) + (finalNotu*0.7);
		
		
		System.out.printf("Adi soyadi %s olan ogrenci numarasi %d olan kisinin not ortalamasý %f", adSoyad,ogrenciNumarasi,ortalama);
		
		
		
		}

}
