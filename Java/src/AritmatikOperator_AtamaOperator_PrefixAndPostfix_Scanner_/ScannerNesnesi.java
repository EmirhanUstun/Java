package AritmatikOperator_AtamaOperator_PrefixAndPostfix_Scanner_;

import java.util.Scanner;

public class ScannerNesnesi {
		
		/*
		 * import Java�da dahil etmek anlam�nda kullan�lmaktad�r. 
		 * Bizde import anahtar kelimesini kullanarak program�m�za farkl� k�t�phaneler ve classlar dahil edebiliriz.
		 * Scanner icin import java.util.Scanner; eklenmelidir yukaridaki gibi.
		 */
		/*
		 * A�a��daki program klavyeden girilen bir sat�rl�k metni (text) okur ve ekrana
		 * yazar. Bunun i�in Scanner(InputStream source) kurucusunu kullan�yor.
		 * InputStream tipinden olan source olarak System.in de�i�keni kullan�l�yor. Bu
		 * de�i�ken standart giri� ak�m�d�r  (klavye). Kullanilabilecek methodlari
		 * 
		 * Atama hangi tip icin yapilacak ise o method kullanilir.
		 * 
		 * nextLine() -> String
		 * 
		 * nextInt() -> int
		 * 
		 * nextByte() -> byte
		 * 
		 * nextFloat -> float
		 * 
		 * nextDouble -> double
		 */
		public static void main(String[] args) {
			
			/*
			 * Kullanicidan 2 sayi al ve bu sayilari topla
			 */
			Scanner scan = new Scanner(System.in);
			System.out.println("L�tfen ilk tamsay�y� giriniz : ");
			int n = scan.nextInt();
			System.out.println("L�tfen ikinci tamsay�y� giriniz : ");
			int m = scan.nextInt();
			System.out.print(n + m);
		}

	}