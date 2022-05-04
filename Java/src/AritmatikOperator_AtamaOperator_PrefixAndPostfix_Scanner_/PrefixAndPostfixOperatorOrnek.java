package AritmatikOperator_AtamaOperator_PrefixAndPostfix_Scanner_;

public class PrefixAndPostfixOperatorOrnek {

	public static void main(String[] args) {
		int sayý = 0;
		   int prefixArtým;
		   int prefixEksim;
		   int postfixArtým;
		   int postfixEksim;
		   int pozitif;
		   int negatif;
		   
		   prefixArtým = ++sayý;
		   System.out.println("prefix-Artým = " + prefixArtým);
		   
		   prefixEksim = --sayý;
		   System.out.println("prefix-Eksim = " + prefixEksim);
		   
		   postfixEksim = sayý--;
		   System.out.println("postfix-Eksim = " + postfixEksim);
		   
		   postfixArtým = sayý++;
		   System.out.println("postfix-Artým = " + postfixArtým);
		   
		
		
	}

}
