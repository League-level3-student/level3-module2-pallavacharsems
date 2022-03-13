package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        String arr[] = new String[5];
        arr[0] = "Joe";
        arr[1] = "Jay";
        arr[2] = "Matt";
        arr[3] = "Fred";
        arr[4] = "Jake";
    	assertEquals(2, _01_LinearSearch.linearSearch(arr, "Matt"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	 int arr[] = new int[5];
         arr[0] = 1;
         arr[1] = 2;
         arr[2] = 3;
         arr[3] = 4;
         arr[4] = 5;
    	assertEquals(2,  _02_BinarySearch.binarySearch(arr, 0, 4, 3));
    	
    }
    @Test
    public void testNegativeBinarySearch() {
    	int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
   	assertEquals(-1,  _02_BinarySearch.binarySearch(arr, 0, 4, 6));
   	
    	
    }
}
