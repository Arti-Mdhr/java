package wekk6;

public class task6 {
    public static void main(String[] args) {
        // Creating the array
        int[][] arr = {
            {10, 20},
            {30, 40},
            {50, 60},
            {70, 80},
            {-10, -20}
        };

        // Printing the last array
        for (int i = 0; i < arr[arr.length - 1].length; i++) {
            System.out.println(arr[arr.length - 1][i]);

    /*2 */



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

/*make the following array names
 * [
 * ["sabina","abhinav","anubhav"]
 * ["sambandha","siddharatha", "aush"]
 * ["deepika","shreetika GPT","resha"]
 * ]
 * finad on which indexed array is shreetika GPT in 
 * output
 * 2
 */


String[][] tdArray = new String[3][3];
tdArray[0][0] = "Damina";
tdArray[0][1] = "Abhinas";
tdArray[0][2] = "Anubhav";
tdArray[1][0] = "Siddartha";
tdArray[1][1] = "Aayush";
tdArray[1][2] = "Hari";
tdArray[2][0] = "Deepika";
tdArray[2][1] = "Randtika";
tdArray[2][2] = "Resha";
int tdArrayLength = tdArray.length;
for(int i = 0; i < tdArrayLength; i++){
    int innerLen = tdArray[i].length;
    for(int j = 0; j < innerLen; j++){
        if(tdArray[i][j] == "Randtika"){
            System.out.println(i);
        }
    } 
}



        
    }
    
}
