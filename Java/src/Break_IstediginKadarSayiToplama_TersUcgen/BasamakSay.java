package Break_IstediginKadarSayiToplama_TersUcgen;

import java.util.Scanner;

public class BasamakSay {

	public static void main(String[] args) {

		long n;
		long i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("En çok 10 haneli bir tamsayı giriniz:");
		n = scan.nextLong();
		long k = n;
		do {
			++i;
			n = n / 10;
		} while (n > 0);
		System.out.printf("%d sayısında %d hane vardır.", k, i);
		
	}
	/* Yukarıdaki kodun nasıl işlem yaptığı; 1453 yazarsak
	  n = 1453
	  k = 1453
	  i = 1
	  n = 145
	  i = 2
	  n = 14
	  i = 3
	 
	 */

}

