package If_Else;

import java.util.Scanner;

public class If0ElseOrnek7 {

	/*
	 * Bir satýþ elemanýnýn sattýðý ürün miktarýna göre alacaðý günlük ücret aþaðýdaki gibi belirleniyor:
	- Günlük satýþ miktarý 50 adetten az ise 15 TL tutarýndaki sabit ücrete, satýlan ürün baþýna 1 TL deðerinde prim eklenerek günlük ücret belirlenir.
	- Günlük satýþ miktarý 50 adet ya da daha fazla ise, bu durumda günlük sabit ücret 15 TL alýnarak, satýlan ürün baþýna da ilk 50 adet ürün için 2 TL, 50 adedi aþan kýsým için de 3 TL prim verilerek günlük ücret belirlenir.
	Bir satýcýnýn günlük satýþ miktarý bilgisayara girildiðinde satýcýnýn alacaðý günlük ücreti hesaplayan bir Java programý yazýnýz.
	 */

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		double satis, ucret; 
		System.out.println("Gunluk kac tane urun satiyorsunuz? ");
		satis = giris.nextDouble();
		if (satis < 50) {
			ucret = 15.0 + satis * 1.0;
		} else {
			ucret = 15.0 + 50 * 2.0 + (satis - 50) * 3.0;
		}
		System.out.println("Buna gore gunluk ucretiniz: " + ucret + " TL");

		
		
	}

}

