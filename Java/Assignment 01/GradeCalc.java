/*1. Project Title: Grade Calculator
Description:
Create a Java program that calculates the final grade of a student based on
their scores in various subjects. The program should ask the user for the
scores in each subject and then calculate the average grade. It should then
output the final grade along with a corresponding message (e.g., "Pass" or
"Fail").
Project Requirements:
i. Use only if-else statements and loops (e.g., for loops, while loops) for
decision making and iteration.
ii. Utilise basic arithmetic operations for calculations.*/


import java.util.Scanner;

public class GradeCalc {
    String name;
    int[] marks=new int[5];
    int per;
    void DisGrades(){
        System.out.println("Student Name: "+name);
        if(per>=90)
            System.out.println("Grade: A\nPass");
        else if(per>=80)
            System.out.println("Grade: B\nPass");
        else if(per>=70)
            System.out.println("Grade: C\nPass");
        else if(per>=60)
            System.out.println("Grade: D\nPass");
        else if(per>=50)
            System.out.println("Grade: E\nPass");
        else
            System.out.println("Grade: F\nFail");
    }
    void CalMarks(){
        int i=0;
        while(i<5){
            per+=marks[i];
            i++;
        }
        per=per/5;
        DisGrades();

    }

    void GetData(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Name: ");
        name=scn.nextLine();
        System.out.println("Enter Marks: ");
        for(int i=0;i<5;i++){
            System.out.println("Marks "+(i+1)+": ");
            marks[i]=scn.nextInt();
        }
        CalMarks();
    }
    public static void main(String[] args) {
        GradeCalc gc=new GradeCalc();
        gc.GetData();
    }
}
