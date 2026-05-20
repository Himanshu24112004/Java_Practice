class Car{
    private String com_name;
    private String mod_name;
    private int year;
    private int mileage;

    Car(int mileage){
        this.mileage=mileage;
    }
    
    public void setComName(String com_name){
        this.com_name= com_name;
    }

    public void setModName(String mod_name){
        this.mod_name=mod_name;
    }

    public void setyear(int year){
        this.year=year;
    }

    public String getComName(){
        return com_name;
    }
    public String getModName(){
        return mod_name;
    }
    public int getYear(){
        return year;
    }

    public int getMileage(){
        return mileage;
    }
}
public class encap4 {
    public static void main(String[] args) {
        Car c= new Car(75);
        c.setComName("BMW");
        c.setModName("M5");
        c.setyear(2030);
        System.out.println(c.getComName());
        System.out.println(c.getModName());
        System.out.println(c.getYear());
        System.out.println(c.getMileage());
    }
}
