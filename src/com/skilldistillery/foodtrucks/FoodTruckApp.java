package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	// F I E L D S
	private FoodTruck[] foodTrucks = new FoodTruck[5];
	Scanner kb = new Scanner(System.in);

	// M E T H O D S
	public static void main(String[] args) {

		FoodTruckApp FTA = new FoodTruckApp();
		String truckName;
		String truckFood;
		String truckRating;

		FTA.createTrucks();
		//ftCreate.displayTruckInfo();
		// FTA.printTrucks();
	}

	public void createTrucks() {
		for (int i = 1; i <= 5; i++) {
			FoodTruck ftCreate = new FoodTruck();

			System.out.print("Enter name of a food truck: ");
			String name = kb.next();
			ftCreate.setTruckName(name);
			if (name.equalsIgnoreCase("quit")) {
				break;
			}

			System.out.print("Enter the type of food: ");
			String food = kb.next();
			ftCreate.setTruckFood(food);
			if (food.equalsIgnoreCase("quit")) {
				break;
			}

			System.out.print("Enter the trucks rating (1-10): ");
			int rating = kb.nextInt();
			ftCreate.setTruckRating(rating);
			if ( rating < 1 || rating > 10 ) {
				System.out.print("Please rate trucks on a scale of 1 through 10. \n\tWhat is your rating:  ");
				rating = kb.nextInt();
				
			}
		}
	}

	public void printTrucksList() {
		for (FoodTruck foodTruckList : foodTrucks) {
			if (foodTruckList != null) {
				System.out.println(foodTruckList);
			} else {
				continue;
			}
		}
	}

//			
	public FoodTruck highestRated() {
		FoodTruck highestRated = null;
		int highestRating = Integer.MIN_VALUE;
		for (FoodTruck foodTruckRating: foodTrucks) {
			if (foodTruckRating == null) {
				break;
			}
			if (foodTruckRating != null) {
				if (foodTruckRating.getTruckRating() > highestRating) {
					highestRated = foodTruckRating;
				}
			}
		}
		return highestRated;
	}
	
	public double averageTruckRating(FoodTruck[] foodTruckRater) {
		double truckRating = 0.0;
		int counter = 0;
		for (int i = 0; i < foodTruckRater.length; i++) {
			if (foodTruckRater[i] != null) {
				counter++;
				truckRating += foodTruckRater[i].getTruckRating();
			}
			if (foodTruckRater[i] == null) {
				break;
			}
		}
		truckRating = truckRating / counter;
		return truckRating;
	}
	
}

//			FoodTruck truckInfo = new FoodTruck();
//				truckInfo.truckName = truckName;
//				truckInfo.truckFood = truckFood;
//				truckInfo.truckRating = truckRating;
//				
//		
//			}
//		}
