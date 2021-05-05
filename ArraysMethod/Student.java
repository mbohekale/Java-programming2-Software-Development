
package studentproject;

import java.util.ArrayList;


public class Student {
     static double MAX_VALUE;
     static double MIN_VALUE;
    private String name;
    private String nationality;
    private double grade;
    
    public Student(String name,String nationality,double grade)
    {
        this.name=name;
        this.nationality=nationality;
        this.grade=grade;
    }
    public String getName(){
    return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getNationality(){
     return "";
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }
    public  double getGrade(){
       
        return grade;         
    }
    public static double maxInt(ArrayList<Integer> num){
     int max=num.get(0);
     for(int n: num)
     {
         if(n>max){
             max=n;
         }
     }
     return max;
    }
    public void setGrade(double grade){
        this.grade=grade;
    }
    public String toString(){
    return"Student[ Grades:"+ grade+"]";
            
    }
    
}
