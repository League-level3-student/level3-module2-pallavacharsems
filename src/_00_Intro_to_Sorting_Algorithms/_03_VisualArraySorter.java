package _00_Intro_to_Sorting_Algorithms;

import java.awt.Color;
import java.util.Random;

import processing.core.PApplet;

/*
 * Goal: Create a program that sorts each rectangle by height!
 * 
 * 1. Create an array of ints. Do not initialize it.
 
 *In the settings() method:
 * 2. Set the size of your window to at least 500 width 500 height
  
 * In the setup() method:
 * 3. Initialize your array to contain 50 ints
 * 
 * 4. Initialize the ints in the array with random numbers from
 *    0 to the window height. Use the following code to get a random int:
 *    (int)random(height)
 * 
 * 5. Call the noStroke() method to remove the outline for each shape
 * 
 * In the draw() method:
 * 6. Set the background color with background(r, g, b);
 * 
 * 7. Set the color for your graph using the fill() method
 * 
 * 8. Draw a rectangle for each int in your array.
 *    the x value will be the loop variable multiplied by (width/intArray.length)
 *    the y value will the height variable
 *    the width is (width/intArray.length)
 *    the height is the negative array value at the array index, e.g. -intArray[i]
 * 
 * 9. Call the stepSort method
 * 
 * 10. Extract the code from step 4 that randomizes the array into a new method.
 * 
 * 11. Call the method you made in step 10 when the mouse is pressed using the
 *     mousePressed variable
 */
public class _03_VisualArraySorter extends PApplet {
	static final int WIDTH = 500;
	static final int HEIGHT = 500;
int arr[];
Random rand = new Random();
int num = HEIGHT;

	@Override
	public void settings() {
setSize(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
arr = new int[50];
randomize();
noStroke();
	}
	public void randomize() {
		for (int i = 0; i < arr.length; i++) {
			int rando = rand.nextInt(num);
			arr[i] = rando;
		}
	}

	@Override
	public void draw() {
background(Color.blue.getRGB());
fill(Color.red.getRGB());
for (int i = 0; i < arr.length; i++) {
rect(i*(WIDTH/arr.length), HEIGHT, WIDTH/arr.length, -arr[i]);
stepSort(arr);
if(mousePressed) {
	randomize();
}
}
	}

	static public void main(String[] passedArgs) {
		PApplet.main(_03_VisualArraySorter.class.getName());
	}

	/*********************** DO NOT MODIFY THE CODE BELOW ********************/

	int startIndex = 1;

	void stepSort(int[] arr) {
		for (int i = startIndex; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				int t = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = t;

				startIndex = i;
				return;
			}
		}
		startIndex = 1;
	}
}