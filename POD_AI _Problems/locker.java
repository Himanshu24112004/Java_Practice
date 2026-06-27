import java.util.Scanner;

class Locker{
    private int pin;
    private boolean lockedStatus;

    Locker(int pin){
        this.pin = pin;
        this.lockedStatus = true;
    }

    public void unlock(int enteredPin){
        if(enteredPin == pin){
            lockedStatus = false;
        }
    }
    public void lock(){
         lockedStatus = true;
    }
    public boolean islock(){
        return lockedStatus;
    }
}
public class locker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        Locker l = new Locker(pin);
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            String line  = sc.nextLine();
            if(line.startsWith("unlock")){
                l.unlock(Integer.parseInt(line.split("\\s+")[1]));
            }
            else{
                l.lock();
            }
        }
        System.out.println(l.islock()? "Locked":"Open");

        sc.close();
    }
}
