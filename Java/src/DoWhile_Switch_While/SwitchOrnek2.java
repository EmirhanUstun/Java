package DoWhile_Switch_While;

import java.util.Scanner;

public class SwitchOrnek2 {

	/*
	 * Klavyeden 1 ve 7 dahil olmak �zere bu aral�kta girilen say�ya g�re haftan�n g�n�n� yazan program� yazal�m.
		Klavyeden girilen yaz� de�erine g�re, rakam kar��l���n� veren program. 1�den 5�e kadar bir, iki, ��, d�rt, be� 
		�eklinde yaz�lar girildi�inde bunun rakamsal kar��l���n� yazd�ral�m.
	 */

	public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int secim;

        System.out.println("Secim yapiniz (1 - 2 - 3)");
        secim=giris.nextInt();

        switch (secim) {
        case 1 :
            System.out.println("A sinifi dergilerin listesi");
            break;

        case 2 :
            System.out.println("B sinifi dergilerin listesi");
            break;

        case 3 :
            System.out.println("C sinifi dergilerin listesi");
            break;

        default :
            System.out.println("Hatali secim! 1, 2 ya da 3'e basiniz.");
            break;
        }
	}

}
