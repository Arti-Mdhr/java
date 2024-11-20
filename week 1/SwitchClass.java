public class SwitchClass {
    public static void main(String[] args) {
        char charValue='b';
        int intValue=10;
        switch (charValue) {
            case 'a':
            System.out.println("Apple");
                
                break;
            case'b':
            switch(intValue){
                case 10:            
                 System.out.println("ten");
                break;
                case 20:
                System.out.println("twenty");
                break;
            }
            System.out.println("Ball");
            break;
            case 'c':
            System.out.println("Cat");
                break;
            case 'd':
            System.out.println("Dog");
                break;
        
            default:
            System.out.println("No word found");
                break;
        }
    }
    
}

