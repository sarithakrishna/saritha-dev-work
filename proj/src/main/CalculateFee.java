package main;

public class CalculateFee {
	

	public static final int STARTTIME_TO_BEDTIME_PAID = 12;
	public static final int BEDTIME_TO_MIDNIGHT_PAID = 8;
	public static final int MIDNIGHT_TO_END_PAID = 16;
	
	private int startTime;
	private int endTime;
	private int bedTime;
	
	public CalculateFee(int startTime, int endTime, int bedTime) {
		this.startTime = format(startTime);
		this.endTime = format(endTime);
		this.bedTime = format(bedTime);
	}
	private int format(int hour) {
		// TODO Auto-generated method stub
		if(hour >=0 && hour <=4) {
			hour +=24;
		}
		return hour;
	}
	
	public int calculate() {
		
		return STARTTIME_TO_BEDTIME_PAID * getHoursTillBedTime() +
			   BEDTIME_TO_MIDNIGHT_PAID * getHoursBetweenBedTimeAndMidnight() +
			   MIDNIGHT_TO_END_PAID * getHoursBetweenMidnightAndEnd();
	}
	private int getHoursBetweenMidnightAndEnd() {
		// TODO Auto-generated method stub
		if (endTime <=24) {
			return 0;
		}
		return endTime - 24;
	}
	private int getHoursBetweenBedTimeAndMidnight() {
		// TODO Auto-generated method stub
		
		if (endTime < bedTime) {
			return 0;	
		}
		if (endTime < 24) {
			return endTime - startTime;
		}
		return 24 - bedTime;
		
	}
		
	private int getHoursTillBedTime() {
		// TODO Auto-generated method stub
		
		if (endTime <= 24) {
			return 0;
		}
		return endTime - 24;
	}

}
