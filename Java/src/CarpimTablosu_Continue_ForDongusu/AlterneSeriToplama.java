package CarpimTablosu_Continue_ForDongusu;

public class AlterneSeriToplama {

	public static void main(String[] args) {


		// 1.2/(3.4) � 5.6/(7.8) + 9.10/(11.12) � 13.14/(15.16) �eklindeki alterne
		// seri toplam�n� hesaplayal�m. (Yukardaki ifadede "." sembol� �arpma i�lemi
		// anlam�ndad�r.)

		int i, p;
		double x, sonuc;
		sonuc = 0;
		p = 1;
		x = 1.0;
		for (i = 1; i <= 4; i++) {
			sonuc = sonuc + (x * (x + 1)) / ((x + 2) * (x + 3)) * p;
			System.out.println(sonuc);
			x = x + 4;
			System.out.println(x);
			p = -p;
			System.out.println(p);
			System.out.println("------------");
		}
		System.out.println("Toplam= " + sonuc);

		/*
		 * A�IKLAMA:
		 * 
		 * Sadece 4 terim oldu�u i�in for d�ng�s� 1�den 4�e kadar �al��t�r�ld�. �lk
		 * terim 1.2/ (3.4) ve ikinci terim 5.6/(7.8) oldu�u i�in, x de�i�keninin ilk
		 * terimdeki ilk say�y� temsil etti�i durumda, terimi x.(x+1)/((x+2).(x+3))
		 * �eklinde ifade edebiliriz. x yerine 1 koyarak bu durum kolayca
		 * kan�tlayabiliriz. �kinci terimde ilk say� 5, ���nc� terimde ilk say� 9
		 * oldu�una g�re x her seferinde 4 artt�r�lmal�d�r. Bunu da programda x=x+4;
		 * deyimiyle ger�ekle�tiriyoruz. Bu terimi x+=4; �eklinde de yazabiliriz.
		 * 
		 * Seri alterne seri oldu�una g�re, yani terimlerin i�aretleri +,�,+,� �eklinde
		 * de�i�ti�ine g�re, p de�i�keni yard�m�yla terimlerin i�aretlerini
		 * ayarlayabiliriz. p �nce 1 olarak atan�r. Sonra d�ng� i�ine konulan p=�p;
		 * ifadesi ise bir sonraki i�areti �, bir sonrakini + ve onu izleyeni � yapar.
		 * (Program� k���t �zerinde ad�m ad�m izleyelim).
		 */
		
	}

}
