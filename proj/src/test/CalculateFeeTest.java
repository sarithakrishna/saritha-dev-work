package test;

import main.Babysitter;
import main.CalculateFee;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateFeeTest {
	
	/* Babysitter fees calculation for 2 hours till bedtime */
	@Test
	public void calculateFeeTestCase1() {
		
		CalculateFee cf = new CalculateFee(19, 21, Babysitter.DEFAULT_BED_TIME);
		assertEquals(CalculateFee.BEDTIME_TO_MIDNIGHT_PAID *2, cf.calculate());
		
	}
	
	/* Babysitter fees calculation for 3 hours till bedtime */
	@Test
	public void calculateFeeTestCase2() {
		
		CalculateFee cf = new CalculateFee(19, 22, 22);
		assertEquals(CalculateFee.BEDTIME_TO_MIDNIGHT_PAID *3, cf.calculate());
		
	}


}
