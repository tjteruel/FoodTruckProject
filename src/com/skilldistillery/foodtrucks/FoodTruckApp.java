package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	// F I E L D S
	private FoodTruck[] foodTrucks = new FoodTruck[5];
	Scanner kb = new Scanner(System.in);

	// M E T H O D S
	public static void main(String[] args) {

		FoodTruckApp FTA = new FoodTruckApp();
		
		FTA.createTrucks();
		FTA.runUserMenu();

	}

	// INTRODUCTION & CREATE TRUCKS
	public FoodTruck[] createTrucks() {
		System.out.println(
				"Welcome to the Food Truck Maker! \nYou can make up to 5 trucks. \nType 'QUIT' as a Truck Name to stop creating trucks.");
		System.out.println("");
		for (int i = 0; i < 5; i++) {

			System.out.print("Enter name of a food truck: ");
			String name = kb.next();
			//ftCreate.setTruckName(name);
			if (name.equalsIgnoreCase("quit")) {
				System.out.println("All trucks have been entered!");
				break;
			}

			System.out.print("Enter the type of food: ");
			String food = kb.next();
			//ftCreate.setTruckFood(food);
			if (food.equalsIgnoreCase("quit")) {
				System.out.println("All trucks have been entered!");
				break;
			}

			System.out.print("Enter the trucks rating (1-10): ");
			int rating = kb.nextInt();
			//ftCreate.setTruckRating(rating);
			if (rating < 1 || rating > 10) {
				System.out.print("Please rate trucks on a scale of 1 through 10. \n\tWhat is your rating:  ");
				rating = kb.nextInt();

			}
			foodTrucks[i]  = new FoodTruck(name, food, rating);
		}
		return foodTrucks;
	}

	// PRINT TRUCKS LIST
	public void printTrucksList() {
		for (FoodTruck foodTrucksList : foodTrucks) {
			if (foodTrucksList != null) {
				System.out.println(foodTrucksList);
			} else {
				continue;
			}
		}
	}

	// PRINTS HIGHEST RATED TRUCK
	public FoodTruck highestRated() {
		FoodTruck highestRated = null;
		int highestRating = Integer.MIN_VALUE;
		for (FoodTruck foodTruckRating : foodTrucks) {
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

	// AVERAGES TRUCK RATINGS
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

	// DISPLAYS USER MENU
	public void runUserMenu() {
		boolean menuLoop;
		while (menuLoop = true) {
			System.out.println("");
			System.out.println("*****FOOD TRUCK MENU*****");
			System.out.println("*                       *");
			System.out.println("*    1) List Trucks     *");
			System.out.println("*    2) Average Ratings *");
			System.out.println("*    3) Highest Rated   *");
			System.out.println("*    4) Exit            *");
			System.out.println("*                       *");
			System.out.println("*************************");
			System.out.println("");
			System.out.print("Please select an option: ");			
			int userChoice = kb.nextInt();
			
			if (userChoice == 1) {
				printTrucksList();
				
			}
			else if (userChoice == 2) {
				System.out.println("The Average Food Truck Rating Is: " + averageTruckRating(foodTrucks));
				
			}
			else if (userChoice == 3) {
				System.out.println("The Highest Rated Truck Is: " + highestRated());
				
			}
			else if (userChoice == 4) {
				System.out.println("Thanks for using the Food Truck Maker!");
				menuLoop = false;
				break;
			}
			else if (!(userChoice > 1 && userChoice < 4)) {
				System.out.print("Please enter a number from 1 to 4: ");
				userChoice = kb.nextInt();
			}
		}
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
