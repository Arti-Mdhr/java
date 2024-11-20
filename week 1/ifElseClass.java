public class ifElseClass {

    public static void main(String[] args) {
            /*If statement */
    if(true){
        System.out.println("True statement");
    }
    //The parenthesis takes a boolean expression
    int num1= 10, num2= 20;
    if(num1==num2){
        System.out.println("Equal");
    }else{
        System.out.println("Not Equal");
    }
    /*Note that else statement is always optional */
 
    /* If else if */
    if(num1 == num2) {
        System.out.println("Equal");
    }else if(num1 < num2) {
        System.out.println("Lesser");
    }else{
        System.out.println("Greater");
    }
 
    /*Note that else statement should be at the last when using else if */
 
    /*if else if ladder*/
    if(num1==num2){
        System.out.println("Equal");
    }else if(num1>num2) {
        System.out.println("Greater");
    }else if(num1!=num2){
        System.out.println("Not Equal");
    }else if (num1>0){
        System.out.println("Positive");
    }else{
        System.out.println("Default Statement");
    }
 
    /*When a condition is matched, it will skip all the remaining statement */
    /*Nested If else */
    if (num1>0){
        if (num1>num2){ 
        System.out.println("Positive greater");
        }else{
            System.out.println("Positive Lesser");
        }
        
    }else{
        if (num1>num2) {
            System.out.println("Negative greater");    
        }else{
            System.out.println("Negative lesser");
        }
    }
    
    }
}

/*task
 * consider the following
 * claculate the toatl and avergae and save in variable accordingly
 * if any of themarking is than 35, print "fall"
 * if the average is less than 60, print "third div"
 * if the average is less than 70, print "second div"
 * if the avergae is less than 80 , print "1st div"
 * if the avergae is greater than 80, print "distinction"
 * if the average is negative or over 100, print "invalid marking"
 * int math= 34, science=70, english=50
 */

 

