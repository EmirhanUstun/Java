package DoWhile_Switch_While;

import java.util.Scanner;

public class SwitchOrnek2 {

	/*
	 * Klavyeden 1 ve 7 dahil olmak üzere bu aralýkta girilen sayýya göre haftanýn gününü yazan programý yazalým.
		Klavyeden girilen yazý deðerine göre, rakam karþýlýðýný veren program. 1’den 5’e kadar bir, iki, üç, dört, beþ 
		þeklinde yazýlar girildiðinde bunun rakamsal karþýlýðýný yazdýralým.
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
