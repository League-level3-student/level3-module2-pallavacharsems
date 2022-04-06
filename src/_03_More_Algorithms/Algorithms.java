package _03_More_Algorithms;

import java.util.ArrayList;
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
    
    
    
    public static double findTallest(List<Double> peeps) {
    	double high = peeps.get(0);
    	for (int i = 0; i < peeps.size(); i++) {
        	if(high<peeps.get(i)) {
        		high = peeps.get(i);
        	}
			
			
		}
    	return high;
        
    }
    
    public static String findLongestWord(List<String> words) {
    	String log = words.get(0);
    	for (int i = 0; i < words.size(); i++) {
        	if(log.length()<words.get(i).length()) {
        		log = words.get(i);
        	}
			
			
		}
    	return log;
        
    }
    
    public static boolean containsSOS(List<String> message) {
    	String SOS = "... --- ...";
    	for (int i = 0; i < message.size(); i++) {
        	if(message.get(i).contains(SOS)) {
        		return true;
        	}
			
			
		}
    	return false;
        
    }
    
    
    public static List<Double> sortScores(List<Double> results) {
    	for (int j = 0; j < results.size(); j++) {
    		
    	
    	for (int i = 0; i < results.size()-1; i++) {
        		Double res = results.get(i);
            	if(results.get(i)>results.get(i+1)) {
        			results.set(i, results.get(i+1));
        			results.set(i+1, res);
        		
        	
			
			
		}
    	}
        
    }
    	return results;
    
    
}
    public static List<String> sortDNA(List<String> seq) {
    	for (int j = 0; j < seq.size(); j++) {
    		
        	
        	for (int i = 0; i < seq.size()-1; i++) {
            		String res = seq.get(i);
                	if(seq.get(i).length()> seq.get(i+1).length()) {
            			seq.set(i, seq.get(i+1));
            			seq.set(i+1, res);
            		
            	
    			
    			
    		}
        	}
            
        }
    	return seq;
        
    }
    
    
    
    
    
    
    
    public static List<String> sortWords(List<String> words) {
    	for (int j = 0; j < words.size(); j++) {
    		
        	
        	for (int i = 0; i < words.size()-1; i++) {
            		String wor = words.get(i);
                	if(words.get(i).compareTo(words.get(i+1))> 0) {
            			words.set(i, words.get(i+1));
            			words.set(i+1, wor);
            		
            	
    			
    			
    		}
        	}
            
        }
    	return words;
        
    }
}
