import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        String[] game = {"scissor","rock","paper"};
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2):");
        int nPlayer = input.nextInt();
        int nCom = (int)(Math.random()*3);

        if(nPlayer < 0 || nPlayer > 2){
            System.out.print("Out of range");
        }else if(nPlayer == nCom){
            System.out.print("The computer is "+ game[nCom] +". You are "+ game[nPlayer] +" too. It is a draw");
        }else if(nPlayer == 0){
            if(nCom == 1){
                System.out.print("The computer is "+ game[nCom] +". You are "+ game[nPlayer] +". You lose");
            }else{
                System.out.print("The computer is "+ game[nCom] +". You are "+ game[nPlayer] +". You won");
            }
        }else if(nPlayer == 1){
            if(nCom == 2){
                System.out.print("The computer is "+ game[nCom] +". You are "+ game[nPlayer] +". You lose");
            }else{
                System.out.print("The computer is "+ game[nCom] +". You are "+ game[nPlayer] +". You won");
            }
        }else{
            if(nCom == 0){
                System.out.print("The computer is "+ game[nCom] +". You are "+ game[nPlayer] +". You lose");
            }else{
                System.out.print("The computer is "+ game[nCom] +". You are "+ game[nPlayer] +". You won");
            }
        }
        
    }
}
