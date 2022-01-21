import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String s2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String s3 = input.nextLine();

        if(s1.compareToIgnoreCase(s2) < 0 && s1.compareToIgnoreCase(s3) < 0){
            System.out.print(s1 + " ");
            if(s2.compareToIgnoreCase(s3) < 0){
                System.out.print(s2 + " " + s3);
            }else{
                System.out.print(s3 + " " + s2);
            }
        }
        if(s2.compareToIgnoreCase(s1) < 0 && s2.compareToIgnoreCase(s3) < 0){
            System.out.print(s2 + " ");
            if(s1.compareToIgnoreCase(s3) < 0){
                System.out.print(s1 + " " + s3);
            }else{
                System.out.print(s3 + " " + s1);
            }
        }
        if(s3.compareToIgnoreCase(s2) < 0 && s3.compareToIgnoreCase(s1) < 0){
            System.out.print(s3 + " ");
            if(s1.compareToIgnoreCase(s2) < 0){
                System.out.print(s1 + " " + s2);
            }else{
                System.out.print(s2 + " " + s1);
            }
        }

    }
}
