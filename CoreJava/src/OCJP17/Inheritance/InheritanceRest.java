package OCJP17.Inheritance;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class InheritanceRest {
    public static void main(String[] args) {
        test();

    }

    public static void test() {
        Flower f1 = new Flower();
        NaturalFlower f2 = new NaturalFlower();
        System.out.println(f1.color);
        System.out.println(f2.color);
        NavigableSet<String> s = new TreeSet<>();
        s.addAll(Arrays.asList("rose", "lotus", "lili", "aloe", "marigold", "hibiscus"));
        s.removeIf((String v)->v.length()>3);
        f2.print(s);


    }

    interface Device {
        public abstract void switchOn();
    }

    abstract class Router /* LOCATION 1 */ {    /* LOCATION 2 */
        public void switchOn() {
        }

        public abstract void reset();
    }

    class MimoRouter extends Router implements Device {

        public void reset() {

        }    /* LOCATION 3 */
    }


}
