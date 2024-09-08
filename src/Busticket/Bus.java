package Busticket;

public class Bus {
	private int busno;
    private boolean ac;
    private int capacity;
    
    Bus(int no,boolean ac,int cap){
    	this.busno=no;
    	this.ac=ac;
    	this.capacity=cap;
    }
    
    
    public int getCapacity() { //accessor
    	return capacity;
    }
    public void setCapacity(int cap) { //mutator
    	capacity=cap;
    }
    public int getBusNo() {
    	return busno;
    }
    public void setBusNo(int busnum) {
    	busno=busnum;
    }
    public boolean getAc() {
    	return ac;
    }
    public void setAc(boolean acval) {
    	ac=acval;
    }
    public void displayInfo() {
    	System.out.println("Bus.No : " + busno +" AC : " + ac + " Capacity:"+ capacity);
    }
}
