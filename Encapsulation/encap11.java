class House{
    private String address;
    private int rooms;
    private double area;

    public void setAddress(String address){
        this.address = address;
    }

    public void setRooms(int rooms){
        this.rooms =  rooms;
    }

    public void setArea(double area){
        this.area = area;
    }

    public String getAddress(){
        return address;
    }

    public int getRooms(){
        return rooms;
    }

    public double getArea(){
        return area;
    }

    public double calPrice(int rate){
        return area*rate;
    }
}
public class encap11 {
    public static void main(String[] args) {
        House h = new House();
        h.setAddress("Indravati Nagar");
        h.setRooms(8);
        h.setArea(1440);
        System.out.println(h.getAddress());
        System.out.println(h.getRooms());
        System.out.println(h.getArea());
        System.out.println(h.calPrice(1400));
    }
}
