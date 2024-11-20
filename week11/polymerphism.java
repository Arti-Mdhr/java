package week11;

public class polymerphism {
    public static void main(String[] args) {
        Shape s1=new Shape();
        s1.makeShape();
        Oval o1=new Oval();
        o1.makeShape();
        
    }
}
//polymerphism, same function diffrent behaviour
class Shape{
    void makeShape(){
        System.out.println("Making shapes");

    }
}
//1.Polymorphism with method overriding 
//making the same function of parent in child
//with diffrent behaviourlogic
class Oval extends Shape{
    @Override
    void makeShape(){
        System.out.println("Making oval");


}
}
//to override the function should be same
//note:Mthod overriding can only be done using inheritance
//2,polymorhism with mehthod overloading 
//making the same fucntion with difference in parameters
class Student{
    void information(int age){
        System.out.println("student's age"+age);
    }
    void information (String firstName, String lastName){
        System.out.println(firstName+""+lastName);
 }
 //method overlading only see differnace in parameter
 //not in return type
 //meaning i cannot make another fucntion: float information()
 String information(double age){
   return "student age as double is"+ age;
 }
}
//paramter difference can be, change of data type and number if parameter
//note:function with same params but different variable name is not allowed 
//EG:void information (int a)id not allowed in above class