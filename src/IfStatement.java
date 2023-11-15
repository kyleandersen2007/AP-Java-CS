import java.util.Scanner;

public class IfStatement{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        long hours = scanner.nextLong();
        double employeeMoney = 0;

        if(hours < 40){
            employeeMoney+=15.50;
        }
        else if(hours > 40){
            employeeMoney += (15.50 * 1.5);
        }

        System.out.println(employeeMoney);
        scanner.close();
    }
}