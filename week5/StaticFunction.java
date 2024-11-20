package week5;

public class StaticFunction {
    public static int returnAdd(int num1, int num2){
        int sum= num1+num2;
        return sum;

    }

    public static String vendingmachine(int menu){
        if(menu == 1){
            return "coke";
        
        }
        if (menu == 2){
            return "water";
        
        }
        if(menu==3){
            return "frooti";
        } 
        return "invalid menu";

    }

    
    public static void main(String[] args) {
        /*If the function is static on same class
         * can simplify call the identifier
         */
        int returnValue = returnAdd(10, 20);
        System.out.println("Add is "+ returnValue);
        
    }
}

/*task1
 * make a funtion significant
 * take name as string age as int
 * if the age is below 18 return "HELLO NAME. YOU ARE INTELIGIBLE"
 * else return"congratulation name, you are eligible"
 */

 /*TASK2
  * make a function motnCalculator
  take month as int
  return string 
  1- january
  february
  ..
  december
  */

  /* task 3
  make a function function checkEqual that takes 2 int and return boolen
  if both are qual or not */ 