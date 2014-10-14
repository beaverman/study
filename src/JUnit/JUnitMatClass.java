package JUnit;
import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitMatClass {
	MathClass provider;

	public JUnitMatClass() {
		provider = new MathClass();
	}


	@Test
	public void add() {
		int first = 10;
		int second = 20;
		assertEquals(first + second, provider.Add(first, second));
	}

	@Test
	public void substract() {
		int first = 50;
		int second = 20;
		assertEquals(first - second, provider.Substract(first, second));
	}

}
