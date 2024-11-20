import java.util.Scanner;
public class taskscan {
    public static void main(String[] args) {
        
        Scanner scan1=new Scanner(System.in);

        System.out.println("What is your name?");
        String name=scan1.nextLine();
        System.out.println("Over 18?");
        boolean status= scan1.nextBoolean();
        System.out.println("How many siblings?");
        int siblings=scan1.nextInt();
        scan1.close();
    System.out.println("hello"+name);
    System.out.println("Status?"+status);
    System.out.print("You have "+siblings);
    System.out.print(" num of siblings.");


    String inString="16";
    int parseInt=Integer.paseInt(intString);
    Double.parseDouble(inString);

    }
}
