package week4;
public class exceptionalhandeling{

        public static void main(String[] args) {
            //exception can be handled using "try", should be followed by
            // 'catch' or "finally" or both
            int num1=10;
            try{
                System.out.println(num1/0);
            }catch(ArithmeticException ex){
                // if exception occurs, the catch block will execute
                System.out.println("Cannot divide by zero");
            }finally{
                // finally will run  whether exception occurs or not
                System.out.println("End of Exception handling");
            }
            // ArrayIndexOutOfBound
            int a[]= new int [2];
            try{   
            a[100]= 200;
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Array not long enough");
            }
    
            // null pointer
            String data = null;
            try{
                System.out.println(data.length());
            }catch(NullPointerException ex){
                System.out.println("Data is null");
            }
    o
            try{
                int data2= 100;
                System.out.println(data2/2);
                int b[]=new int[3];
                b[10]=200;
            }catch(ArithmeticException ex){
                System.out.println("Cannot divide by zero");
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Array size mismatch");
            }
    
            System.out.println("Program End");
    
    
        }
    
    
    }