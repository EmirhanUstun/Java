package If_Else;

public class If0ElseOrnek4 {

	public static void main(String[] args) {

		int s�nav1 = 45;
		int s�nav2 = 50;
		int s�nav3 = 66;
		//ortalamay� float olarak al�yoruz.
		float ortalama = (float) (s�nav1+s�nav2+s�nav3)/3;
		String sonuc;
		if (ortalama<45) {
		    //0-44 aras� oratalama zay�f
			sonuc="Zayif";
		} else if (ortalama<55) {
		    //45-55 aras� ortalama gecer
		    sonuc="Gecer";
	    } else if (ortalama<70) {
	        //55-69 aras� ortalamaya orta
	        sonuc="Orta";
        } else if (ortalama<85) {
            //70-84 aras� ortalamaya iyi
            sonuc="Iyi";
        } 
						
		
	}

}
