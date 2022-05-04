package Fonksiyon_IsEven_Muhasebe_Overloading_Polindrom;

public class Fonksiyon2 {

	public static void ornek(int a) {

		int i;
		for (i = 0; i < a; i++) {
			System.out.println("Java");
		}
		
	}
	
	public static void main(String[] Args ) {
	
		ornek2(5);
		ornek(5);
	}
	
	public static void ornek2(int b) {
		for(int i = 0; i<b ; i++)
		{
			System.out.println("JAVA");
			
		}
	}
}
