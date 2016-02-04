public class Enebolig extends Eiendom {

    public static final int FRITTSTAAENDE = 1;
    public static final int REKKE = 2;
    public static final int TOMMANS = 3;
    private int type;

    public Enebolig(String adresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr, int type) {
        super(adresse, eiersNavn, takst, antKvm, gnr, bnr);
        this.type = type;

    }

    public String getTypeAsString() {
        switch (type) {
            case FRITTSTAAENDE:
                return "Frittstående";
            case REKKE:
                return "Rekke";
            case TOMMANS:
                return "Tomanns";
            default:
                return "Ukjent type";
        }
    }

    @Override
    public String toString() {
        return String.format("Bud gitt for ENEBOLIG %s, takst = %s, gnr = %s, bnr = %s, type = %s", getAdresse(), (int) getTakst(), getGnr(), getBnr(), getTypeAsString());
    }

    @Override
    public void skrivAlleBud() {
        toString();
        super.skrivAlleBud();
    }
    }


