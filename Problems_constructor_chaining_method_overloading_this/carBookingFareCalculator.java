class Cab{
    String type;
    double distance;

    Cab(String type){
        this(type,0);
    }

    Cab(String type , double distance){
        this.type = type;
        this.distance = distance;
    }

    double fare(double rate){
        return this.distance*rate;
    }

    double fare(double rate , double surge){
        return this.distance*rate*surge;
    } 
}
public class carBookingFareCalculator {
    public static void main(String[] args) {
        Cab c = new Cab("Sedan", 10);

        double fare = c.fare(15, 1.5);

        System.out.println("Fare : "+ fare);
    }
}
