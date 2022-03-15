package ba.edu.ibu.intro;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
	    System.out.println("Reading numbers...");
	    int[] numbers = MaxInteger.readNumbers("/home/aldin-sxr/numbers.txt");
	    int maxNumber = MaxInteger.findMax(numbers);
	    System.out.println("Maximum number is: " + maxNumber);
	    System.out.println("Writing to file...");
	    MaxInteger.writeToFile("/home/aldin-sxr/maxNumber.txt", maxNumber);
	}
	
}
