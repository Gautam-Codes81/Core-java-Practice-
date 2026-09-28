//package java.API;
import java.lang.annotation.*;
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

@interface CricketPlayer
{
    String country() default "India";
    int age() default 34;
}
@CricketPlayer

class Virat{
    @CricketPlayer
    private int innings;
    private int runs;
    public void setInnings(int innings){
           this.innings = innings;
    }
    @CricketPlayer
    public int getInnings(){
        return innings;
    }

    
    public void setRuns(int runs){
        this.runs = runs;
    }
    @CricketPlayer
    public int  getRuns(){
        return runs;
    }
}

public class Annotaion {

    public static void main(String[] args) {
        Virat vs = new Virat();
        vs.setInnings(300);
        vs.setRuns(2000);
        System.out.println(vs.getInnings());
        System.out.println(vs.getRuns());

        Classlass c = v.getClass();
        Annotation a = c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer)a;
        String country = cp.country();
        System.out.println(country);
        int age = cp.age();
        System.out.println(age);
    }
}