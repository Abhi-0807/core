package nitinn;

import java.util.Scanner;

public class Module_2_32 {
	public static void main(String[] args) {
        int count;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();
 
        System.out.println("Enter Marks of " + count + " Subject");
        for (int i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("Total Marks : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
 
        /* Printing grade of a student using switch case statement */
        switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : A+");
            break;
        
        case 8:
            System.out.println("Grade : A");
            break;
        case 7:
            System.out.println("Grade : B");
            break;
        case 6:
            System.out.println("Grade : C");
            break;
        case 5:
            System.out.println("Grade : D");
            break;
        default:
        	System.out.println("Grade : E (You Are Failed)");
        }
    }
}


