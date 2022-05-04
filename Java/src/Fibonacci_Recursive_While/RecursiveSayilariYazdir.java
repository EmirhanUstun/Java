package Fibonacci_Recursive_While;

public class RecursiveSayilariYazdir {

	 public static void main(String[] args)
	    {
	        recursiveMethod(5);
	    }

	    static void recursiveMethod(int num)
	    {
	    	
	        if(num == 0)
	            return;
	        System.out.print(num + " ");
	        num--;
	        recursiveMethod(num);
	    }
	    
	    static void sayilariyazdir(int parameter) {
	    	parameter --;
	    	if(parameter == 0) {
	    		return;
	    	}
	    	
	    	else {
	    		System.out.println(parameter + " ");
	    		sayilariyazdir(parameter);
	    	}
	    		
	    }
	}
