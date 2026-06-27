import java.util.Scanner;

class MobilePlan{
    private String customerName ;
    private int dataUsedGB;
    private int dataLimitGB;

    public void setName(String name){
        this.customerName = name;
    }
    public void setUsed(int val){
        this.dataUsedGB = val;
    }
    public void setLimit(int val){
        this.dataLimitGB = val;
    }

    public String getName(){
        return customerName;
    } 
    public int getUsed(){
        return dataUsedGB;
    }
    public int getLimit(){
        return dataLimitGB;
    }

}
public class mobilePlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int dataUsed = sc.nextInt();
        int dataLimit = sc.nextInt();

        MobilePlan mp = new MobilePlan();

        mp.setName(name);
        mp.setUsed(dataUsed);
        mp.setLimit(dataLimit);

        if(mp.getUsed() <= mp.getLimit()){
            System.out.println("Within Limit");
        }
        else{
            System.out.println("Limit Exceeded");
            System.out.println(mp.getUsed()-mp.getLimit());
        }
        sc.close();
    }
}
