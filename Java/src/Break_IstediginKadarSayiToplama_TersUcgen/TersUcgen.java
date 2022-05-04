package Break_IstediginKadarSayiToplama_TersUcgen;

public class TersUcgen {

public static void main(String[] args) {
		
		int i, j, k;// Deðiþekenlerimizi tanýmladýk.
		for (i = 10; 0 < i; i--) {// Döngümüzün ne kadar döneceðini belirtir.
			for (j = i; j < 10; j++) {// Üçgenimizi yaparken ekran çýktýsýnýn sol tarafýndaki boþluðu belirtir.
				System.out.print(" ");// Boþluðumuzu belirtiyoruz.
			}
			for (k = 1; k <= i; k++) {// Yýldýz sembolümüzün yazýlmasýný saðlar.
				System.out.print("*");// Sembolümüzü belirledik ve çýktýsýný saðladýk.
				System.out.print(" ");// Yýldýz sembolümüzün arasýna boþluk koyulmasýný saðlar.
			}
			System.out.println(" ");// Döngüden sonra diðer satýra atlamamýzý saðlar.
		}
            System.out.println(i);		

	}
	/* Yukarýdaki kodun nasýl iþlem yaptýðý;
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

