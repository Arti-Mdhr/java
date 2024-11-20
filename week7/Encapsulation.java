package week7;

public class Encapsulation {
    public static void main(String[] args) {
        Laptop a= new Laptop();
        a.brand="APPLE";
        a.name="APPLE M1";
        a.setRam(8);
        a.setStorage(128);
        a.price=15000;
        System.out.println("Name: " + a.name + "\nBrand: " + a.brand + "\nRam: " + a.getRam() + "\nStorage: "
        + a.getStorage() + "\nPrice: " + a.price);
        a.upgrade(2, 128);
        a.inflation(20000);
        






    }
    
}
//1.Encapsulation bundle/group similar properties
//and funcition in a class
class Laptop{

        // Encapsulation/class contains attributes/properties
        String brand;
        public String name;
        private int ram;
        private int storage;
        double price;

        //add fuction
        void info(){
            System.out.print("Brand ;"+this.brand+"Name:"+ this.name);
    
        
        // 2. Encapsulation can contain data-hiding
        // can be done using the access modifier private
      
        
        }
        // 3. Encapsulation maintains better control read-only or write-only
        // using getter and setter
        void setRam(int ram){
            this.ram = ram;
        }
        int getRam(){
            return this.ram;
        }
        //take setter and getter for storage
        //make 2 objects of laptop
        //output from objects
        //name:Apple M1
        //braind:AAPLE
        //RAM: 8 GB
        //storage:128GB
       // price:15000
       //MAKE A FUNCTION UPGRADE THAT TAKES RAM AND STORAGE
       //and add to the current ram and storage
       //mak =e a funciton inflation and takes number
       //and increase the price with the given numer
       void setStorage(int storage){
        this.storage=storage;

       }
       int getStorage(){
        return this.storage;
       }
    
        
    void upgrade(int ram, int storage){
        this.ram = this.ram + ram;
        this.storage = this.storage + storage;
    }
    void inflation(double money){
        this.price += money;
         
       }
       }

