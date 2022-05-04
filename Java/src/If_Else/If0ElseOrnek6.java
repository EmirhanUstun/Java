package If_Else;

import java.util.Scanner;

public class If0ElseOrnek6 {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
        double gelir, v, v1, v2, v3, v4;
        System.out.println("Gelir miktarýnýz (TL): ");
        gelir = giris.nextDouble();
        v1 = 150000000 * 0.25;
        v2 = 150000000 * 0.30;
        v3 = 300000000 * 0.35;
        v4 = 600000000 * 0.40;
        if (gelir <= 150000000)
            v = gelir * 0.25;
        else if (gelir <= 300000000)
            v = v1 + (gelir - 150000000) * 0.3;
        else if (gelir <= 600000000)
            v = v1 + v2 + (gelir - 300000000) * 0.35;
        else if (gelir <= 1200000000)
            v = v1 + v2 + v3 + (gelir - 600000000) * 0.4;
        else
            v = v1 + v2 + v3 + v4 + (gelir - 1200000000) * 0.5;
        System.out.println("Odemeniz gereken vergi: " + v);

	}

}
