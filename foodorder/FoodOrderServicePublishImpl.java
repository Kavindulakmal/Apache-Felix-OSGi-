package foodorder;

import java.util.Random;
import java.util.Scanner;

public class FoodOrderServicePublishImpl implements FoodOrderServicePublish {

	@Override
	public void foodOrderService() {

		Scanner sc = new Scanner(System.in);

		

		int Meal = 1;
		while (Meal == 1) {

			

			System.out.println("\t\t    Meal List");
			System.out.println("");
			System.out.println("\t\t    	meal Name		" + "Price"  );
			System.out.println("\t\t                                    ");
			System.out.println("\t\t    1. Breakfast	" + "350");
			System.out.println("\t\t    2. Lunch		" + "650");
			System.out.println("\t\t    3. Dinner		" + "450");
			System.out.println("\t\t    0. Exit");
			System.out.println("");

			System.out.print("Please Select the Meal 1 or 2 or 3 : ");
			int option = sc.nextInt();

			if (option == 1 || option == 2 || option == 3) {

				System.out.print("Enter Quantity : ");
				int qty = sc.nextInt();
				System.out.println();

				Random rand = new Random();
				int orderNo = rand.nextInt(1000);

				if (qty > 0 && qty <= 10) {

					if (option == 1) {
						double total = (350 * qty);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Meal: \t: " + "Breakfast");
						System.out.println("Quantity \t: " + qty);
						System.out.println("Total \t: " + total);
						System.out.println("");

					} else if (option == 2) {
						double total = (650 * qty);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Meal: \t: " + "Lunch");
						System.out.println("Quantity \t: " + qty);
						System.out.println("Total \t: " + total);
						System.out.println("");

					} else {
						double total = (450 * qty);
						System.out.println("Order Number \t: " + orderNo);
						System.out.println("Meal: \t: " + "Dinner");
						System.out.println("Quantity \t: " + qty);
						System.out.println("Total \t: " + total);
						System.out.println("");

					}

					System.out.println("Want to continue ? (Press 1 = Yes / Press 2 = No) : ");
					Meal = sc.nextInt();

					if (Meal == 2) {
						System.out.println("");
						System.out.println("Thank you come again");
						System.out.println();
					}

				} else {

					System.out.println("Sorry!");
					System.out.println("Do you want to continue ? (Press 1 = Yes / Press 2 = No) : ");
					Meal = sc.nextInt();

					if (Meal == 2) {
						System.out.println("Thank you come again");
						System.out.println();
						return;
					}

				}

			} else if (option == 0) {

				System.out.println("");
				System.out.println("Thank you come again");
				System.out.println();
				return;

			} else {

				System.out.println("");
				System.out.println("Invalid Input! (Press 1 = Yes / Press 2 = No) : ");
				Meal = sc.nextInt();

				if (Meal == 2) {
					System.out.println("");
					System.out.println("Thank ou come again");
					System.out.println();
				}

			}

			while (Meal != 1 && Meal != 2) {
				System.out.println("");
				System.out.println("Invalid Input.");
				System.out.println("Press 1 = To Continue or Press 2 = Exit  ");
				Meal = sc.nextInt();

				if (Meal == 2) {
					System.out.println();
					System.out.println("Thank you come again");
					System.out.println();
				}
			}

		}

	}
}
