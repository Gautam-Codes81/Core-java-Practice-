


import java.util.*;

public class collection_Arraylist2 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(22);
        a1.add(24);
        a1.add(26);
        a1.add(28);
        a1.add(30);
        a1.add(32);

        System.out.println(a1);

        ArrayList a2 = new ArrayList();
        a2.add("gautam kushwha");
        a2.add(34);
        a2.add(36);
        a2.add(38);
        a2.add(40);
        System.out.println(a2);

        // a1.add(0,200);
        // System.out.println(a1);

      a1.addAll(a2);
      System.out.println(a1);

    }
}
