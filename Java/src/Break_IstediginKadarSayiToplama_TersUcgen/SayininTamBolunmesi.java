package Break_IstediginKadarSayiToplama_TersUcgen;

public class SayininTamBolunmesi {

	public static void main(String[] args) {

		int deger = 60;
		int bolen = 1;
		int tamBolenlerToplami = 0;
		while (bolen <= deger) {
			if (deger % bolen == 0) {
				System.out.println(deger + " sayýsý " + bolen + " sayýsýna tam bölünür.");
				tamBolenlerToplami = tamBolenlerToplami + bolen;
			}
			bolen++;
		}
		System.out.println("\n" + deger + " sayýsýnýn tam bölenlerinin toplamý: " + tamBolenlerToplami);
		
	}

}
