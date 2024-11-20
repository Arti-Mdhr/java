package week7;

public class task3 {
    /* Task
     * Make a class Phone
     * Make 2 private attributes, imei_no, serial_number
     * Make 2 public attributes, model_no, brand_name
     * Make setter for imei_no
     * Make both setter and getter for serial_number
     * Make a function device_info() -> print(model_no, imei_no and serial_number)
     * Make 2 object of Phone, set all the attribute
     * Use getter to print serial_number of both object
     * Use device_info on both object
    */
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.model_no = "9823";
        phone.brand_name = "Stussy";
        phone.showModel();
        phone.showBrand();

        phone.setImei("43232");
        phone.setSerial("67387");
        String NumImei = phone.getImei();
        String NumSerial = phone.getSerial();
        System.out.println(NumImei);
        System.out.println(NumSerial);
        phone.device_info();
    }
}

class Phone{
    public String model_no, brand_name;
    private String imei_no, serial_number;

    void setImei(String i){
        imei_no = i;
    }

    String getImei(){
        return imei_no;
    }

    void setSerial(String s){
        serial_number = s;
    }

    String getSerial(){
        return serial_number;
    }

    void showModel(){
        System.out.println(model_no);
    }
    void showBrand(){
        System.out.println(brand_name);
    }
    private void showImei(){
        System.out.println(imei_no);
    }
    public void showSerial(){
        System.out.println(serial_number);
    }

    void device_info(){
        System.out.println("Model Number: "+model_no+"\nImei Number: "+imei_no+"\nSerial Number: "+serial_number);
        showModel();
        showImei();
        showSerial();
    }

}