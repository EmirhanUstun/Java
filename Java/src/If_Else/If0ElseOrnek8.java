package If_Else;

import java.util.Scanner;

public class If0ElseOrnek8 {

	/*
	 * Bilgisayara negatif olmayan bir say� girildi�inde bu say�n�n karek�k�n� hesaplayan, 
	 * negatif bir say� girildi�inde ise kullan�c�y� uyaran bir Java program� yazal�m.
	 */
	
	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		double sayi;
		System.out.println("Karekokunu bulmak icin bir sayi giriniz: ");
		sayi = giris.nextDouble();
		if (sayi < 0)
			System.out.println("Olmadi, pozitif sayi girmeliydiniz");
		else
			System.out.println(sayi + "'nin karekoku: " + Math.sqrt(sayi));

	}

}