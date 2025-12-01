package Model;

import java.util.List;

public class Lager {
    private String lagerId;
    private String lagerType;
    private String adresse;
    private List<Reol> reoler;

    public Lager(String lagerId, String lagerType, String adresse, List<Reol> reoler) {
        this.lagerId = lagerId;
        this.lagerType = lagerType;
        this.adresse = adresse;
        this.reoler = reoler;
    }

    public String getLagerId() {
        return lagerId;
    }

    public String getLagerType() {
        return lagerType;
    }

    public String getAdresse() {
        return adresse;
    }

    public List<Reol> getReoler() {
        return reoler;
    }
}
