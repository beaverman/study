package JUnit;
import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitMathClass2 {

	public JUnitMathClass2() {
		provider = new MathClass();
	}

	@Test
	public void multiply() {
		int first = 50;
		int second = 20;
		assertEquals(first * second, provider.Multiply(first, second));
	}

	MathClass provider;


}
