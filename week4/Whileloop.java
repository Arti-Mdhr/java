package week4;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        /*while takes condition/bollean expression in () */
        int count=0;
        while(count<=5) {
            System.out.println("while iteration"+count);
            ++ count;
        }

        /* use while when you donot know number of iteration
         * for eg:Use while to ask user for specific number until
         * the condition is satsfied
         */
        Scanner scan = new Scanner (System.in);
        System.out.println("please enter a number");
        int intInput=scan.next int();
        while(intInput < 0 || intInput > 100) {
            System.out.println("please enter number between 0-100");
            intInput= scan.nextInt();

        }
        System.out.println("condition 0-100 number"+ intInput);
        scan.close();
    }
    
}
