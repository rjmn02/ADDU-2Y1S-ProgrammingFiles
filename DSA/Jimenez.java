import java.util.*;
import java.io.*;

public class Jimenez {


    public static int min;
    public static int max;
    public static int randomNum;
    
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

            getUserInput();
            randomNum = (int)Math.floor(Math.random() * (max - min + 1) + min);
            guessingGame();
    }

    static void getUserInput(){
        while(true){
            System.out.println("Enter integer minima: ");
            if(in.hasNextInt()){
                min = in.nextInt();
                in.nextLine();
                break;
            }else{
                in.nextLine();
                System.out.println("Please enter an integer. \n");
            }
        }

        while(true){
            System.out.println("Enter integer maxima: ");
            if(in.hasNextInt()){
                max = in.nextInt();
                in.nextLine();
                break;
            }else{
                in.nextLine();
                System.out.println("Please enter an integer. \n");
            }

        }

    }

    static void guessingGame(){
        int guess;
        int attempts = 0;
        while(true){
            attempts++;
            System.out.printf("Enter an integer from %d to %d: \n", min, max);
            if(in.hasNextInt()){
                guess = in.nextInt();
                in.nextLine();
                if(guess == randomNum){
                    System.out.printf("You guessed the number in %d attempts!, The number is %d", attempts, randomNum);
                    break;
                }else if(guess < randomNum){
                    System.out.println("Higher");
                }else if(guess > randomNum){
                    System.out.println("Lower");
                }
            }
            else{
                in.nextLine();
                System.out.println("Please enter an integer. \n");
                }
            }
        }

    }
    


