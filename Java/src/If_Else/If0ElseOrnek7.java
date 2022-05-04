package If_Else;

import java.util.Scanner;

public class If0ElseOrnek7 {

	/*
	 * Bir sat�� eleman�n�n satt��� �r�n miktar�na g�re alaca�� g�nl�k �cret a�a��daki gibi belirleniyor:
	- G�nl�k sat�� miktar� 50 adetten az ise 15 TL tutar�ndaki sabit �crete, sat�lan �r�n ba��na 1 TL de�erinde prim eklenerek g�nl�k �cret belirlenir.
	- G�nl�k sat�� miktar� 50 adet ya da daha fazla ise, bu durumda g�nl�k sabit �cret 15 TL al�narak, sat�lan �r�n ba��na da ilk 50 adet �r�n i�in 2 TL, 50 adedi a�an k�s�m i�in de 3 TL prim verilerek g�nl�k �cret belirlenir.
	Bir sat�c�n�n g�nl�k sat�� miktar� bilgisayara girildi�inde sat�c�n�n alaca�� g�nl�k �creti hesaplayan bir Java program� yaz�n�z.
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

