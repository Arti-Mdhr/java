package wekk6;

public class multidimarrayloop {
    public static void main(String[] args) {
    int [][] arrayTwo = new int[3][2];
    arrayTwo[0][0]= 10;
    arrayTwo[0][1]= -10;
    arrayTwo[1][0]= 20;
    arrayTwo[1][1]= -20;
    arrayTwo[2][0]= 30;
    arrayTwo[2][1]= -30;
    /*Visual
     * [
     * [10,-10]
     * [20,-20]
     * [30,-30]
     * ]
     */

     //first get the length

     int arrayTwoLength= arrayTwo.length;
     for (int outer = 0; outer < arrayTwo.length; outer++) {
        int innerLength = arrayTwo[outer].length;
        System.out.println("Acces array of "+ outer);
        for (int inner = 0; inner < innerLength; inner++) {
            System.out.println(arrayTwo[outer][inner]);
            
        }

        
     }
}
}