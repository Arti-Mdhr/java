package week7;



public class ConstructorRevise {
    public static void main(String[] args) {
        NonParseConstructor np = new NonParseConstructor();
        System.out.println(np.name);

        ParamConstructor pc = new ParamConstructor("KTM", "980123123", 'M');
        System.out.println(pc.address);
        // pc.gender
        System.out.println(pc.getGender());
        pc.setGender('F');
        System.out.println(pc.getGender());

        Book b = new Book("10.22");
        b.setAuthor("Harlan Ellison");
        b.setName("I Have No Mouth and I Must Scream");
        System.out.println("Title: "+b.getName()+"\nAuthor: "+b.getAuthor()+"\nPublication: "+b.publication+
                            "\nYear: "+b.year+"\nPrice: "+b.getPrice());
    }
}

/* Task
 * Make a class Book
 * Make 3 private properties: author, name and price
 * Make 2 public properties: publication and year
 * Using "this"
 * Make a constructor that sets price only
 * Make setter for author and name only
 * Make 2 objects of Book
 * Print the following from both objects
 * Title: xyz
 * Author: abc
 * Publication: 123 publication
 * Year: 2010
 * Price: 10.22
 */

 class Book{
    public String publication,year;
    private String author,name,price;

    void setAuthor(String author){
        this.author = author;
    }
    String getAuthor(){
        return this.author;
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    void setGender(String price){
        this.price = price;
    }
    String getPrice(){
        return this.price;
    }

    Book(String price){
        this.publication = "123 publication";
        this.year = "2010";
        this.price = price;
    }
 }

class ParamConstructor{
    String address;
    private String phNo;
    private char gender;
    void setGender(char gender){
        this.gender = gender;
    }
    char getGender(){
        return this.gender;
    }
    // Parameterized constructor takes argument inside()
    ParamConstructor(String address, String phNo, char gender){
        System.out.println("This also runs when creating object");
        this.address = address;
        this.phNo = phNo;
        this.gender = gender;
    }
}

class NonParseConstructor{
    String name;
    private int age;
    // Non Parameterized constructor does not take any argument/parameters
    // To make constructor make same function of class Name without return type
    NonParseConstructor(){
        System.out.println("Runs whn creating objects");
        // can be used to set default value
        this.age = 20;
        this.name = "Default Name";
    }
}