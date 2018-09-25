package func2lab;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void superDigit10Test() {
	    assertEquals(1, Solution.superDigit(10));
	}
	 
    @Test
    public void superDigit3Test() {
        assertEquals(3, Solution.superDigit(3));
    }

    @Test
    public void superDigit9875Test() {
        assertEquals(2, Solution.superDigit(9875));
    }
    
    @Test
    public void superDigit3418Test() {
        assertEquals(7, Solution.superDigit(3418));
    }
    
}
