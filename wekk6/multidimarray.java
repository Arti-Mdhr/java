package wekk6;

public class multidimarray {
    public static void main(String[] args) {
        
                /*The number of square bracket determine the dimension  */
                //1 dim array
                int [] oneDArray;
                
                // 2 dim array
                int [] [] twoDArray;
        
                // 3 dim array
        
                int [] [] [] threeDArray;
        
                /*Memory Allocation */
                twoDArray = new int[2][3];
                /*The first 2 is the  number of array inside twoDArray
                 * The second 3 is the number of value/length of inner array
                 * [
                 * [0,0,0],
                 * [0,0,0]
                 * ]
                 */
                twoDArray[0][0] = 100;
                twoDArray[0][1] = 200;
                twoDArray[1][2] = -100;
                twoDArray[1][1] = 100;
                // access the value the same way
                int arrayValue = twoDArray[0][0];
                System.out.println(twoDArray[0][1]);

                /*task create the follwoing last array
 * [
 * [10,20]
 * [30,40]
 * [50,60]
 * [-10,-20]
 * ]
 * print the last array
 * output
 * -10
 * -20
 */

 int  [] [] newArray;
 newArray = new int [5][2];
 newArray[0][0]=10;
 newArray[0][1]=20;
 newArray[1][0]=30;
 newArray[1][1]=40;
 newArray[2][0]=50;
 newArray[2][1]=60;
 newArray[3][0]=70;
 newArray[3][1]=80;
 newArray[4][0]=-10;
 newArray[4][1]=-20;
 System.out.println(newArray[4][0]);
 System.out.println(newArray[4][1]);



                
        }
        
        
    
}




