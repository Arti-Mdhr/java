import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        /*system.out.println
         * 'sout'
         */
        System.out.println("This Line Breaks");
        /*system.out.print */
        System.err.print("This line will not break");
        System.out.print("This will continue\n");
        
        /*System.out.print() 
         * %s string, %d integer, %f floating point, %b boolean
        */
        System.out.printf("hello %s,Good Morning","world");
        System.out.printf("This is an num %d",10);
        /*Multi format */
        System.out.printf("Both floar %f and %b", 10.3f, false);

        Scanner scan=new Scanner(System.in);
        System.out.println("The following takes sentence");
        String stringInput=scan.nextLine();
        System.out.println("The following takes int");
        int intInput=scan.nextInt();
        System.out.println("The following takes boolean");
        boolean booleanInput= scan.nextBoolean();
        scan.close(); 

    }

}