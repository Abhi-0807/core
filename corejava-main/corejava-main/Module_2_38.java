package nitinn;

import java.util.Scanner;

public class Module_2_38 {
	 public static void main(String arg[])

     {
         Scanner sc=new Scanner(System.in);

           try

           {
                  int age;
                  System.out.println("Enter age: ");
                // int age=Integer.parseInt(arg[0]);
                 age=sc.nextInt();

                 if(age<18)

                       throw new ArithmeticException("Invalid Age Exception");

                 else

                       System.out.println("Welcome To  Vote");

           }

           catch(Exception e)

           {

                 System.out.println(e);

           }

           System.out.println("Code  Continues....");

     }

}


