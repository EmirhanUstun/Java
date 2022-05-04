package If_Else;

import java.util.Scanner;

public class If0ElseOrnek8 {

	/*
	 * Bilgisayara negatif olmayan bir sayý girildiðinde bu sayýnýn karekökünü hesaplayan, 
	 * negatif bir sayý girildiðinde ise kullanýcýyý uyaran bir Java programý yazalým.
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