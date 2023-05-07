package javaProjects.practice;


import java.util.Scanner;

public class MarksPercentageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfSubjects;
        double totalMarks = 0, percentage;
        
        System.out.print("Enter the number of subjects: ");
        numOfSubjects = input.nextInt();
        
        String[] subjectNames = new String[numOfSubjects];
        double[] subjectMarks = new double[numOfSubjects];
        
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Enter the name of subject " + (i+1) + ": ");
            subjectNames[i] = input.next();
            
            System.out.print("Enter marks for " + subjectNames[i] + ": ");
            subjectMarks[i] = input.nextDouble();
            totalMarks += subjectMarks[i];
        }
        
        percentage = (totalMarks / (numOfSubjects * 100)) * 100;
        
        System.out.println("Subject\t\tMarks");
        System.out.println("-------\t\t-----");
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.println(subjectNames[i] + "\t\t" + subjectMarks[i]);
        }
        System.out.println("-----------------------");
        System.out.println("Total marks obtained: " + totalMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
    }
}

//Subject\t\tMarks is a string that represents the header row of the table that will be displayed at the end of the program.
//Here, the \t escape sequence is used to insert a horizontal tab character between Subject and Marks,
//and again between Marks and the next column of data that will be displayed. 
//This is done to create some space between the two columns of the table and make it look more organized.

// In this, I used the String.format() method with the format specifier "%.2f" to format the percentage with two decimal places. 
//The String.format() method takes in a format string and any arguments to be formatted, and returns a formatted string.
