package DoWhile_Switch_While;

public class SwitchOrnek {

	public static void main(String[] args) {

		int ay = 5;
		System.out.println("switch'ten �nceki kod kesimi");
		switch (ay) {
		case 1:
			System.out.println("Ocak");
			break;
		case 2:
			System.out.println("�ubat");
			break;
		case 3:
			System.out.println("Mart");
			break;
		case 4:
			System.out.println("Nisan");
			break;
		case 5:
			System.out.println("Mayis");
			break;
		case 6:
			System.out.println("Haziran");
			break;
		case 7: 
			System.out.println("Temmuz");
			break;
		case 8:
			System.out.println("A�ustos");
			break;
		case 9:
			System.out.println("Eyl�l");
			break;
		case 10:
			System.out.println("Ekim");
			break;
		case 11:
			System.out.println("Kas�m");
			break;
		case 12:
			System.out.println("Aral�k");
			break;
		default:
			System.out.println("Ay 1 - 12 aral���nda de�il");
		}
		System.out.println("switch'ten sonraki kod kesimi");

	}

}
