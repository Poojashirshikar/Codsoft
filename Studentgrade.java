import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

import java.io.*;

class Studentgrade
{
    public static void main(String args[])
    {
        float java,python,c,cpp,php;
        double total,percentage;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Marks Of Five Subjects:");

        System.out.println("Enter the marks of java subject:");
        java = sc.nextFloat();

        System.out.println("Enter the marks of python subject:");
        python = sc.nextFloat();

        System.out.println("Enter the marks of c subject:");
        c = sc.nextFloat();

        System.out.println("Enter the marks of cpp subject:");
        cpp = sc.nextFloat();

        System.out.println("Enter the marks for php subject:");
        php = sc.nextFloat();
        total = java + python + c + cpp + php;
        percentage = (total/500.0)*100;

        System.out.println("Total marks = "+total);
        System.out.println("Percentage = "+percentage);

        if(percentage < 40)
        {
            System.out.println("Grade: Failed");
        }else if(percentage >= 40 && percentage < 60){
            System.out.println("Grade: C");
        }else if(percentage >= 60 && percentage < 80){
            System.out.println("Grade: B");
        }else if(percentage >= 80 && percentage <= 100){
            System.out.println("Grade: A");
        }else{
            System.out.println("Invalid marks.please enter valid marks");
        }

   }
        
}