package week8;

public class InheritanceConstructor {
    public static void main(String[] args) {
        Polo p = new Polo();
        p.colorDifference("Red");
        // If constructor is overload, pass the corresponding params
        Shirt shirt1= new Shirt(); // non param constructor
        Shirt shirt2= new Shirt();// constructor that takes int
        
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

        System.out.println("Child Default");
    }
    void colorDifference(String color){
        System.out.println("Parameter Color: "+color);
        System.out.println("Class Color: "+this.color);
        System.out.println("Parent Color: "+super.color);
    }
}

//task
//make a class pant
//add two attribute colo and texture
//make a class halfpant that extends color and texture
//make a attribute color and add default string white
//make a non param constructor of half pant and\
//call the paramterized constructor or parent pant with"black" and 'wool"
//make a fuction design()in halfpant that takes string color\
//change the parent color to current color of halfpant
//chnage the current colorof half pant to rpovided parameter 

