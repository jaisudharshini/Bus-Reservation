package Busticket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Booking {
	 String name;
     int busno;
     Date date;
     
     Booking(){
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("Enter the passanger name : ");
    	 name=scan.nextLine();
    	 System.out.println("Enter the busNo : ");
    	 busno=scan.nextInt();
    	 System.out.println("Enter the Date (dd-mm-yyyy) : ");
    	 String dateInput = scan.next();   
    	 SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
    	 try {
    		 date=dateformat.parse(dateInput);
    	 }catch(ParseException e) {
    		 e.printStackTrace();
    	 } 
    }
     public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings) {
    	 int capacity =0;
    	 for(Bus bus:buses) {
    		 if(bus.getBusNo()==busno) {
    			 capacity=bus.getCapacity();
    		 }
    	 }
    	 int booked=0;
    	 for(Booking b:bookings) {
    		 if(b.busno==busno && b.date.equals(date)) {
    			 booked++;
    		 }
    	 }
    	
    	 return booked < capacity?true:false;
     }
}
