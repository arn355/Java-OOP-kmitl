import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double weightKg = weight*0.45359237;
        double heightMeter = height*0.0254;
        double bmi = weightKg/(heightMeter*heightMeter);

        System.out.println("BMI is " + bmi);
    }
}
