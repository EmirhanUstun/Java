package Break_IstediginKadarSayiToplama_TersUcgen;

public class Ucgen {

	public static void main(String[] args) {

		int i, j, k;// De�i�ekenlerimizi tan�mlad�k.
		for (i = 1; i < 10; i++) {// D�ng�m�z�n ne kadar d�nece�ini belirtir.
			for (j = i; j < 10; j++) {// ��genimizi yaparken ekran ��kt�s�n�n sol taraf�ndaki bo�lu�u belirtir.
				System.out.print(" ");// Bo�lu�umuzu belirtiyoruz.
			}
			for (k = 1; k <= i; k++) {// Y�ld�z sembol�m�z�n yaz�lmas�n� sa�lar.
				System.out.print("*");// Sembol�m�z� belirledik ve ��kt�s�n� sa�lad�k.
				System.out.print(" ");// Y�ld�z sembol�m�z�n aras�na bo�luk koyulmas�n� sa�lar.
			}
			System.out.println(" ");// D�ng�den sonra di�er sat�ra atlamam�z� sa�lar.
		}

		System.out.println(i);		
	}
	/*Yukar�daki kodun nas�l i�lem yapt���;
	         * 
	        * * 
	       * * * 
	      * * * * 
	      .
	      .
	      . 
	i = 1    i = 2   i = 3........
	j = 1    j = 2   j = 3
	j = 2    j = 3   j = 4
	j = 3    j = 4   j = 5
	j = 4    j = 5   j = 6
	.        .       .
	.        .       .
	j = 10   j = 10  j = 10
	k = 1    k = 1   k = 1 
	k = 2    k = 2   k = 2
	         k = 3   k = 3
	                 k = 4
*/
}
