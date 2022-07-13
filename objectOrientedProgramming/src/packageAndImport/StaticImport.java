package packageAndImport;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.System.out;

public class StaticImport {

    public static void main(String[] args) {
//        System.out.println(Math.random());
        out.println(random());
//        out.println("Math.PI :"+Math.PI);
        out.println("Math.PI :"+PI);
    }

}
