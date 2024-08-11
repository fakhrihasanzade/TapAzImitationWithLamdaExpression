import serviceimpl.TapAzServiceImpl;
import serviceimpl.UserServiceImpl;


public class Main {
    public static void main(String[] args) {


        TapAzServiceImpl ex = new TapAzServiceImpl();

//        ex.updateOfName("fexri",1);
          ex.deleteById(1);
        System.out.println(ex.getAll());

        UserServiceImpl user=new UserServiceImpl();

    }
}