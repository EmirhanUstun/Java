package AritmatikOperator_AtamaOperator_PrefixAndPostfix_Scanner_;

import java.util.Scanner;

public class ScannerNesnesi {
		
		/*
		 * import Java’da dahil etmek anlamýnda kullanýlmaktadýr. 
		 * Bizde import anahtar kelimesini kullanarak programýmýza farklý kütüphaneler ve classlar dahil edebiliriz.
		 * Scanner icin import java.util.Scanner; eklenmelidir yukaridaki gibi.
		 */
		/*
		 * Aþaðýdaki program klavyeden girilen bir satýrlýk metni (text) okur ve ekrana
		 * yazar. Bunun için Scanner(InputStream source) kurucusunu kullanýyor.
		 * InputStream tipinden olan source olarak System.in deðiþkeni kullanýlýyor. Bu
		 * deðiþken standart giriþ akýmýdýr  (klavye). Kullanilabilecek methodlari
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
			System.out.println("Lütfen ilk tamsayýyý giriniz : ");
			int n = scan.nextInt();
			System.out.println("Lütfen ikinci tamsayýyý giriniz : ");
			int m = scan.nextInt();
			System.out.print(n + m);
		}

	}