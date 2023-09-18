import java.util.*;
import java.io.*;

public class integerPair{
    static Scanner in = new Scanner(System.in);
    public static ArrayList<Integer> arr = new ArrayList<Integer>();
    
    public static void main(String[] args){
        getArrayValues();
        algorithm();
        printArray();
    }
    
    static void getArrayValues(){
        int num;
        while(true){
            num = in.nextInt();
            if(num != 0){
                arr.add(num);
                in.nextLine();
            }else{
                break;
            }
        }
        
    }
    
    static void algorithm(){

        if(arr.size() % 2 != 0){
            arr.remove((arr.size()-1));
        }
        for(int i = 0; i < arr.size(); i+=2){
            if(arr.get(i) > arr.get(i+1)){
                arr.remove(i);
                arr.remove(i);
                i-=2;
            }
        }
    }
    
    static void printArray(){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + ", ");
        }
    }
}