package CarpimTablosu_Continue_ForDongusu;

public class CarpimTablosu {

	public static void main(String[] args) {

		int altcizgi, i, j;
		System.out.println(" 1 2 3 4 5 6 7 8 9 10 ");
		for (altcizgi = 1; altcizgi <= 45; altcizgi++) // döngüyle uzunca bir çizgi çizelim
		{
			System.out.print("_");
		}
		String bosluk = "    ";
		int carpým;
		System.out.println();
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " | ");
			for (j = 1; j <= 10; j++) {
				carpým = i * j;
				if(carpým > 9) {
					bosluk = "    ";
				}
				else {
					bosluk = "    ";   
			}
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		
	}

}
