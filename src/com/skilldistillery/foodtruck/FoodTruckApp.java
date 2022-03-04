package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		FoodTruck[] numTrucks = new FoodTruck[5];

		System.out.println("Enter the name of food truck: ");
		int FTCounter = 0;
		for (int i = 0; i < numTrucks.length; i++) {
			String truckName = kb.next();

			if (truckName.equalsIgnoreCase("quit")) {
				System.out.println("Have a good day.");
				break;
			} else {
				System.out.println("please enter the category of your food truck");
				String foodCuisine = kb.next();
				System.out.println("please rate the food truck on a scale of 1-5");
				double rating = kb.nextDouble();
				System.out.println("Enter another name or type quit to terminate the program");

				numTrucks[i] = new FoodTruck(truckName, foodCuisine, rating, i);

				FTCounter++;

			}
		}
		boolean end = true;
		while (end) {
			System.out.println("1. List all exsiting food trucks.");
			System.out.println("2. See the average rating of all food trucks.");
			System.out.println("3. Display the highest-rated food truck.");
			System.out.println("4. Quit the pogram.\n");
			String choice = kb.nextLine();

			switch (choice) {
			case "1":
				for (int i = 0; i < FTCounter; i++) {
					System.out.println(numTrucks[i].getTruckName());
				}
				break;
			case "2":
				double totalRating = 0.0;
				for (int i = 0; i < FTCounter; i++) {
					double rating = numTrucks[i].getRating();
					totalRating += rating;
				}
				System.out.println("The avaerge rating is: " + totalRating / FTCounter + "\n");
				break;
			case "3":
				String highestTruck = "";
				double highestRating = -1.0;
				for (int i = 0; i < FTCounter; i++) {
					if (numTrucks[i].getRating() > highestRating) {
						highestTruck = numTrucks[i].getTruckName();
						highestRating = numTrucks[i].getRating();
					}
				}
				break;
			case "4":

				System.out.println("Menu quit");
				end = false;
				break;
			}
		}
	}
}