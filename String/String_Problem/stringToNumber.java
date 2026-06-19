public class stringToNumber {
    public static void main(String[] args) {
        String numStr = "12345";

        int num = Integer.parseInt(numStr);
        System.out.println(num+10);

        String doubleStr = "3.14";
        duoble d = Double.parseDouble(doubleStr);
        System.out.println(d*2);

        int age = 25;
        String ageStr = String.valueOf(age);
        System.out.println(ageStr+"Years");
    }
}
