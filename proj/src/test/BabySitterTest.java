package test;

import static org.junit.Assert.*;
import main.Babysitter;

import org.junit.Test;

public class BabySitterTest {

	/* Babysitter returns start time as 17 */
	@Test
	public void babySitterStartTimeReturns() {
		Babysitter babysitter = new Babysitter();
		assertEquals(17, babysitter.getStartTime());
	}

	/* Babysitter returns end time as 17 */
	@Test
	public void babySitterEndTimeReturns() {
		Babysitter babysitter = new Babysitter();
		assertEquals(4, babysitter.getEndTime());
	}

	/* Babysitter accepts start time and returns accepted start time */
	@Test
	public void test() {
		Babysitter babysitter = new Babysitter(18, 4, Babysitter.DEFAULT_BED_TIME);
		assertEquals(18, babysitter.getStartTime());
	}

	/* Babysitter does not accept invalid end time and throws exception */
	@Test
	public void testFail() {
		try {
			new Babysitter(20, 6, Babysitter.DEFAULT_BED_TIME);
			fail("Exception to be thrown");
		} catch (Exception ex) {
			assertEquals(Babysitter.END_TIME_MESSAGE, ex.getMessage());
		}
	}
}