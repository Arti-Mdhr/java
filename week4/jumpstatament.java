public class jumpstatament {
    public static void main(String[] args) {
        /*break and continue are jump statements */
        for(int i=0; i <=3; i++){
            if (i==2){
                break;
            }
            System.out.println("Index "+ i);
        }
        System.out.println("This will execute after loop ends/breaks");
        /*  can be used in while */
        int count = 0;
        while(count <= 3){
            if(count == 2){
                break;
            }
            count += 1;
        }
        System.out.println("This will execute after while loop ends/breaks");
        /* continue will skip the iteration /go to next loop */
        for(int index=0; index <=5 ; index ++);
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue; 
            }
            System.out.println(i); 
        }
    }
}
   
