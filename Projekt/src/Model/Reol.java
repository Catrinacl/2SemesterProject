package Model;

import java.util.List;

public class Reol {
    private String reolId;
    private String reolType;
    private List<Hylde> hylder;
    private Lager lager;

    public Reol(String reolId, String reolType, List<Hylde> hylder, Lager lager) {
        this.reolId = reolId;
        this.reolType = reolType;
        this.hylder = hylder;
        this.lager = lager;
    }

    public String getReolId() {
        return reolId;
    }

    public String getReolType() {
        return reolType;
    }

    public List<Hylde> getHylder() {
        return hylder;
    }

    public Lager getLager() {
        return lager;
    }

    @Override
    public String toString() {
        int antalHylder = (hylder != null ? hylder.size() : 0);
        String lagerNavn = (lager != null ? lager.getLagerId() : "ingen lager");

        return reolId + " - " + reolType + " (" + antalHylder + " hylder, " + lagerNavn + ")";
    }
}
