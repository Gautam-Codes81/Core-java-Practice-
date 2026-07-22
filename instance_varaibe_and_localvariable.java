//package java.praticequestion_java;

/**
 * instance_varaibe_and_localvariable
 */

class Test{
 int a = 9;
 String name = "gautam";

}
public class instance_varaibe_and_localvariable {
public static void main(String[] args) {
    Test t = new Test();
    Test t2 = new Test();
    t2.a = 62;
    t2.name = "GAUTAM KUSHWAHA";
    t.name = "gk";
    
    System.out.println(t.a);
    System.out.println(t.name);
    System.out.println(t2.a);
    System.out.println(t2.name);

    
}
    
}