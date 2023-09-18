import java.util.*;
import java.io.*;

public class JimenezExer2 {

    static int range1 = 0; 
    static int range2 = 0; 
    static int range3 = 0; 
    static int range4 = 0; 
    static int range5 = 0; 
    static int range6 = 0; 
    static int range7 = 0; 
    static int range8 = 0;
    static int invalidScores = 0;

    static int arrSize = 26;
    static int[] studentGrades = new int[arrSize];

    public static void main(String[] args){
        readFile();
        insertionSort();
        ranges();
        outputFile();

    }

    static void readFile(){
        try {
            File file = new File("input.txt");
            Scanner scan = new Scanner(file);

            int i = 0;
            while(scan.hasNextLine()){
                studentGrades[i] = Integer.parseInt(scan.nextLine());
                i++;
            }
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void ranges(){
        
        for(int i = 0; i < studentGrades.length; i++){
            if(studentGrades[i] >= 0 && studentGrades[i] <= 24 ){
                range1++;
            } else if(studentGrades[i] >= 25 && studentGrades[i] <= 49){
                range2++;
            } else if(studentGrades[i] >= 50 && studentGrades[i] <= 74){
                range3++;
            } else if(studentGrades[i] >= 75 && studentGrades[i] <= 99){
                range4++;
            } else if(studentGrades[i] >= 100 && studentGrades[i] <= 124){
                range5++;
            } else if(studentGrades[i] >= 125 && studentGrades[i] <= 149){
                range6++;
            } else if(studentGrades[i] >= 150 && studentGrades[i] <= 174){
                range7++;
            } else if(studentGrades[i] >= 175 && studentGrades[i] <= 200){
                range8++;
            } else{
                invalidScores++;
            }
        }
    }

    static void insertionSort(){
        for(int i = 1; i < studentGrades.length; i++){
            int temp = studentGrades[i];
            int j = i - 1;

            while(j >= 0 && studentGrades[j] > temp){
                studentGrades[j + 1] = studentGrades[j];
                j--;
            }

            studentGrades[j + 1] = temp;
        }
    }

    static void outputFile(){
        System.out.println("Student Scores: ");
        for (int i : studentGrades) {
            System.out.printf(i + " ");
        }
        
        System.out.printf("\nStudents who scored 0-24: %d \n", range1);
        System.out.printf("Students who scored 25-49: %d \n", range2);
        System.out.printf("Students who scored 50-74: %d \n", range3);
        System.out.printf("Students who scored 75-99: %d \n", range4);
        System.out.printf("Students who scored 100-124: %d \n", range5);
        System.out.printf("Students who scored 125-149: %d \n", range6);
        System.out.printf("Students who scored 150-174: %d \n", range7);
        System.out.printf("Students who scored 175-200: %d \n", range8);
        System.out.printf("Invalid Scores: %d \n", invalidScores);

    }
}