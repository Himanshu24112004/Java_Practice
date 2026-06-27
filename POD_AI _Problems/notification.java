import java.util.Scanner;

class Notification{
    String send(){
        return "Sending Generic Notification" ;
    }
}
class EmailNotification extends Notification{
    String send(){
        return "Sending Email Notification" ;
    }
}
class SMSNotification extends Notification{
    String send(){
        return "Sending SMS Notifiaction" ;
    }
}
public class notification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        sc.nextLine();
        while(n--!=0){
            
        String type  = sc.nextLine();

        Notification noti = null;

        switch(type){
            case "Email":
                noti = new EmailNotification(); break;
            case "SMS":
                noti = new SMSNotification(); break;
            default: 
                noti = new Notification(); break;        
        }
        System.out.println(noti.send());
        }
        sc.close();
    }
}
