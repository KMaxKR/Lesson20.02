package run;

public interface Runner {
    default void runner(){
        System.out.println("run");
    }
}
