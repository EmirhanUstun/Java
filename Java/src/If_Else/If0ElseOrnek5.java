package If_Else;

import java.util.Scanner;

public class If0ElseOrnek5 {

public static void main(String[] args) {
        
    	Scanner giris = new Scanner(System.in);
		int a,b,c; //sayýlar, bu deðiþkenlere
		int enKucukSayi; // en küçüðü bir yerde tutalým;
		System.out.println("Birinci sayiyi giriniz.");
		a = giris.nextInt();
		System.out.println("Ikinci sayiyi giriniz");
		b = giris.nextInt();
		System.out.println("Ucuncu sayiyi giriniz");
		c = giris.nextInt();
		if (a < b) {
			if (a < c) {
				enKucukSayi = a;
			} else {
				enKucukSayi = c;
			}
		} else if (b < c) {
			 enKucukSayi = b;
		} else {
			enKucukSayi = c;
			}
		System.out.println("En Kucuk Sayi: " + enKucukSayi);
		
		
	
	}

}