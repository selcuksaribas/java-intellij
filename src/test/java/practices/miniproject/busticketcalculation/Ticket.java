package practices.miniproject.busticketcalculation;

public class Ticket {
    //distance, journeytype,price, seatNum

    public double distance;
    public int journeyType;
    public double price;
    public int seatNum;
    public void printTicket(Bus bus){
        System.out.println("----- Ticket Details -----");
        System.out.println("Bus Number : "+ bus.busNum);
        System.out.println("Total Price : " + this.price);
        System.out.println("Distance : " + this.distance);
        System.out.println("Journey Type : " + (this.journeyType== 1 ? "One way" : "Round Trip"));
        System.out.println("Seat Number : " + this.seatNum);


    }
}
