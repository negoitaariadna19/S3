package Simple_Factory;

public class CarFactory {
    public static Car createCar(String type)
    {
        if(type.equals("electric")){
            Car c=new ElectricCar();
            return c;
        }
        else if (type.equals("clasic"))
        {
            Car c=new ClassicCar();
            return c;
        }
        else
        {
            return null;
        }
    }
}
