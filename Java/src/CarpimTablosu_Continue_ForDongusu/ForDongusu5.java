package CarpimTablosu_Continue_ForDongusu;

public class ForDongusu5 {

	public static void main(String[] args) {

		int i, j, k;// Deðiþekenlerimizi tanýmladýk.
		for (i = 1; i < 10; i++) {// Döngümüzün ne kadar döneceðini belirtir.
			for (j = i; j < 10; j++) {// Üçgenimizi yaparken ekran çýktýsýnýn sol tarafýndaki boþluðu belirtir.
				System.out.print(" ");// Boþluðumuzu belirtiyoruz.
			}
			for (k = 1; k <= i; k++) {// Yýldýz sembolümüzün yazýlmasýný saðlar.
				System.out.print("%");// Sembolümüzü belirledik ve çýktýsýný saðladýk.
				System.out.print(" ");// Yýldýz sembolümüzün arasýna boþluk koyulmasýný saðlar.
			}
			System.out.println();// Döngüden sonra diðer satýra atlamamýzý saðlar.
		}
		
	}

}
