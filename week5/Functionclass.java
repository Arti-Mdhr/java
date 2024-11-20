package week5;
public class Functionclass {

    
    /*Function should be prepared craeted in class scope
     * meaning either top or bottom of main
     */
    void printSomething(){
        System.out.println("This function prints ");
    }
    /*void is considered a data type that returns nothing */

    int returnInt(){
        int data = 10;
        return data;
    }
    public static void main(String[]args) {
        /*to call a normal function should make object 
         * Note: Just remember the syntax for now
        */
        Functionclass fc= new Functionclass();
        fc.printSomething();
        /*can be used multiple times */
        fc.printSomething();

        int functionReturnInt=fc.returnInt();
        System.out.println("function returns"+ functionReturnInt);
        
    }
}


