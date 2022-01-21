import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int x = input.nextInt();
        int sum = 0;

        if(x > 1000 || x < 0){
            System.out.println("Out of range!");
        }else{
            while(x >= 10){
                sum += x%10;
                x /= 10;
            }
            sum += x;       
            System.out.println("The sum of the digits is " + sum);     
        }
    }
}
