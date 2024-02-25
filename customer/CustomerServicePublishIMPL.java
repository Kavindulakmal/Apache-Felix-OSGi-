package customer;

import java.util.Random;
import java.util.Scanner;

public class CustomerServicePublishIMPL {

	
	public void CustomerService() {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("");
			System.out.println("*************************WELCOME TO CUSTOMER SERVICE*************************");
			System.out.println("");
			System.out.print("Enter Your Name : ");
			String name = sc.nextLine();

			System.out.println("");
			System.out.println("==================================================================================");
			System.out.println("WELCOME.......HELLO " + name);
			System.out.println("==================================================================================");
			System.out.println("");

			int customerSelection = 1;
			while (customerSelection == 1) {

				System.out.println("");
				System.out.println("******************************* SERVICE*******************************");
				System.out.println("");

				System.out.println("\t\t    ****************Customer List****************");
				System.out.println("");
				System.out.println("\t\t     Customer Type		" );
				System.out.println("\t\t    =========================================");
				System.out.println("\t\t    1. The Couple Customer	");
				System.out.println("\t\t    2. The Family in a Rush");
				System.out.println("\t\t    3. The Regulars Customer" );
				System.out.println("\t\t    0. Exit");
				System.out.println("");

				System.out.print("Please Select the Customer type you want.(1/2/3/0) : ");
				int option = sc.nextInt();

				if (option == 1 || option == 2 || option == 3) {

					System.out.print("Enter Quantity : ");
					int qty = sc.nextInt();
					System.out.println();

					Random rand = new Random();
					int orderNo = rand.nextInt(1000);

					if (qty > 0) {

						if (option == 1) {
							double discount = (qty *10)/100;
							double total = ( qty - discount );
							System.out.println("Customer Number \t: " + orderNo);
							System.out.println("Customer Name \t: " + "Couple Customer");
							System.out.println("payment \t: " + qty);
							System.out.println("Total payment\t: " + total);
							System.out.println("");

						} else if (option == 2) {
							double discount = (qty *20)/100;
							double total = ( qty - discount );
							System.out.println("Customer Number \t: " + orderNo);
							System.out.println("Customer Name \t: " + "Family in a Rush");
							System.out.println("payment \t: " + qty);
							System.out.println("Total payment\t: " + total);
							System.out.println("");

						} else {
							double discount = (qty *25)/100;
							double total = ( qty - discount );
							System.out.println("Customer Number \t: " + orderNo);
							System.out.println("Customer Name \t: " + "Regulars Customer");
							System.out.println("payment \t: " + qty);
							System.out.println("Total payment\t: " + total);
							System.out.println("");

						}

						System.out.println("Do you want to continue ? (Type 1 = Yes / Type 2 = No) : ");
						customerSelection = sc.nextInt();

						if (customerSelection == 2) {
							System.out.println("");
							System.out.println(
									"**********************************THANK YOU********************************************");
							System.out.println(
									"*******************************HAVE A NICE DAY*****************************************");
							System.out.println();
						}

					} else {

						System.out.println("Sorry!!! Maximum Quantity 10 at once..!");
						System.out.println("Do you want to continue ? (Type 1 = Yes / Type 2 = No) : ");
						customerSelection = sc.nextInt();

						if (customerSelection == 2) {
							System.out.println("");
							System.out.println(
									"**********************************THANK YOU********************************************");
							System.out.println(
									"*******************************HAVE A NICE DAY*****************************************");
							System.out.println();
							return;
						}

					}

				} else if (option == 0) {

					System.out.println("");
					System.out.println(
							"**********************************THANK YOU********************************************");
					System.out.println(
							"*******************************HAVE A NICE DAY*****************************************");
					System.out.println();
					return;

				} else {

					System.out.println("");
					System.out.println("Invalid Input.!!Do you want to continue.? (Type 1 = Yes / Type 2 = No) : ");
					customerSelection = sc.nextInt();

					if (customerSelection == 2) {
						System.out.println("");
						System.out.println(
								"**********************************THANK YOU********************************************");
						System.out.println(
								"*******************************HAVE A NICE DAY*****************************************");
						System.out.println();
					}

				}

				while (customerSelection != 1 && customerSelection != 2) {
					System.out.println("");
					System.out.println("Invalid Input.");
					System.out.println("Type 1 = Continue Food Ordering / Type 2 = Exit  ");
					customerSelection = sc.nextInt();

					if (customerSelection == 2) {
						System.out.println();
						System.out.println(
								"**********************************THANK YOU********************************************");
						System.out.println(
								"*******************************HAVE A NICE DAY*****************************************");
						System.out.println();
					}
				}

			}
		}

	}

}


