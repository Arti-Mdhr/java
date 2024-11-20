package week8;
public class AbstractionClass {
    public static void main(String[] args) {
        Nokia n1 = new Nokia();
        Apple a1 = new Apple();
        Samsung s1 = new Samsung();
        a1.message();
        a1.delivery("Apple");

        n1.message();
        n1.delivery("Nokia");

        s1.message();
        s1.delivery("Samsung");
        
    }
}
// To make abstract class keyword "abstract" before class
abstract class SmartPhone{
    // abstract class may or may  not haev abstract functions
    // to make abstract function add "abstract" before return type
    // abstract function do not have a body
    abstract void call();
    abstract void message();
    abstract String delivery(String text);
}
// abstract class cannot be instantiated/ cannot make object
// use it in sub class
class Nokia extends SmartPhone{
    // If we extend abstract class, we must override every abstract function in child class
    @Override
    void call(){
        System.out.println("Nokia Calling");
    }
    @Override
    void message(){
        System.out.println("Nokia Messaging");
    }
    // Override functions have the same return type and parameter
    @Override
    String delivery(String text){
        System.out.println("Text delivered "+text);
        return "Text Delivered From ";
    }
}
// Make Apple and Samsung that extends SmartPhone
// Make an object of Nokia, Samsung and Apple
// Call the function Message and Delivery
//- each with their own implementation
class Apple extends SmartPhone{
    @Override
    void call(){
        System.out.println("Apple Calling");
    }
    @Override
    void message(){
        System.out.println("Apple Messaging");
    }
    @Override
    String delivery(String text){
        System.out.println("Text delivered "+text);
        return "Text Delivered From Apple";
    }
}
class Samsung extends SmartPhone{
    @Override
    void call(){
        System.out.println("Samsung Calling");
    }
    @Override
    void message(){
        System.out.println("Samsung Messaging");
    }
  
    @Override
    String delivery(String text){
        System.out.println("Text delivered "+text);
        return "Text Delivered From Samsung ";
    }
}