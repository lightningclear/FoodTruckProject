package com.skilldistillery.foodtruck;

import java.util.Arrays;

public class FoodTruck {
	private static final int length = 0;
	private String truckName;
	private String foodCuisine;
	private double rating;
	private int truckID;
	private static int nextTruckID = 1;

	public FoodTruck() {

	}

	public FoodTruck(String truckName, String foodCuisine, double rating, int truckID) {
		this.truckName = truckName;
		this.foodCuisine = foodCuisine;
		this.rating = rating;
		this.truckID = truckID;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodCuisine() {
		return foodCuisine;
	}

	public void setFoodCuisine(String foodCuisine) {
		this.foodCuisine = foodCuisine;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getTruckID() {
		return truckID;
	}

	public void setTruckID(int truckID) {
		this.truckID = truckID;
	}

	public static int getNextTruckID() {
		return nextTruckID;
	}

	public static void setNextTruckID(int nextTruckID) {
		FoodTruck.nextTruckID = nextTruckID;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Food Truck Name: ").append(truckName);
		sb.append("Cuisine of Truck: ").append(foodCuisine);
		sb.append("Rating ").append(rating);
		sb.append("truckId ").append(truckID);

		return sb.toString();

	}

	public void listFoodTrucks(FoodTruck[] numFoodTruck) {
		for (int i = 0; i < numFoodTruck.length; i++) {
			System.out.println(numFoodTruck[i]);
		}
		return;
	}

	private double averageRating(FoodTruck numFoodTruck) {
		double sum = 0;
		int counter = 0;
		for (double i = 0; i < counter; i++) {
			if(i < counter) {
				sum = sum + (numFoodTruck[i]
			}
			
		}String total;
		System.out.println("rating is" + total);
		;

	}

	public void highestRated(FoodTruck[] numFoodTruck) {
		int[] numFoodTruck1 = null;
		Arrays.sort(numFoodTruck1, nextTruckID, length);
		
		
		return;
}}
