package Singletone;

public class OShop {
    private static OShop instanta;
    private String info="info";

    public String getInfo(){
        return info;
    }
    public void setInfo(String info)
    {
        this.info=info;
    }
    private OShop(){

    }

    public static synchronized OShop getInstance(){
        if(instanta==null)
        {
            instanta=new OShop();
        }
        return instanta;
    }


}

