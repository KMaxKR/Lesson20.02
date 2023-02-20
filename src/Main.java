import Shape.Shape;
import run.AngajatCompanieTelecomunicatie;
import run.Programator;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.getArea());


        //

        Programator prog = new Programator();
        prog.lucreaza();
    }
}