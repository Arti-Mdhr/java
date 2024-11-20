package wekk6;

public class arrayloop {
    public static void main(String[] args) {
                int [] arrayExample = {20, 40, 60, 80, 100, 120};
                //first we need the length of the array
                int arrayExampleLength = arrayExample.length;
                /*for ascending loop 0 - (length-1) -> 0-5 */
                for(int index = 0; index< arrayExampleLength; index++){
                    int value = arrayExample[index];
                    System.out.println("Index "+ index + "Value "+ value);
                }
                /*can put condition  as index <= arrayExampleLength - 1 */
        
                /*for descending loop from (length-1) to 0 decrement
                 * 5-0
                 */
                System.out.println("Decrement/Reversed Loop");
                for (int index= arrayExampleLength-1; index>=0; index--) {
                    int value = arrayExample[index];
                    System.out.println("Index "+ index + "Value "+ value);


                    /*task 1
                     * make and array arrayOne with size 4
                     * with value [-10,-20,-30,-40]
                     * loop the array and print the positives
                     * outpit
                     * 10
                     * 20
                     * 30
                     * 40
                     */

         int [] arrayOne={-10,-20,-30,-40};
         for (int i = 0; i < arrayOne.length; i++) {
            System.out.println(-arrayOne[i]);
         }


         String[] names = {"Ram", "Shyam", "John", "doe"};
         String finder = "John";
          /*Loop the names and find the index of finder - "John" 
          * Print the index if found and break the loop
         */
         for (int i = 0; i < names.length; i++) {
             if (names[i].equals(finder)) {
                 System.out.println("Index of " + finder + " is at : " + i);
 
                 break;
             }
         }

         /*homework
          * make a function that takes array of string and string as input
          if array has any element that
          */

    



                }
            }
        
    }

