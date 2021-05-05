package studentproject;

import java.util.*;


public class Studentproject {
    
    public static void main(String[] args) {
                
                    
            List<Student> students =
                    new ArrayList<>();
            students.add(new Student("","",0.1));
            students.add(new Student("","",9.1));
            students.add(new Student("","",6.1));
            students.add(new Student("","",0.7));
            
            
            for(Student stu:students){
                if(stu.getGrade()>=4.0)
                    
                System.out.println("Student have sholarship"+ " " + stu.getGrade());
            }
            List<Double> studList =
                    new ArrayList<>();
            studList.add(66.61);
            studList.add(91.5);
            studList.add(54.4);
            studList.add(6.0);
           System.out.println("----------"); 
           
          System.out.println("Total amount is: ");
          double data=0;
          double lengthOfArray=students.size();
          for(int count=0;count<lengthOfArray;count++){
                  data+=lengthOfArray;
                                }
          System.out.println("Sum: "+ data);
          System.out.println("Average: "+ data/lengthOfArray);
          
          System.out.println("----------");
          
          
         
          System.out.println("Max value is:" );
          double max = findMaxNumber(studList);
          System.out.println("Max :"+ max );
          double min =findMinNumber(studList);
          System.out.println("Min value is: "+ min);
    }
    
    private static double findMaxNumber(List<Double> lists){
        double max = Double.MIN_VALUE;
        for(Double number : lists){
        if(number > max)
            max= number;
        }
        return max;
    }
      private static double findMinNumber(List<Double> lists){
        double min = Double.MAX_VALUE;
        for(Double number : lists){
        if(number< min)
            min= number;
        }
        return min;
    }
     
    

}
