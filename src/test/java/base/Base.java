package base;

import java.util.Random;

public class Base {
	
	//public static WebDriver driver; //default
	public int generateRandomNumber(int n) {
		Random rand = new Random();
        // Generate random integers in range 0 to 9999999
		return rand.nextInt(n);
		//int rand = rand.nextInt(10000000);
		//return rand;
	}
	
}