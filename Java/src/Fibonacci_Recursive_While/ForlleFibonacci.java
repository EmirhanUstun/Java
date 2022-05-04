package Fibonacci_Recursive_While;

import java.util.Scanner;

public class ForlleFibonacci {

	public static void main(String[] args) {

		int maxSayi = 0;
		int birOncekiSayi = 0;
		int birSonrakiSayi = 1;

		System.out.println("Fibonacci'de kac sayi istersiniz? :");
		Scanner scanner = new Scanner(System.in);
		maxSayi = scanner.nextInt();
		System.out.print("Fibonacci Serisi " + maxSayi + " sayilar:");

		for (int i = 1; i <= maxSayi; ++i) {
			System.out.print(birOncekiSayi + " ");
			// Her iterasyonda, ikinci sayiyi ilk sayiya, son iki sayinin toplamini ikinci
			// sayiya atayacagiz.

			int sum = birOncekiSayi + birSonrakiSayi;
			birOncekiSayi = birSonrakiSayi;
			birSonrakiSayi = sum;
		}

	}

}
