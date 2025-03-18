package practice1.DataDrivenTesting;

import java.util.Random;

public class GenerateRandumNumberTest {

	public static void main(String[] args) {
		
		Random random=new Random();
		
		int randomInt = random.nextInt(1000);
		
		System.out.println(randomInt);

	}

}
