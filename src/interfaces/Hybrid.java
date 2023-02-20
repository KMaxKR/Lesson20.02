package interfaces;

public interface Hybrid extends Herbivore, Omnivor{
    default void animal(){
        System.out.println("animal");
    }
    static void ate(){
        System.out.println("ate");
    }
}
