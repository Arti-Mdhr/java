package wekk6;

public class arrayclass {
    public static void main(String[] args) {
        
       
                
                /*Array declaration */
                int[] myFirstArray;
                myFirstArray = new int [2]; //2 represent size
                /*Array declaration and memory allocation  */
                int [] mySecondArray = new int[3];
                /*Array declaration, memory allocation and initialization */
                int [] myThirdArray = {10, 20, 30, 40, 50};
                /* .length is used to see the size/value count of array */
                int myThirdArrayLength = myThirdArray.length;
                System.out.println("Third array has "+ myThirdArrayLength);
        
                int[] arrayExample =  new int[5];
                arrayExample[0]= 10;
                arrayExample[1]= 20;
                System.out.println(arrayExample[0]);
                /*Note that index cannot be more than that of last index
                 * for example arrayExample[100] will throw error
                 */
        
            }
        }
        
               