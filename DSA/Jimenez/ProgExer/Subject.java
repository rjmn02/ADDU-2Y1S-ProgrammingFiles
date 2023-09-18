/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author crrjimenez
 */
public class Subject {
    private String subjectCode;
    private int creditUnits;
    
    public Subject(String subjectCode, int creditUnits){
       this.subjectCode = subjectCode;
       this.creditUnits = creditUnits;
    }
    
    public String getSubjectCode(){
        return this.subjectCode;
    }
    
    public int getCreditUnits(){
        return this.creditUnits;
    }
}
