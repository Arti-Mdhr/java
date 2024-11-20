package week5;

  public class functionTask {
    double makeDouble(){
        double data= 10.2;
        return data;
    }
    public static void main(String[] args) {
        functionTask md= new functionTask();
        double makedouble= md.makeDouble();
        System.out.println("The double is "+ makedouble);
    }
}