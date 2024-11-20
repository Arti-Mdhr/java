package week7;
public class task2 {
    public static void main(String[] args) {

    Car c1 = new Car();
    c1.name="Bugatti Veyron";
    c1.brand="Bugatti";
    c1.color="black";
    c1.year= 2015;
    System.out.println("Expiry "+c1.expiry());
    c1.start();
    c1.modify("Red");
    c1.detail();

    Car c2 = new Car();
    c2.name="Koenigsegg Regera";
    c2.brand="Koenigsegg";
    c2.color="Silver";
    c2.year= 2017;
    System.out.println("Expiry: "+c2.expiry());
   
    c2.stop();
    c2.detail();


    Car c3 = new Car();
    c3.name="Apollo Evo";
    c3.brand="Apollo";
    c3.color="Orange";
    c3.year=2024;
    System.out.println("Expiry: "+c3.expiry());
    c3.modify("Black");
    c3.stop();
    c3.detail();


    }
}
class Car{
    String name;
    String brand;
    String color;
    int year;
    int expiry(){
        return year+100;
    }
    void modify(String c){

    color = c;

    }
    void start(){
        System.out.println(name+" Is starting. ");

    }
    void stop (){
        System.out.println(name+" , "+ year + " Is stopping. ");
    }
    void detail(){
        System.out.println("Name: "+name+" Brand: "+brand+" Color: "+color+" Year: "+year);
    }
}







    

