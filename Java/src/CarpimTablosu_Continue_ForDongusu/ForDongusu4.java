package CarpimTablosu_Continue_ForDongusu;

public class ForDongusu4 {

	public static void main(String[] args) {

		int i, k;// De�i�kenlerimizi tan�mlad�k.
		int sembol = 1;// Y�ld�z�m�z�n program ba�lang���nda, ka� tane y�ld�z yazd�raca��n� belirtiriz.

		for (k = 0; k < 9; k++) {// D�ng�m�z�n ka� kere d�nece�ini ve ka�a kadar y�ld�z yazd�raca��n� belirtir.
			for (i = 0; i < sembol; i++) {// Y�ld�z�m�z�n sat�rlarda ka�ar ka�ar bas�laca��n� belirttik.
				System.out.print("%");// Sembol�m�z� belirttik.
			}
			System.out.println("");// Y�ld�zlar�m�z bas�ld�ktan sonra alt sat�ra ge�ilmesini sa�l�yoruz.
			sembol++;// Y�ld�z�m�z�n birer birer artmas�n� sa�lar�z.
		}
		
	}

}