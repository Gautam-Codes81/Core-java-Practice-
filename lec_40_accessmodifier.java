
class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;

    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class lec_40_accessmodifier {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        harry.setName("gautam codder");
        System.out.println(harry.getName());
        harry.setId(120);
        System.out.println(harry.getId());
    }

}
