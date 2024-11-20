public class InterfaceClass {
    public static void main(String[] args){
        Cow c1 = new Cow();
        c1.eat();
        Wolf w1 = new Wolf();
        w1.eat();
    }
}
// to make interface,use "interface" in replacement of class
interface AnimalDo{
    public void eat();
    public void travel();
}
// to use interface in another class use"implements" keyword
class Cow implements AnimalDo{
    // all the function of interface is automatically abstract
    // so override all the function

    @Override
    public void eat(){
        System.out.println("Cow eats grass");
    }
    @Override
    public void travel(){
        System.out.println("Cow travel on 4 legs");
    }
}
class Wolf implements AnimalDo{
    @Override
    public void eat(){
        System.out.println("Wolf eats meat");
    }
    @Override
    public void travel(){
        System.out.println("Wolf travel on 4 legs");
    }
}
// extends "interface"
interface MammalDo extends AnimalDo{
    public int legs();
}
interface DogDo extends MammalDo{
    public String bark();
}
interface DomesticAnimal{
    public void pet();
}
// If implementing interface with is being nested/extended to another interface
// Override all the function being passed down
class Bulldog implements DogDo, DomesticAnimal{
    @Override
    public void pet(){
        System.out.println("Petting");
    }
    @Override
    public int legs(){
        return 4;
    }
    @Override
    public void eat(){
    }
    @Override
    public void travel(){
    }
    @Override
    public String bark(){
        return"Woof";
    }
}