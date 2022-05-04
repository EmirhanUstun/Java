package If_Else;

public class If0ElseOrnek4 {

	public static void main(String[] args) {

		int sýnav1 = 45;
		int sýnav2 = 50;
		int sýnav3 = 66;
		//ortalamayý float olarak alýyoruz.
		float ortalama = (float) (sýnav1+sýnav2+sýnav3)/3;
		String sonuc;
		if (ortalama<45) {
		    //0-44 arasý oratalama zayýf
			sonuc="Zayif";
		} else if (ortalama<55) {
		    //45-55 arasý ortalama gecer
		    sonuc="Gecer";
	    } else if (ortalama<70) {
	        //55-69 arasý ortalamaya orta
	        sonuc="Orta";
        } else if (ortalama<85) {
            //70-84 arasý ortalamaya iyi
            sonuc="Iyi";
        } 
						
		
	}

}
