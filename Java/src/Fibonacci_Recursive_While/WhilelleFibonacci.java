package Fibonacci_Recursive_While;

public class WhilelleFibonacci {

	public static void main(String[] args) {
		int maxSayi = 10, oncekiSayi = 0, sonrakiSayi = 1;
		System.out.print("Fibonacci Serisi " + maxSayi + " icin: ");

		int i = 1;
		while (i <= maxSayi) {
			System.out.print(oncekiSayi + " ");
			int sum = oncekiSayi + sonrakiSayi;
			oncekiSayi = sonrakiSayi;
			sonrakiSayi = sum;
			i++;
		}
		int m = 1;
		while (i <= maxSayi) {
			System.out.print(oncekiSayi + " ");
			int sum = oncekiSayi + sonrakiSayi;
			oncekiSayi = sonrakiSayi;
			sonrakiSayi = sum;
			m++;
         }
	}
}
