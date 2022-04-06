package Simple_Factory;

public class CarFactory {
    public Car createCar(String type)
    {
        if(type.equals("ELECTRIC")){
            Car c=new ElectricCar();
            return c;
        }
        else if (type.equals("CLASSIC"))
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
