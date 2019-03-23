package HW3test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import HomeWork3.HW3;





public class test {
	HW3 cal;
	@Before
	public void setup() {
		cal =new HW3();
	}
	@Test
	public void testchecktrue() {
		String testresult="2,3,5,7,11,";
		assertEquals(testresult,cal.printPrimes(5));
	}

}
