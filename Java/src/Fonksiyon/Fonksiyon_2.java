package Fonksiyon;

import java.util.Scanner;

public class Fonksiyon_2 {

	public static void faktoriyel() {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Say�:");
    	
    	int sayi = scan.nextInt();
    	int faktoriyel = 1;
    	while (sayi > 0 ) {
    		
    		faktoriyel *= sayi ;
    		sayi--;
    	}
    	
    	System.out.println("Faktoriyel de�er:" + faktoriyel);
    	
    }
	public static void main(String[] args) {

		faktoriyel();
		
	}

}
