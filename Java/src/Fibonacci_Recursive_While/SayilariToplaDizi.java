package Fibonacci_Recursive_While;

import java.util.Scanner;

public class SayilariToplaDizi {

	 public static void main(String[] args) {
	        Scanner giris = new Scanner(System.in);
	        // int sayi[] = new int[3]; c de dizi tanimi
	        int[] sayi = new int[3];
	        int toplam, i;
	        toplam = 0;
	        for (i = 1; i <= 3; i++) {
	            System.out.print("Bir sayi giriniz: ");
	            sayi[i-1] = giris.nextInt();
	            toplam = toplam + sayi[i-1];
	        }
	        System.out.println("Girdiniz sayilarin toplami: " + toplam);
	        System.out.println("Sayi dizisinin ikinci elemani: " + sayi[2]);
	    }
	}
