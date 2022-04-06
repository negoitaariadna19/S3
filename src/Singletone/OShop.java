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
    //   dupa public static punem syncrozines.Un thred a ajuns la linia 20, altu nu poate intra ine xecutia metodei, ramane
//   blocat pana tredhul anterios isi termina executia .Cand a terminat, de abia cel de-al doilea poate incepe.Synchronized-> impiedicam sa se creeze de mai multe
    public static synchronized OShop getInstance(){
        if(instanta==null)
        {
            instanta=new OShop();
        }
        return instanta;
    }


//   private OShop()
//   {
//
//   }
//   public static synchronized OShop getInstance()
//   {
//      if(instanta==null)
//      {
//         instanta=new OShop();
//      }
//      return instanta;
//   }
}

