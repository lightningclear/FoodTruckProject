package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double rating = 0;
		FoodTruck[] numTrucks = new FoodTruck[5];

		System.out.println("Enter the name of food truck: ");
		for (int i = 0; i < numTrucks.length; i++) {
			FoodTruck numFoodTruck = new FoodTruck();
			String truckName = kb.next();

			if (truckName.equalsIgnoreCase("quit")) {
				System.out.println("Have a good day.");
			} else {
				System.out.println("please enter the category of your food truck");
				String foodCuisine = kb.next();
				System.out.println("please rate the food truck on a scale of 1-5");
				rating = kb.nextInt();
				System.out.println("Enter another name or type quit to terminate the program");

				numFoodTruck = new FoodTruck(truckName, foodCuisine, rating, i);

			}
		}
		boolean end = true;
		while (end) {
			FoodTruck numFoodTruck = new FoodTruck();

			System.out.println("1. List all exsiting food trucks.");
			System.out.println("2. See the average rating of all food trucks.");
			System.out.println("3. Display the highest-rated food truck.");
			System.out.println("4. Quit the pogram.\n");
			String choice = kb.nextLine();

			switch (choice) {
			case "1":
				numFoodTruck.listFoodTrucks(numTrucks);
				break;
			case "2":

				rating = numFoodTruck.averageRating();
				System.out.println("The avaerge rating is: " + rating + "\n");
				break;
			case "3":

				numFoodTruck.highestRated(numFoodTruck);
				break;
			case "4":

			case "exit":
				System.out.println("Menu quit");
				end = false;
				break;
			}
		}
	}
}