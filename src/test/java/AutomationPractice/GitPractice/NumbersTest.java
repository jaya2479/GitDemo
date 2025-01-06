package AutomationPractice.GitPractice;

import org.testng.annotations.Test;

public class NumbersTest {

	@Test
	public void EvenNumbers() {
		
		System.out.println("2 is an Even Number");
		System.out.println("4 is an Even Number");
	}
	
	@Test
    public void OddNumbers() {
		
		System.out.println("3 is an Odd Number");
		System.out.println("5 is an Odd Number");
	}
	
}
