import java.util.*;
import java.io.*;

public class pastTense{
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args){

        String word;
        while(true){
            word = in.nextLine();
            if(word.equalsIgnoreCase("exit")){
                break;
            }
            formPast(word.toCharArray(), word);
        }


    }

    static void formPast(char[] word, String wordString){
        if(wordString.endsWith("e")) {
            System.out.println(wordString + "d");
        }else if(wordString.endsWith("y") && isConsonant(word[word.length-2])){ 
            word[word.length-1] = 'i';
            System.out.println(String.valueOf(word) + "ed");
        }else if(wordString.endsWith("y") && !isConsonant(word[word.length-2])){
            System.out.println(String.valueOf(word) + "ed");
        }else if(isConsonant(word[word.length - 1]) && !isConsonant(word[word.length-2]) && isConsonant(word[word.length-3]) 
        && (word[word.length-1] != 'x' || word[word.length-1] != 'y' || word[word.length-1] != 'w')){
            System.out.println(String.valueOf(word) + word[word.length -1] + "ed");
        }else{
            System.out.println(String.valueOf(word) + "ed");
        }
    }

    static boolean isConsonant(char x){
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
            return false;
        }
        
        return true;
    }
}