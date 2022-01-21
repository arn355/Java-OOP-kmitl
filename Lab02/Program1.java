import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        System.out.print("Enter today's day:");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today:");
        int moreday = input.nextInt();

        System.out.print("Today is " + days[today]);

        today = (today+moreday) % 7;
        System.out.println(" and the future day is " + days[today]);
        
    }
}