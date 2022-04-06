package Singletone;



public class Main {
    public static void main(String[] args) {

        OShop os= OShop.getInstance();
        OShop os2= OShop.getInstance();

        os2.setInfo("New info");
        System.out.println(os.getInfo());
        System.out.println(os2.getInfo());
    }

}
