/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
import java.io.*;

/**
 *
 * @author crrjimenez
 */
public class UseSubject {
    static Scanner in = new Scanner(System.in);
    static Subject[] subjectArr = new Subject[10];
    
    public static void main(String[] args){
        getSubjects();
        displaySubjects();
    }
    
    static void getSubjects(){
        String subCode;
        int units;
        
        for(int i = 0; i < subjectArr.length; i++){
            System.out.printf("SUBJECT %d: \n",i + 1);
            
            System.out.println("Enter Subject Code: ");
            subCode = in.nextLine();
            System.out.println("Enter Credit Units: ");
            units = in.nextInt();
            in.nextLine();
            
            subjectArr[i] = new Subject(subCode, units);
        }
    }
    
    static void displaySubjects(){
        System.out.println("Subject Code" + "\t\t"+ "Credit Units");
        
        for(int i = 0; i < subjectArr.length; i++){
            System.out.println(subjectArr[i].getSubjectCode() + 
                    "\t\t\t" + subjectArr[i].getCreditUnits());
        }
    }
   
}
