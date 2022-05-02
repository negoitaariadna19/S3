package Simple_Factory;

public class Main {
    public static void main(String[] args) {

        CarFactory factory=new CarFactory();
        Car c1=factory.createCar("electric");
        Car c2=factory.createCar("clasic");
    c1.showInfo();
    c2.showInfo();
    }
}
