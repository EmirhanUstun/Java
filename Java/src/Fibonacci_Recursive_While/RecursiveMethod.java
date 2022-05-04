package Fibonacci_Recursive_While;

import java.util.Scanner;

public class RecursiveMethod {

	public static int topla(int a) {
		if (0 <= a)// kosulumuzu belirttik.
		{
			return (a + topla(a - 1));// geriye döndürme islemimizi yaptik
		} else {
			return 0;
		}
	}
	
	public static int topla2(int a) {
		if (a == 0) {
			return 0;
		}
		else {
			return (a + topla2 (a - 1) );
		}
		
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Klavyeden sayi giriniz");
		int n = scanner.nextInt();// klavyeden sayi istedik.
		int sonuc = topla(n);
		System.out.println("Girilen sayidan 1'e kadar olan sayilar toplami = " + sonuc);
	}
}
