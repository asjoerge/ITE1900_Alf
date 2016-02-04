import java.util.GregorianCalendar;

public class Bud {

    private GregorianCalendar budGitt;
    private GregorianCalendar budFrist;
    private float belop;
    private String navn;
    private String telefon;

    public Bud(String navn, float belop, String telefon, int budFrist) {
        this.budGitt = new GregorianCalendar();
        this.budFrist = new GregorianCalendar();
        this.budFrist.add(GregorianCalendar.HOUR, budFrist);
        this.belop = belop;
        this.navn = navn;
        this.telefon = telefon;

    }

    @Override
    public String toString() {
        return String.format("%s \t %s \t %s \t %s\t %s",budGitt.getTime().toString(), budFrist.getTime().toString(), navn, telefon, (int) belop);
    }
}
