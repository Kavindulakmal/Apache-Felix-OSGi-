package restuaranttablereservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TableReservationPublisherImpl implements TableReservationPublisher{

	@Override
	public void tableReservationService() {
		
		Scanner sc = new Scanner(System.in);

        int[] TableNo = new int[16];
        int Tables;
        int selection = 1;
        String Cust_Name;
        int ColumnNo;
        String getDate;
            

        ArrayList<Integer> tablesList = new ArrayList<Integer>();
        Map <String, Integer> hashM =new HashMap <String,Integer>();

        System.out.print("\t\tWelcome FOODHUT!!! \nEnter Customer Name?\n\n");
        System.out.println();
        Cust_Name = sc.nextLine();

        System.out.printf("Welcome %s! \n\n", Cust_Name);
        System.out.println();
        System.out.println("Please Follow Our Tables Plan.");
        System.out.println();
            
        while (selection == 1) {
                
            for (int a = 0; a <= 36; a++) {
                System.out.print("# ");
            }
            System.out.println();
            System.out.print("\t\t\t FOODHUT Table Plan.");
            System.out.println();

            for (int a = 0; a <= 36; a++) {
                System.out.print("# ");
            }
            System.out.println();

            for (int a = 0; a <= 36; a++) {
                System.out.print("# ");
            }
            System.out.println();
            System.out.println();
            System.out.println("\t\t\tTable Column Description");
            System.out.println("\tColumn 1 -----> Single \t Booking Charge -----> Rs.100.00");
            System.out.println("\tColumn 2 -----> Couple \t Booking Charge -----> Rs.200.00");
            System.out.println("\tColumn 3 -----> Family \t Booking Charge -----> Rs.300.00");
            System.out.println();
            
            for (int a = 0; a <= 36; a++) {
                System.out.print("# ");
            }
            
            System.out.println();
            System.out.println("\tColumn 1\t Column 2\t Column 3");
            System.out.println();

            for (int Table = 1; Table < TableNo.length; Table++) {
                System.out.printf("\t   "+Table + "\t");

                if (Table == 3) {
                    System.out.println();
                } else if (Table == 6) {
                    System.out.println();
                } else if (Table == 9) {
                    System.out.println();
                } else if (Table == 12) {
                    System.out.println();
                } else if (Table == 15) {
                    System.out.println();
                } 
            }
            System.out.println();
            
            for (int a = 0; a <= 36; a++) {
                System.out.print("# ");
            }
            
            System.out.println();
            System.out.print("What Is The Table Column would you like to choose ? (Single->1 / Couple->2 / Family->3)  ");
            ColumnNo = sc.nextInt();
            
            if(ColumnNo == 1){
                
                boolean IsAlready = false;
                System.out.print("What Is The Date that You Want To book? ( Ex: 2020.01.01)\n  ");
                getDate = sc.next();
                    
                System.out.print("What Is The Table Number would you like to book? (Please Select Table No From Your Selected Column)\n  ");
                Tables = sc.nextInt();

                if(Tables == 1 || Tables == 4 || Tables == 7 || Tables == 10 || Tables == 13){

                        for ( Map.Entry<String, Integer> entry : hashM.entrySet()) {
                            String key = entry.getKey();
                            int tab = entry.getValue();
                            
                            if(key.equals(getDate) && tab == Tables){
                                System.out.println();
                                System.out.println("This Table is already booked");
                                System.out.println("Please Try Another One ");
                                System.out.println();
                                IsAlready = true;
                            }
                        }
                     
                        if(IsAlready) {
                            System.out.println("Thanks For Booking!\n\nWould You Like To Make Next Booking? (Type 1 = Yes / Type 2 = No)  ");
                            selection = sc.nextInt();

                            if (selection == 2) {
                               System.out.println();
                               System.out.println("Thank You For Comming.");
                               System.out.println("Have A Nice Day !!!");
                               System.out.println();
                            }
                        }else{
                            
                        	for (int Table = 1; Table < TableNo.length; Table++) {
                                  if (Table == Tables) {
                                  boolean available = true;
                                      for (Integer integer : tablesList) {
                                           if (integer.equals(Tables)) {
                                                available = false;
                                               break;
                                           }
                                      }

                                      if(available) {
                                             System.out.println();
                                             System.out.println("Tables " + Tables + " is Successfully Booked.");
                                             System.out.println("Customer : "+Cust_Name);
                                             System.out.println("Date : "+getDate);
                                             System.out.println("Price : Rs. 100.00");
                                             System.out.println();
                                             hashM.put(getDate, Table);
                                      }
                                
                                  System.out.println("Thanks For Booking!\n\nWould You Like To Make Next Booking? (Type 1 = Yes / Type 2 = No)  ");
                                  selection = sc.nextInt();

                                  if (selection == 2) {
                                        System.out.println();
                                        System.out.println("Thank You For Comming.");
                                        System.out.println("Have A Nice Day !!!");
                                        System.out.println();
                                  }
                              } 
                        }
                    }             
                }else{
                        System.out.println("Invalid Input.");
                        System.out.println("Type 1 = Continue Booking Table / Type 2 = Exit  ");
                        selection = sc.nextInt();
                    }
                    
            }else if(ColumnNo == 2){
                
                boolean IsAlready = false;
                System.out.print("What Is The Date that You Want To book? ( Ex: 2020.01.01)\n  ");
                getDate = sc.next();
                    
                System.out.print("What Is The Table Number would you like to book? (Please Select Table No From Your Selected Column)\n  ");
                Tables = sc.nextInt();

                if(Tables == 2 || Tables == 5 || Tables == 8 || Tables == 11 || Tables == 14){

                        for ( Map.Entry<String, Integer> entry : hashM.entrySet()) {
                            String key = entry.getKey();
                            int tab = entry.getValue();
                            
                            if(key.equals(getDate) && tab == Tables){
                                System.out.println();
                                System.out.println("This Table is already booked");
                                System.out.println("Please Try Another One ");
                                System.out.println();
                                IsAlready = true;
                            }
                        }
                     
                        if(IsAlready) {
                            System.out.println("Thanks For Booking!\n\nWould You Like To Make Next Booking? (Type 1 = Yes / Type 2 = No)  ");
                            selection = sc.nextInt();

                            if (selection == 2) {
                               System.out.println();
                               System.out.println("Thank You For Comming.");
                               System.out.println("Have A Nice Day !!!");
                               System.out.println();
                            }
                        }else{
                        	
                        	for (int Table = 1; Table < TableNo.length; Table++) {
                                  if (Table == Tables) {
                                  boolean available = true;
                                  for (Integer integer : tablesList) {
                                        if (integer.equals(Tables)) {
                                             available = false;
                                            break;
                                        }
                                  }

                                      if(available) {
                                             System.out.println();
                                             System.out.println("Tables " + Tables + " is Successfully Booked.");
                                             System.out.println("Customer : "+Cust_Name);
                                             System.out.println("Date : "+getDate);
                                             System.out.println("Price : Rs. 200.00");
                                             System.out.println();
                                             hashM.put(getDate, Table);
                                      }
                                
                                  System.out.println("Thanks For Booking!\n\nWould You Like To Make Next Booking? (Type 1 = Yes / Type 2 = No)  ");
                                  selection = sc.nextInt();

                                if (selection == 2) {
                                   System.out.println();
                                   System.out.println("Thank You For Comming.");
                                   System.out.println("Have A Nice Day !!!");
                                   System.out.println();
                                }
                                   
                             }
                       
                        }
                   }      
                }else{
                        System.out.println("Invalid Input.");
                        System.out.println("Type 1 = Continue Booking Table / Type 2 = Exit  ");
                        selection = sc.nextInt();
                    }
                    
            }else if(ColumnNo == 3){
                
                boolean IsAlready = false;
                System.out.print("What Is The Date that You Want To book? ( Ex: 2020.01.01)\n  ");
                getDate = sc.next();
                    
                System.out.print("What Is The Table Number would you like to book? (Please Select Table No From Your Selected Column)\n  ");
                Tables = sc.nextInt();

                if(Tables == 3 || Tables == 6 || Tables == 9 || Tables == 12 || Tables == 15){

                        for( Map.Entry<String, Integer> entry : hashM.entrySet()) {
                            String key = entry.getKey();
                            int tab = entry.getValue();
                            
                             if(key.equals(getDate) && tab == Tables){
                                System.out.println();
                                System.out.println("This Table is already booked");
                                System.out.println("Please Try Another One ");
                                System.out.println();
                                IsAlready = true;
                             }
                        }
                     
                        if(IsAlready) {
                            System.out.println("Thanks For Booking!\n\nWould You Like To Make Next Booking? (Type 1 = Yes / Type 2 = No)  ");
                            selection = sc.nextInt();

                            if (selection == 2) {
                               System.out.println();
                               System.out.println("Thank You For Comming.");
                               System.out.println("Have A Nice Day !!!");
                               System.out.println();
                            }
                        }else{
                        	
                        	for(int Table = 1; Table < TableNo.length; Table++) {
                                   
                                  if (Table == Tables) {
                                  boolean available = true;
                                  for (Integer integer : tablesList) {
                                        if (integer.equals(Tables)) {
                                             available = false;
                                            break;
                                        }
                                  }

                                      if(available) {
                                             System.out.println();
                                             System.out.println("Tables " + Tables + " is Successfully Booked.");
                                             System.out.println("Customer : "+Cust_Name);
                                             System.out.println("Date : "+getDate);
                                             System.out.println("Price : Rs. 300.00");
                                             System.out.println();
                                             hashM.put(getDate, Table);
                                      }

                                System.out.println("Thanks For Booking!\n\nWould You Like To Make Next Booking? (Type 1 = Yes / Type 2 = No)  ");
                                selection = sc.nextInt();

                                if (selection == 2) {
                                   System.out.println();
                                   System.out.println("Thank You For Comming.");
                                   System.out.println("Have A Nice Day !!!");
                                   System.out.println();
                                }
                             }
                        }
                    }        
                }else{
                        System.out.println("Invalid Input.");
                        System.out.println("Type 1 = Continue Booking Table / Type 2 = Exit  ");
                        selection = sc.nextInt();
                    }
            }else{
                    System.out.println("Invalid Table No !\n\nWould You Like To Make Next Booking? (Type 1 = Yes / Type 2 = No)  ");
                    selection = sc.nextInt();

                                if (selection == 2) {
                                   System.out.println();
                                   System.out.println("Thank You For Comming.");
                                   System.out.println("Have A Nice Day !!!");
                                   System.out.println();
                                }       
             }
          
            while (selection != 1 && selection != 2) {
              System.out.println();
              System.out.println("Invalid Input.");
              System.out.println("Type 1 = Continue Booking Table / Type 2 = Exit  ");
              selection = sc.nextInt();

              if (selection == 2) {
                  System.out.println();
                  System.out.println("Thank You For Comming.");
                  System.out.println("Have A Nice Day !!!");
                  System.out.println();
              }
            }
        }

	}

}
