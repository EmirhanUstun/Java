package Break_IstediginKadarSayiToplama_TersUcgen;

public class TersUcgen {

public static void main(String[] args) {
		
		int i, j, k;// De�i�ekenlerimizi tan�mlad�k.
		for (i = 10; 0 < i; i--) {// D�ng�m�z�n ne kadar d�nece�ini belirtir.
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
	/* Yukar�daki kodun nas�l i�lem yapt���;
	 * * * * * * * * * *
	  * * * * * * * * * 
	   * * * * * * * * 
	   .
	   .
	   .  
	 i = 10    i = 9   i = 8 ....  i = 1   i = 0
	 j = 10    j = 9   j = 8       j = 1
	 k = 1     k = 1   k = 1       k = 1
	 k = 2     k = 2   k = 2       k = 2
	 k = 3     k = 3   k = 3
	 .         .       .
	 .         .       .
	 k = 11    k = 10  k = 9
	 
	 */

}

