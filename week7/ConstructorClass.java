package   week7;

public class ConstructorClass {
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample(10,"D2");
        System.out.println("After Object");
    }
}
class ConstructorExample{
    public int data1;
    private String data2;
    // Constructor should be the same name as class name
    // No return type
    ConstructorExample(int d1, String d2){
        data1 = d1;
        data2 = d2;
        System.out.println("I run while making object");
    }
}