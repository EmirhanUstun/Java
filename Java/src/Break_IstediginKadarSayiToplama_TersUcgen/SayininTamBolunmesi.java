package Break_IstediginKadarSayiToplama_TersUcgen;

public class SayininTamBolunmesi {

	public static void main(String[] args) {

		int deger = 60;
		int bolen = 1;
		int tamBolenlerToplami = 0;
		while (bolen <= deger) {
			if (deger % bolen == 0) {
				System.out.println(deger + " say�s� " + bolen + " say�s�na tam b�l�n�r.");
				tamBolenlerToplami = tamBolenlerToplami + bolen;
			}
			bolen++;
		}
		System.out.println("\n" + deger + " say�s�n�n tam b�lenlerinin toplam�: " + tamBolenlerToplami);
		
	}

}
