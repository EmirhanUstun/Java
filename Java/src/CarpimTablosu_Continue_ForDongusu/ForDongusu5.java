package CarpimTablosu_Continue_ForDongusu;

public class ForDongusu5 {

	public static void main(String[] args) {

		int i, j, k;// De�i�ekenlerimizi tan�mlad�k.
		for (i = 1; i < 10; i++) {// D�ng�m�z�n ne kadar d�nece�ini belirtir.
			for (j = i; j < 10; j++) {// ��genimizi yaparken ekran ��kt�s�n�n sol taraf�ndaki bo�lu�u belirtir.
				System.out.print(" ");// Bo�lu�umuzu belirtiyoruz.
			}
			for (k = 1; k <= i; k++) {// Y�ld�z sembol�m�z�n yaz�lmas�n� sa�lar.
				System.out.print("%");// Sembol�m�z� belirledik ve ��kt�s�n� sa�lad�k.
				System.out.print(" ");// Y�ld�z sembol�m�z�n aras�na bo�luk koyulmas�n� sa�lar.
			}
			System.out.println();// D�ng�den sonra di�er sat�ra atlamam�z� sa�lar.
		}
		
	}

}
