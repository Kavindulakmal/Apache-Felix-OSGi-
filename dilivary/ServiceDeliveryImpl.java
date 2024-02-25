package deliveryservice;

import java.util.Random;
import java.util.Scanner;

public class ServiceDeliveryImpl implements ServiceDeliver {
	

	@Override
	public void deliveryService() {

		Scanner sc = new Scanner(System.in);

		System.out.println("");
		System.out.println("WELCOME TO FOOD ORDERING SERVICE");
		System.out.println("");
		
		System.out.print("Enter Your Name : ");
		String name = sc.nextLine();

		System.out.println("");
		
		System.out.println("WELCOME " + name);
	
		System.out.println("");

		int deliverytype = 1;
		while (deliverytype == 1) {

			System.out.println("");
			System.out.println("FOOD DELIVERY SERVICE");
			System.out.println("");

			System.out.println("\t\t    ****************DISTANCE****************");
			System.out.println("");
			
			
			System.out.println("\t\t    1. Arround 5km	" );
			System.out.println("\t\t    2. Arround 10km		");
			System.out.println("\t\t    3. Arround 15km		");
			System.out.println("\t\t    0. Exit");
			System.out.println("");

			System.out.print("Please Select the Distance.(1/2/3/0) : ");
			int option = sc.nextInt();

			if (option == 1 || option == 2 || option == 3) {

				System.out.print("Enter Quantity : ");
				int qty = sc.nextInt();
				System.out.println();


					if (option == 1) {
						
						System.out.println("Distance \t: " + "Arround 5km");
						System.out.println("Delivery charge = Rs.100.00 " );
						System.out.println("");

					} else if (option == 2) {
						double total = (450 * qty);
						System.out.println("Distance \t: " + "Arround 10km");
						System.out.println("Delivery charge = Rs.150.00 " );
						System.out.println("");

					} else {
						System.out.println("Distance \t: " + "Arround 15km");
						System.out.println("Delivery charge = Rs.200.00 " );
						System.out.println("");

					}

					System.out.println("Do you want to continue ? (Type 1 = Yes / Type 2 = No) : ");
					deliverytype = sc.nextInt();

					if (deliverytype == 2) {
						System.out.println("");
						System.out.println("THANK YOU");
						System.out.println();
					}

			} else if (option == 0) {

				System.out.println("");
				System.out.println("THANK YOU");
				System.out.println();
				return;

			} else {

				System.out.println("");
				System.out.println("Invalid Input.!!Do you want to continue.? (Type 1 = Yes / Type 2 = No) : ");
				deliverytype = sc.nextInt();

				if (deliverytype == 2) {
					System.out.println("");
					System.out.println(
							"THANK YOU");
					
					System.out.println();
				}

			}

			while (deliverytype != 1 && deliverytype != 2) {
				System.out.println("");
				System.out.println("Invalid Input.");
				System.out.println("Type 1 = Continue Food Ordering / Type 2 = Exit  ");
				deliverytype = sc.nextInt();

				if (deliverytype == 2) {
					System.out.println();
					System.out.println(
							"THANK YOU");
					
					System.out.println();
				}
			}

		}


	}

}

	
