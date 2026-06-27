import java.util.Scanner;

class GameCharacter{
    public String attack(){
        return null;
    }
}
class Warrior extends GameCharacter{
    public String attack(){
        return "Warrior attacks with a sword!";
    }
}
class Archer extends GameCharacter{
    public String attack(){
        return "Archer shoots an arrow!";
    } 
}
class Mage extends GameCharacter{
    public String attack(){
        return "Mage casts a spell!";
    }
}
public class gameCharacter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String type =  sc.nextLine();

            GameCharacter gc = null;
            switch (type) {
                case "Warrior":
                    gc = new Warrior();
                    break;
                case "Archer":
                    gc = new Archer();
                    break;
                 default:
                    gc = new Mage();
                    break;   
            }
            System.out.println(gc.attack());
        }
        sc.close();
    }
}