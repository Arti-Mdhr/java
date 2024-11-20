    // Task create a class rectangle
//add atrribute length and breadth
//make a function that returns area
//make a function that returns perimeter
//make a function info, that prints length and breadth pf recatnagle
//make an object of rectang;e and print area, perimeter and info


package week7;

public class task7 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name="Ram";
        p1.age=10;
        p1.address="KTM";
        p1.gender='M';
    
        p1.greet();
    
        Person p2 = new Person();
        p2.name ="Moe Lester";
        p2.age=17;
        p2.address="DHK";
        p2.gender='G';
    
        p2.greet();
    
        Square s1= new Square();
        s1.side=10;
        double s1Area = s1.area();
        System.out.println(s1Area);
        System.out.println(s1.area());
    
        Rectangle r1 = new Rectangle();
        r1.length= 12;
        r1.breadth= 16;
        r1.info();
        System.out.println("Area of rectangle is "+r1.area()+" Perimeter is "+ r1.perimeter()+" Info: ");
        
    
    
    
    }
    }
    /* A class is always made on global scope i.e outside public class and pvsm || can be made in a different file
     */
     
    class Person{/*These are attributes */
        String name;
        int age;
        String address;
        char gender;
    
        void greet(){/*These are functionalities */
            System.out.println("Name "+name+" Age "+age);
        }
        void sleep(){
            System.out.println("Person is sleeping.");
        }
    }
    class Rectangle{
        double length;
        double breadth;
    
        double area(){
            return length*breadth;
        }
        double perimeter(){
            return 2*(length+breadth);
        }
        void info(){
            System.out.println("Length: "+length+" Breadh: "+ breadth);

   
    
        }
    }
         
    
    //Add attribute name,brand, colour, year
    //make a function expiry, that adds 100 year and return the date
    //make a function modify that takes string and chnage the color of class
    //make a function start()-> print(name is starting)
    //mkae a function stop()-> print(name is stopping)
    //make a function detail()-> print (nmae,year  is stopping)
    //make a function deatial()-> print(name, brand,colour and year)
    //make 3 objects of car
    //fill all attributes of 3
    //print expory of all car objects
    //start the first object car
    //modify 1st and 3rd objects
    // stop the 2nd and 3rd object car
    //run detiails in all object


    
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

    

    



