package run;

public class Programator extends AngajatCompanieTelecomunicatie implements Angajat, Runner{
    @Override
    public void lucreaza() {
        System.out.println("Programming");
    }

    @Override
    public void runner() {

    }

    @Override
    String desrieFunctiaSa() {
        return "Programator";
    }
}
