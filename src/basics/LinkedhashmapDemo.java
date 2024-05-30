package basics;
import java.util.*;
public class LinkedhashmapDemo {
    public static void main(String args[]) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(3, 0.75f, true) {
//            protected boolean removeEldestEntry(Map.Entry<Integer, String> e) {
//                return size() > 3;
//            }
        };
        lhm.put(1, "a");
        lhm.put(3, "p");
        lhm.put(2, "u");
        lhm.put(6, "t");
        lhm.put(6, "c");
        System.out.println(lhm);
        System.out.println(lhm.get(2));
        System.out.println(lhm);
    }
}
