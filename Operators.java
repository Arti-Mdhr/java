public class Operators {
    public static void main(String[] args) {
        /*Arithmetic Operators */
        int num1 = 10, num2 = 20;
        int sum = num1 + num2; //Here "+" is arithmetic operator
        System.out.println("num1 + num2 is" + sum);
        System.out.println("num1 - num2 is" + (num1 - num2));
        System.out.println("num1 x num2 is" + (num1*num2));
        System.out.println("num1/num2 is" + (num1/num2));
        System.out.println("num1 modulo num2 is" + (num1%num2));

        /*Assignment Operators */
        int aNum1;
        aNum1 = 200; //Here "=" is an assignment operator used to assign a value
        System.out.println(aNum1);
        System.out.println("aNum1 += can be" + (aNum1+=2));
        /* aNum1+=2; is equivalent to aNum1 = aNum1 + 2; */
        System.out.println("aNum1 -= can be " + (aNum1+=10));
        System.out.println("aNum *= can be" + (aNum1*=3));
        System.out.println("aNum1 /= can be" + (aNum1/=3));
        System.out.println("aNum1 %= can be " + (aNum1%=2));

        /* Relational Operators */
        int rNum1 = 20, rNum2 = 21;
        boolean rExpression = rNum1 == rNum2;
        System.out.println("Is rNum1 equal to rNum2" + rExpression);
        System.out.println("Is rNum1 greater than rNum2" + (rNum1 > rNum2));
        System.out.println("Is rNum1 less or equal to rNum2 " + (rNum1 <= rNum2));
        System.out.println("Is rNum1 not equal to rNum2 " + (rNum1 != rNum2));

        /* Logical Operators */
        boolean rOperator1 = false, rOperator2 = true;
        System.out.println("rOperator1 && rOperator2 " + (rOperator1 && rOperator2));
        System.out.println("Or using || " + (rOperator1 || rOperator2));
        System.out.println("Not using ! " + (!rOperator1));

        /* Unary Operators */
        int uNum1 = 10;
        uNum1++; // Equivalent to uNum1 = uNum1 + 1;
        ++uNum1; // Equivalent to uNum1 = uNum1 + 1 and changes yhe value in this line;
        System.out.println("Unary for ++" + uNum1);
        System.out.println("Unary for operand --" + uNum1--);
        System.out.println("Unary for --operand " + --uNum1);

        /* Ternary Operator */
        /* for example
         * String Output;
         * int a = 10;
         * int b = 20;
         * if(a>b){
         * output = " True Statement";
         * }
         * else{
         * output = "False Statement"
         *  * }
         * /
         */
        /*We can use ternary for this */

        int a =10 , b=20;
        String output = a>b ? "True Statement" : "False Statement";
        /*Here Ternary takes expression ? true statement : false statement 
         * if the expression is true it takes the statement after the "?""
         * if the expression is false it takes  the statement after the ":""
         */
        int outputNumb = a <b ? 100: 200;
        System.out.println(output);
        System.out.println(outputNumb);



        /* Task1
         * Write a program to print whether a variable is greater or equal to 18
         */
        int v = 20;
        boolean bExpression = v > 18;
        System.out.println("Is the variable greater than 18 ? " + bExpression);
        
        /* Task 2
         * Write a program to print simple interest from variables
         * Make 3 variables for amount, time and rate and save the calculation into a variable formula
         * s1 = amount * time * rate / 100
         */
        int amount = 200;
        int time = 2;
        float rate = 2.3f;
        float s1 = (amount * time * rate)/100f;
        System.out.println(s1);

        /* Task 3
         * Write a program to print the are and perimeter of rectangle
         * a = l + b
         * p = 2(l+b)
         */
        float l = 2.3f;
        float bd = 4.5f;
        float area = l + bd;
        float perimeter = 2 * (l + bd);
        System.out.println(area);
        System.out.println(perimeter);

        /* Task 4
         *   * Complete task1 using normal
         */
        int v1 = 2;
        String com = v1 > 18 ? "True" : "False";
        System.out.println(com);
        
        

    }
    
}
