package Busticket;

import java.util.ArrayList;
import java.util.Scanner;


public class Busdemo {
	public static void main(String args[]) {
		   ArrayList <Bus> buses=new ArrayList<Bus>();
		   ArrayList <Booking> bookings=new ArrayList<Booking>();
		   
		   buses.add(new Bus(1,true,2));  //creating new bus objects inside buses arraylist
		   buses.add(new Bus(2,false,48));
		   buses.add(new Bus(3,true,45));
		   buses.add(new Bus(4,false,52));
		   buses.add(new Bus(5,true,50));
		   
		   for(Bus b : buses) {
		    	b.displayInfo();
		    }
		   
		   int userOpt=1;
		   Scanner scan=new Scanner(System.in);
		   while(userOpt==1) {
			   System.out.println("Enter option 1 to Book ticket or Enter 2 to Exit");
			   userOpt=scan.nextInt();
			   if(userOpt==1) {
				  System.out.println("Welcome to Flyhigh!Book your tickets now");
				  Booking booking=new Booking();
				  if(booking.isAvailable(buses,bookings)) {
					  bookings.add(booking);
					  System.out.println("Your booking is confirmed");
				  }else {
					  System.out.println("Sorry! No buses found ! Try another bus or date");
				  }
			   }
			   
		   }
	       scan.close();
		  
	   }
	

}
