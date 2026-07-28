import java.util.ArrayDeque;

public class ArrayDeque2_collection {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque<>();
        ad1.add(100);
        ad1.add(200);
        ad1.add(300);
        ad1.add(300); // duplicate value allowed karata h 

        ad1.addFirst(500);
        ad1.addLast(1000);

        System.out.println(ad1);

        ad1.add("gautam coder");  // string value bhi allow karata h
                                  // main kam nhi karta Arraydeque mai ki index value add nhi karata h kyuki queue ko folow karta h
        System.out.println(ad1);


        ad1.offer(5001);

        ad1.offerFirst(5555);
        ad1.offerLast(6666);
        System.out.println(ad1);
    }
}
