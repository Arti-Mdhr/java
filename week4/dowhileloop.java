import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        /*while loop checks the expression at first */
        int num1=0;
        while(num1<0){
            System.out.println("this will be executed");

        }
        /* do while loop checks the expression after running a loop
        * which means do while loop runs of atleast once
        */
        do{
            System.out.println("this will  execute");
        
        }while(num1<0);
        /*although the expression is the same the do while loop will execute
        at leat once */
        int doCount=0;
        do{
            System.out.println("DO COUNT"+ doCount);
            doCount ++;
        }while(doCount <=5);

        /*Task
         * ask user for number until the number provide is negative
         * you can use while or do while to complete this 
        /*Do while implementation */
        //do{
        //    System.out.println("Enter a negative number");
        //    input = scan.nextInt();

        //}while (input > 0);
        //scan.close();
        Scanner scan = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter a negative number");
            input = scan.nextInt();

        }while (input > 0);
        scan.close();
        
    }
    
}
