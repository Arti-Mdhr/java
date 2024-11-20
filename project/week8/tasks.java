package week8;
   
 //task
//make a class pant
//add two attribute colo and texture
//make a class halfpant that extends color and texture
//make a attribute color and add default string white
//make a non param constructor of half pant and\
//call the paramterized constructor or parent pant with"black" and 'wool"
//make a fuction design()in halfpant that takes string color\
//change the parent color to current color of halfpant
//change the current color of half pant to rpovided parameter 

public class tasks {
    public static void main(String[] args) {
        Polo p = new Polo();
        p.colorDifference("Red");
        // If constructor is overload, pass the corresponding params
        Shirt shirt1= new Shirt(); // non param constructor
        Shirt shirt2= new Shirt(10);// constructor that takes int
        Shirt shirt3 = new Shirt("Black", 1900); // two args param constructor in use
        

    }
}

class Shirt{
    String color= "White"; // super.color
    Shirt(){
        System.out.println("Parent Default");

    }
    // Constructor Overloading
    // Same Constructor/ function with different logics/parameters.
    Shirt(String Color){
        this.color = color;
    }
    Shirt(int price){
        System.out.println("Price: " + price);
    }
    Shirt (String color, int price){
        System.out.println("Color and Price "+ color+" "+price);
    }

}
class Polo extends Shirt{
    String color= "Black"; // this.color
    Polo(){
        //The deafult constructor is run in first execution
        //super() i.e Shirt() is ran automatically here

        super("Yellow");
        System.out.println("Child Default");
    }
    void colorDifference(String color){
        System.out.println("Parameter Color: "+color);
        System.out.println("Class Color: "+this.color);
        System.out.println("Parent Color: "+super.color);
    }
}

        

class Pant{
        String color;
        String texture;
    
        Pant(String color, String texture){
           this.color= color;
           this.texture= texture;
        }
    }
    class HalfPant extends Pant{
        String color = "White";
        HalfPant(){
            super("Black", "Wool");
        }
        void design(String color){
            super.color = this.color;
            this.color= color;
    
        }
    }


    /*
     * 1. write a java program to create a class called vecile with a method called drive()
     * create a sbclass called car with method display()method to print details of the car
     * 
     * 2.lets examine the java program guven 
     * it invloves multiple classes that depict different book types 
     * including book,fictionbook,nonfictionbook, and techicabook.
     * the book class features a constructor and a method called displaydetails()
     * this method is responsible for outputing the title and author of a book
     * the remaining classes inherit both the constructor
     * and methods of book class as they extend it.
     */

    


