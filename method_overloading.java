
class demo {
  public int add(int a, int b){
    int result = a+b;
     return result;
  }
  public int add(int a , int b, int c){
    int result= a+b+c;
    return result;
  }
  public double add(double a, double b){
    double result = a+b;
    return result;
  }

}


public class method_overloading {
    public static void main(String[] args) {
        demo d = new demo();
      int result =  d.add(4, 50);
       int result2 = d.add(4,6,8);
       double result3 = d.add(5.6,7.8);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
