package Types_Yas;

public class Types {

	public static void main(String[] args) {
		// byte tipi
		byte bytedeger = 100;
		
		
		System.out.println("Deger:"+bytedeger);
		
		// short tipi
		short shortdeger = 1234;
		
		
		System.out.println("Short Deger:"+shortdeger);
		
		//int tipi
		int intdeger = 1231231;
				
		System.out.println("Int Deger:"+intdeger);
      
		//long tipi
		long longdeger = 123123123;
		
		System.out.println("Long Deger:"+longdeger);
		
		//B�ylede oluyor:    byte bytedeger = 100;
		//                   short shortdeger = 1233;
		//                   int intdeger = 123123;
		//                   long longdeger = 123123133;
		// System.out.println("Byte Deger:"+bytedeger + " %n Short Deger: " +shortDeger + "%n Int Deger: "+intDeeger+" %n Long Deger: "+longdeger );
		
		//B�ylede oluyor:    System.out.printf("%n byteDeger %d %n LongDeger  %d" ,byteDeger,longDeger);
		
		//double ve float tipi
		double doubleDeger = 10321.24d;
		float floatDeger = 1231.12f;
		
		System.out.printf("%n doubleDeger %f %n floatDeger %f",doubleDeger,floatDeger);
		
		//char ve boolean tipi
		char charDeg�sken = 'C';
		
		boolean booleanDeg�sken = false;
		
		boolean booleanDeg�skenDeger = true;
		
		System.out.printf("%n charDeg�sken %c %n booleanDeg�sken %b",charDeg�sken,booleanDeg�sken);
		
		//Referans tipler.
		Integer integerDeg�sken = null;
		
	//	int a = integerDeg�sken;
		int a =5;
		//int b = null ;
		System.out.printf("%n a degeri : %d ",a);
		
		String degiskenString = "Selam ben string bir degiskenim";
		
		System.out.printf(degiskenString);
		
		
		
	}

}
