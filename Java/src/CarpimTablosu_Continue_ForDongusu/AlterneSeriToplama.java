package CarpimTablosu_Continue_ForDongusu;

public class AlterneSeriToplama {

	public static void main(String[] args) {


		// 1.2/(3.4) ­ 5.6/(7.8) + 9.10/(11.12) ­ 13.14/(15.16) þeklindeki alterne
		// seri toplamýný hesaplayalým. (Yukardaki ifadede "." sembolü çarpma iþlemi
		// anlamýndadýr.)

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
		 * AÇIKLAMA:
		 * 
		 * Sadece 4 terim olduðu için for döngüsü 1’den 4’e kadar çalýþtýrýldý. Ýlk
		 * terim 1.2/ (3.4) ve ikinci terim 5.6/(7.8) olduðu için, x deðiþkeninin ilk
		 * terimdeki ilk sayýyý temsil ettiði durumda, terimi x.(x+1)/((x+2).(x+3))
		 * þeklinde ifade edebiliriz. x yerine 1 koyarak bu durum kolayca
		 * kanýtlayabiliriz. Ýkinci terimde ilk sayý 5, üçüncü terimde ilk sayý 9
		 * olduðuna göre x her seferinde 4 arttýrýlmalýdýr. Bunu da programda x=x+4;
		 * deyimiyle gerçekleþtiriyoruz. Bu terimi x+=4; þeklinde de yazabiliriz.
		 * 
		 * Seri alterne seri olduðuna göre, yani terimlerin iþaretleri +,–,+,– þeklinde
		 * deðiþtiðine göre, p deðiþkeni yardýmýyla terimlerin iþaretlerini
		 * ayarlayabiliriz. p önce 1 olarak atanýr. Sonra döngü içine konulan p=–p;
		 * ifadesi ise bir sonraki iþareti –, bir sonrakini + ve onu izleyeni – yapar.
		 * (Programý kâðýt üzerinde adým adým izleyelim).
		 */
		
	}

}
