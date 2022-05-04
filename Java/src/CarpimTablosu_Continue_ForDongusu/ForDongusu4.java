package CarpimTablosu_Continue_ForDongusu;

public class ForDongusu4 {

	public static void main(String[] args) {

		int i, k;// Deðiþkenlerimizi tanýmladýk.
		int sembol = 1;// Yýldýzýmýzýn program baþlangýçýnda, kaç tane yýldýz yazdýracaðýný belirtiriz.

		for (k = 0; k < 9; k++) {// Döngümüzün kaç kere döneceðini ve kaça kadar yýldýz yazdýracaðýný belirtir.
			for (i = 0; i < sembol; i++) {// Yýldýzýmýzýn satýrlarda kaçar kaçar basýlacaðýný belirttik.
				System.out.print("%");// Sembolümüzü belirttik.
			}
			System.out.println("");// Yýldýzlarýmýz basýldýktan sonra alt satýra geçilmesini saðlýyoruz.
			sembol++;// Yýldýzýmýzýn birer birer artmasýný saðlarýz.
		}
		
	}

}