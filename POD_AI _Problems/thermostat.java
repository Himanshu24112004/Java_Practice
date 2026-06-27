import java.util.Scanner;

class Thermostat {
    private int currentTemp;
    private int minTemp;
    private int maxTemp;

    Thermostat(int currentTemp, int minTemp, int maxTemp){
        this.currentTemp = currentTemp;
        this.maxTemp= maxTemp;
        this.minTemp = minTemp;
    }

    public void increase(){
        if(currentTemp<maxTemp && currentTemp>minTemp){
            currentTemp += 1;
        } 
    }

    public void decrease(){
        if(currentTemp<=maxTemp && currentTemp>=minTemp){
            currentTemp -= 1;
        }   
    }
    public int getTemp(){
        return currentTemp;
    }
}
public class thermostat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ct = sc.nextInt();
        int min = sc.nextInt();
        int max = sc.nextInt();

        Thermostat t = new Thermostat(ct, min, max);

        int num = sc.nextInt();
        sc.nextLine();
        while(num--!=0){
            String op = sc.nextLine();
            switch(op){
                case "increase":
                    t.increase(); break;
                default :
                    t.decrease();  break;    
            }
        }
        System.out.println(t.getTemp());

        sc.close();
    }
}
