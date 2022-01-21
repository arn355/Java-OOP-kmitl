import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a : ");
        double a = input.nextDouble();

        System.out.print("Enter b : ");
        double b = input.nextDouble();

        System.out.print("Enter c : ");
        double c = input.nextDouble();

        System.out.print("Enter d : ");
        double d = input.nextDouble();

        System.out.print("Enter e : ");
        double e = input.nextDouble();

        System.out.print("Enter f : ");
        double f = input.nextDouble();

        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);

        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
    }
}
