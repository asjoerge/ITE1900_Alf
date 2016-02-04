public class Leilighet extends Eiendom {

    private double fellesGjeld;
    private double husleie;
    private int etg;

    public Leilighet(String adresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr, double fellesGjeld, double husleie, int etg) {
        super(adresse, eiersNavn, takst, antKvm, gnr, bnr);
        this.fellesGjeld = fellesGjeld;
        this.husleie = husleie;
        this.etg = etg;
    }

    @Override
    public String toString() {
        return String.format("Bud gitt for LEILIGHET %s, takst = %s, gnr = %s, bnr = %s, fellesgjeld = %s, husleie = %s, etasje = %s", getAdresse(), (int)getTakst(), getGnr(), getBnr(), (int)fellesGjeld, (int)husleie, etg);
    }

    @Override
    public void skrivAlleBud() {
        toString();
        super.skrivAlleBud();
    }
}
