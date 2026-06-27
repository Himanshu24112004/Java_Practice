import java.util.Scanner;

class Bill{
    public int calculateAmount(int units){
        return 0;
    }
}
class ElectricityBill extends Bill{
    public int calculateAmount(int units){
        return units*5;
    }
}
class WaterBill extends Bill{
    public int calculateAmount(int units){
        return units*2;
    }
}
public class billCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int units = sc.nextInt();

        Bill b = type.equals("Electricity")? new ElectricityBill() : new WaterBill();
        System.out.println(b.calculateAmount(units));
        sc.close();
    }
}
