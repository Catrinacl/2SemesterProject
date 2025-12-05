package Model;

import java.util.List;

public class Fad {
    private String fadId;
    private double stoerrelseL;
    private String traeType;
    private String tidligereIndhold;
    private String status;
    private List<Paafyldning> paafyldninger;
    private Hylde hylde;

    public Fad(String fadId, double stoerrelseL, String traeType, String tidligereIndhold,
               String status, List<Paafyldning> paafyldninger, Hylde hylde) {
        this.fadId = fadId;
        this.stoerrelseL = stoerrelseL;
        this.traeType = traeType;
        this.tidligereIndhold = tidligereIndhold;
        this.status = status;
        this.paafyldninger = paafyldninger;
        this.hylde = hylde;
    }

    public String getFadId() {
        return fadId;
    }

    public double getStoerrelseL() {
        return stoerrelseL;
    }

    public String getTraeType() {
        return traeType;
    }

    public String getTidligereIndhold() {
        return tidligereIndhold;
    }

    public String getStatus() {
        return status;
    }

    public List<Paafyldning> getPaafyldninger() {
        return paafyldninger;
    }

    public Hylde getHylde() {
        return hylde;
    }

    public void addPaafyldning(Paafyldning p) {
        paafyldninger.add(p);
    }


    @Override
    public String toString() {
       String hyldeNavn = (hylde != null ? hylde.getHyldeId() : "ingen hylde");
       int antalPaafyld = (paafyldninger != null ? paafyldninger.size() : 0);

       return fadId + " - " + traeType + " (" + stoerrelseL + "L, "
               + antalPaafyld + " påfyldninger, " + hyldeNavn + ")";
    }
}
