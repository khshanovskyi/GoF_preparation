import java.util.Hashtable;

public class Starter {
    public static void main(String[] args) {

        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);

//        System.out.println(new Object().hashCode());
        System.out.println(new M(1,1).hashCode());

    }
}
