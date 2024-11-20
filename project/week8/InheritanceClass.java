package week8;
public class InheritanceClass {
    public static void main(String[] args) {

        ChildClass cc= new ChildClass();
        cc.lastname="Puttar";
        cc.firstname="Hari";
        cc.address="Boudha";
        cc.savings=10000;
        cc.initials();
        cc.info();

        GrandChildClass gc = new GrandChildClass();
        gc.firstname="Ben";
        gc.middlename="D";
        gc.lastname="Over";
        gc.initials();
        gc.details();


        
    }
}
class ParentClass{
    String lastname;
    private int salary;
    
    // the inherited class can use any properties except or private
    // as previously studied, private is only class based.

    public String address;
    protected int savings;
    void initials(){
        System.out.println("Last Name: "+ lastname);
    }
}

// extends keyword is used to inherit other class 
// single level contains one parent and one child

class ChildClass extends ParentClass{
    String firstname;
    void info(){
        System.out.println("Name: "+firstname+" "+ lastname);
    }
}

// multilevel childclass has another child class
// Grandchlid inherits every attribute build on top childclass.
// meaning Grandchild also inherits Parent Class.

class GrandChildClass extends ChildClass{
    String middlename;
    void details(){
        System.out.println("Name: "+firstname+" "+middlename+" "+ lastname);
    }
}


// tree 
// one class has multiple subclass

class BrotherClass extends ParentClass{
    String location;
    void intro(){
        System.out.println(location +" "+ lastname);
    }
}