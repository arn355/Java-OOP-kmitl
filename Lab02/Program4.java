import java.util.Scanner; 
public class Program4{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the rows you want:");
        int n = input.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i)*2; j++){
                System.out.print(" ");
             }
            for (int k=i; k>=1; k--){
                System.out.print(" "+k);        
            }                                        
            for (int l=2; l<=i; l++){
                System.out.print(" "+l);
            }                          
            System.out.println();
        }                                                 
    }
}
