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
    
    public static boolean isSquare(int value) {
    	for (int i = 1; i <= value; i++) {
			if(value/i == i) {
    	return true;
    }
    	}
			return false;
    }
    
    public static boolean isCube(int value) {
    	for (int i = 1; i <= value; i++) {
			float g = (float)value/(float)i/(float)i;
    		if(g == i) {
				return true;
    }
    	}
			return false;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        for (int i = 0; i < eggs.size(); i++) {
        	if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
        return -1;
    }
    
    
    public static int countPearls(List<Boolean> oyesters) {
        for (int i = 0; i < oyesters.size(); i++) {
        	if(oyesters.get(i)== true) {
				return i;
			}
		}
        return -1;
    }
    
}
