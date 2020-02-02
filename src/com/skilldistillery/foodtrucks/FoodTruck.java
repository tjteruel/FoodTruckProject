package com.skilldistillery.foodtrucks;

public class FoodTruck {

	// F I E L D S
	private static int truckId = 1;
	private int individualTruckId;
	private String truckName;
	private String truckFood;
	private int truckRating;

	// M E T H O D S
	public int getIndividualTruckId() {
		return individualTruckId;
	}

	public void setIndividualTruckId(int individualTruckId) {
		this.individualTruckId = individualTruckId;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getTruckFood() {
		return truckFood;
	}

	public void setTruckFood(String truckFood) {
		this.truckFood = truckFood;
	}

	public int getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	public FoodTruck() {
	}

	public FoodTruck(String truckName, String truckFood, int truckRating) {
		this.individualTruckId = truckId;
		this.truckName = truckName;
		this.truckFood = truckFood;
		this.truckRating = truckRating;
		truckId++;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Name: ");
		builder.append(truckName);
		builder.append(" Food: ");
		builder.append(truckFood);
		builder.append(" Rating: ");
		builder.append(truckRating);
		builder.append(" ID: FDTRK00");
		builder.append(truckRating);
		return builder.toString();
		
		
		
	}
}


//return "[Truck ID: " + individualTruckId + ", name: " + truckName + ", food: " + truckFood + ", rating: "
//				+ truckRating + "]";

//git add . 
//git commit -m " note updates"
//git push

//vi
//i - insert
//-end insert
//:wq - write/quit
