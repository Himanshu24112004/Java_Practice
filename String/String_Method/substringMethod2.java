package String.String_Method;

public class substringMethod2 {
    public static void main(String[] args) {
        String date = "2026-03-15";
        String month = date.substring(5,7);
        String year = date.substring(0,4);
        string day = date.substring(8);

        System.out.println("Year: "+year);
        System.out.println("Month: "+month);
        System.out.println("Day: "+day);
    }
}
