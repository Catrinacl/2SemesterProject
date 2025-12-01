package Model;

public class VandTilsaetning {
    private String vandTilsaetning;
    private double vandMaengde;
    private String vandKilde;
    private WhiskyProdukt whiskyProdukt;

    public VandTilsaetning(String vandTilsaetning, double vandMaengde,
                           String vandKilde, WhiskyProdukt whiskyProdukt) {
        this.vandTilsaetning = vandTilsaetning;
        this.vandMaengde = vandMaengde;
        this.vandKilde = vandKilde;
        this.whiskyProdukt = whiskyProdukt;
    }

    public String getVandTilsaetning() {
        return vandTilsaetning;
    }

    public double getVandMaengde() {
        return vandMaengde;
    }

    public String getVandKilde() {
        return vandKilde;
    }

    public WhiskyProdukt getWhiskyProdukt() {
        return whiskyProdukt;
    }

    @Override
    public String toString() {
        return "VandTilsaetning{" +
                "vandTilsaetning='" + vandTilsaetning + '\'' +
                ", vandMaengde=" + vandMaengde +
                ", vandKilde='" + vandKilde + '\'' +
                ", whiskyProdukt=" + whiskyProdukt +
                '}';
    }
}
