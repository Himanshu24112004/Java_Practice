class Event{
    int guests;
    Event(int guests){
        this.guests=guests;
    }
    double cost(double perGuest){
        return this.guests*perGuest;
    }
    double cost(double perGuest, double charge){
            return this.guests*perGuest + charge;
    }
}
public class eventManager {
    public static void main(String[] args) {
        Event e = new Event(50);
        System.out.println(e.cost(500, 10000));
    }
}
