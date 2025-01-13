import java.util.Random;
import java.util.Scanner;

public class NumGue{
    public static  void main(String args[]){
          Scanner sc = new Scanner(System.in);
          //Computer generate a random number
          Random rd = new Random();
          System.out.println("Computer generated number(0-100)");
          int ranNum = rd.nextInt(100) + 1;
          System.out.println(ranNum);;

          //No of attempts
          int tryCount = 0;

          while(true){
          //User input
          
          System.out.println("Enter the guess number");
          int UserGuess = sc.nextInt();
          tryCount ++;

          //Compare
          if(ranNum == UserGuess){
            System.out.println("Your guess matches. You win");
            System.out.println("Your attempt " + tryCount);
            System.out.println("Your score is");
            int score = 10 - tryCount;
            if(score < 0){
              System.out.println("0");
            }else if(score == 9){
              System.out.println("10");
            }else{
              System.out.println(score);
            }

            break;
          }
          else if(ranNum < UserGuess){
            System.out.println("Your guess number is higher. ");
          }
          else if(ranNum > UserGuess){
            System.out.println("Your guess number is lower. ");
          }

        
            
          } 
          sc.close();
    }

}