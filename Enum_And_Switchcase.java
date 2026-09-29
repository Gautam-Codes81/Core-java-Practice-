
enum Result{
    PASS, FAIL, NR;
}


public class Enum_And_Switchcase {
    public static void main(String[] args) {
        Result res = Result.FAIL;
        switch(res){
            case PASS: System.out.println("PASSED");
            break;
            case FAIL:System.out.println(" Result FAILED");
            break;
            case NR: System.out.println("No result");

        }
    }
}
