package week7;

public class FirstOOP {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.name="Ram";
        p1.age= 10;
        p1.address="KTM";
        p1.gender= 'M';

        p1.greet();

        Person p2= new Person();
        p2.name="shyam";
        p1.age= 20;
        p2.address="KTM";
        p2.gender='F';

        p2.greet();

        Square s1= new Square();
        s1.side= 10;
        double s1Area=s1.area();
        System.out.println(s1Area);
        System.out.println(s1.area());
     
    }
}
// Task create a class rectangle
//add atrribute length and breadth
//make a function that returns area
//make a function that returns perimeter
//make a function info, that prints length and breadth pf recatnagle
//make an object of rectang;e and print area, perimeter and info
class Square{
    double side;
     
    double area(){
        return side * side;

    }
}

class Person{
    String name;
    int age;
    String address;
    char gender;


    void greet(){
        System.out.println("Name" + name + "Age"+ age);
    
    }
    void sleep(){
        System.err.println("person is sleepinh");
}

}