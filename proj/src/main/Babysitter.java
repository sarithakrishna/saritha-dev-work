package main;



public class Babysitter {
	


	public static final String START_TIME_MESSAGE = "starts no earlier than 5:00PM";
	public static final String END_TIME_MESSAGE = "leaves no later than 4:00AM";
	public static final int EARLIEST_START_TIME = 17;
	public static final int MAX_END_TIME = 4;
	public static final int DEFAULT_BED_TIME = 21;
	
	private int startTime;
	private int endTime;
	private int bedTime;
	private CalculateFee calculateFee;
	
	public Babysitter() {
		startTime = EARLIEST_START_TIME;
		endTime = MAX_END_TIME;
		bedTime = DEFAULT_BED_TIME;
		calculateFee = new CalculateFee(startTime, endTime, bedTime);
	}
	
	public Babysitter(int startTime, int endTime, int bedTime) {
		validateBabySittingTime(startTime, endTime, bedTime);
		this.startTime = startTime;
		this.endTime = endTime;
		this.bedTime = bedTime;
		calculateFee = new CalculateFee(startTime, endTime, bedTime);
	}


	private void validateBabySittingTime(int startTime, int endTime,
			int bedTime) {
		// TODO Auto-generated method stub
		
		if(startTime < EARLIEST_START_TIME && startTime > MAX_END_TIME) {
			try {
				throw new RuntimeException(START_TIME_MESSAGE);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (endTime < EARLIEST_START_TIME && endTime > MAX_END_TIME) {
			try {
				throw new RuntimeException(END_TIME_MESSAGE);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
		
	}
	
	
	public int getStartTime() {
		return startTime;
	}

	
	public int getEndTime() {
		return endTime;
	}

	
	public int getBedTime() {
		return bedTime;
	}

	public int getCalculateFee() {
		return calculateFee.calculate();
	}
	

}
