package Break_IstediginKadarSayiToplama_TersUcgen;

import java.util.Scanner;

public class BasamakSay {

	public static void main(String[] args) {

		long n;
		long i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("En �ok 10 haneli bir tamsay� giriniz:");
		n = scan.nextLong();
		long k = n;
		do {
			++i;
			n = n / 10;
		} while (n > 0);
		System.out.printf("%d say�s�nda %d hane vard�r.", k, i);
		
	}
	/* Yukar�daki kodun nas�l i�lem yapt���; 1453 yazarsak
	  n = 1453
	  k = 1453
	  i = 1
	  n = 145
	  i = 2
	  n = 14
	  i = 3
	 
	 */

}

