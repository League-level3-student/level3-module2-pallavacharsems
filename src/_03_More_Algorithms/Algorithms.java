package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
	
	public static boolean isPrime(int value) {
		
		for (int i = 2; i < value; i++) {
			if(value % i == 0) {
				
				return false;
				
			}
		}
		return true;
		
	}
    
    public static String multiply(int num1, int num2) {
        int g = num1*num2;
        String h = num1 + " x " + num2 + " = " + g;
        return h;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        return 0;
    }
}
