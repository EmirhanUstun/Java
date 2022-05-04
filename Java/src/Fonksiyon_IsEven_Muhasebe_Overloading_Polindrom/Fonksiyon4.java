package Fonksiyon_IsEven_Muhasebe_Overloading_Polindrom;

public class Fonksiyon4 {

	public static void printSquare(double x) {
		System.out.println("Void öethod icinde: " + x * x);
	}

	public static void main(String[] arguments) {
		printSquare(5);
		double sonuc = square(5);
		System.out.println("Main method icinde: " + sonuc );
	}

	public static double square (double x ){
		System.out.println("Square method icinde: " + x*x);
		return x * x ;
	}
}
