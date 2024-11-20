package week7;

public class AcessModifier {
    public static void main(String[] args) {
        HumanBeings human = new HumanBeings();
        human.name= "Ram";
       // human.phNumber="123";
       human.age =12;
       human.showName();
      // human.showPh();// private cannot be used outside class
      human.showAge();
      human.func();
      human.setPhNumber("12321");
      String humanNumber= human.getPhNumber();
      System.out.println(humanNumber);

    }
}

class HumanBeings{
    String name; //automatically default,  used within pacjage/folder
    private String phNumber; // can only be used in this class scope aka HumanBeing
    public int age; // can be used anywhere
    
    // setter --. start with "set" and continue with variable name.

    void setPhNumber(String p){
        phNumber = p;

    }

    // getter--> start with 'get' and continue with variable name

    String getPhNumber(){
        return phNumber;
    }

    // same is applied in functions
    void showName(){
        System.out.println(name);
    }
    private void showPh(){
        System.out.println(phNumber);
    }
    public void showAge(){
        System.out.println(age);
    }
    void func(){
        System.out.println(phNumber);//private can only be called within the class
        showPh();//same goes to private function
    }
}