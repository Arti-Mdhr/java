package wekk6;

public class task {
    public static void main(String[] args) {
        
    
    /*make an array myfiftharray with length
    *add the value like (-40,-50,-60,-70)
     *print each element of fiftharray
     note:just use index not loop to oerform 
     */

     /*make an array myFifthArray with length 4
          * add the value like [-40, -50, -60, -70]
          print each index of myFifthArray
          note ; just use indes, not loop to perform
          */

          int[] myFifthArray = {-40, -50, -60, -70};
          System.out.println(myFifthArray[0]);
          System.out.println(myFifthArray[1]);
          System.out.println(myFifthArray[2]);
          System.out.println(myFifthArray[3]);

          /*now print the value adding -100 to each
           * output should be 
           * -140,-150,-150,-170
           */
          System.out.println("The added value will be "+ (myFifthArray[0]+ -100));
          System.out.println("The added value will be "+ (myFifthArray[1]+ -100));
          System.out.println("The added value will be "+ (myFifthArray[2]+ -100));
          System.out.println("The added value will be "+ (myFifthArray[3]+ -100));

    }
}

    
