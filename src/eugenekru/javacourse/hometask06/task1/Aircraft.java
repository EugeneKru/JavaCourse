package eugenekru.javacourse.hometask06.task1;

import java.time.Year;

public abstract class Aircraft {
	
	private String name;
	
	private int yearbuilt;
	
	private int capacity;
	
	private int tonnage;
	
	private int speed;	
	
	private int mileage;
	
	private int lifetime;

	public Aircraft(String name, int yearbuilt) {		
		this.name = name;
		this.yearbuilt = yearbuilt;		
	}
	
	public String getName() {
		return name;
	}
	
	public int getYearbuilt() {
		return yearbuilt;
	}	
	
	public int getCapasity() {
		return capacity;
	}
	
	public void setCapasity(int capasity) {
		this.capacity = capasity;
	}
	
	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public void setLifetime(int lifetime) {
		this.lifetime = lifetime;
	}	
	
	public boolean isFlightAllowed() {
		
		int year = Year.now().getValue();
		if((year - this.yearbuilt) < this.lifetime) {
			return true;
		} else {
			return false;
		}
	}
	
	private double getFlightTime(double distance) {
		
		double flighttime = distance / this.speed;
		return flighttime;
	}	
	
	public void printFlightTime(double distance) {
		
		if (!isFlightAllowed()) {
			System.out.println(this.name + " can't fly!!! The lifetime is exceeded.\n");
		} else {
			String time = String.format("%.2f",getFlightTime(distance));		
			int hours = Integer.valueOf(time.substring(0, time.indexOf(',')));		
			int relmin = Integer.valueOf(time.substring((time.indexOf(',') + 1), time.length()));		
			int min = (int) (Math.ceil(relmin * 0.6));
			int[] timearray = {hours, min};
			String[] stringarray = {"hour", "minute"};
			System.out.print(this.name + " flight time - ");
			
			for (int i = 0; i < timearray.length; i++) {
				
				switch(timearray[i]) {		
				case 0 -> stringarray[i] = "";
				case 1 -> stringarray[i] = timearray[i] + " " + stringarray[i] + " ";
				default -> stringarray[i] = timearray[i] + " " + stringarray[i] + "s ";			
				}
				System.out.print(stringarray[i]);
			}
			
			System.out.println();
		}		
		if (distance > getMileage()) {
			System.out.println("Do not take into account refueling time!\n");
		}
	}
	
	@Override
	public String toString() {
		
		String messege = "\nPassengersFleet - " + getName() 
   						+ "\nYear built: " + getYearbuilt() + "\tCapasity: " + getCapasity()
   						+ "\nSpeed - " + getSpeed() + " km/h\tMileage - " + getMileage() + " km\n";		
		if (getCapasity() > 0) {
			return messege;
		} else {
			return messege.replace("\tCapasity: " + getCapasity(), "\tTonnage: "
								+ getTonnage()).replace("\nPassengersFleet - ", "\nCargoFleet - ");
		}		
	}	
}
	
	
	


