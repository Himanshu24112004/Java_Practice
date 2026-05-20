class Hotel{
    String roomType;
    int nights;

    Hotel(String roomType){
        this(roomType,1);
    }

    Hotel(String roomType, int nights){
        this.roomType=roomType;
        this.nights=nights;
    }

    double cost(double rate){
        return this.nights*rate;
    }
     double cost(double rate , double tax){
        return (this.nights*rate)+tax;
     }
}
public class hotelRoomBooking {
    public static void main(String[] args) {
        Hotel h =  new Hotel("Deluxe", 3);

        double  total  =h.cost(2000, 500);

        System.out.println("Total Cost : "+ total);
    }
}
