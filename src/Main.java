import Shape.Shape;
import run.AngajatCompanieTelecomunicatie;
import run.Programator;

public class Main {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        //System.out.println(shape.getArea());


        Programator prog = new Programator();
        prog.setNume("K. Max");
        prog.setAge(18);
        prog.getDescription();
        prog.lucreaza();
        prog.runner();

        System.out.println("Name is " + prog.getNume());
        System.out.println("Age is " + prog.getAge());
    }
}