package Model;

import java.time.LocalDate;
import java.util.List;

public class Destillering {
    private String distilleringsID;
    private LocalDate startDato;
    private LocalDate slutDato;
    private String maltBatch;
    private String kornsort;
    private String rygemateriale; //nullable?
    private String kommentar;
    private List<MaengdeDestilleret> maengder;

    public Destillering(String distilleringsID, LocalDate startDato, LocalDate slutDato, String maltBatch, String kornsort, String rygemateriale, String kommentar, List<MaengdeDestilleret> maengder) {
        this.distilleringsID = distilleringsID;
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.maltBatch = maltBatch;
        this.kornsort = kornsort;
        this.rygemateriale = rygemateriale;
        this.kommentar = kommentar;
        this.maengder = maengder;
    }

    public String getDistilleringsID() {
        return distilleringsID;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    public String getMaltBatch() {
        return maltBatch;
    }

    public String getKornsort() {
        return kornsort;
    }

    public String getRygemateriale() {
        return rygemateriale;
    }

    public String getKommentar() {
        return kommentar;
    }

    public List<MaengdeDestilleret> getMaengder() {
        return maengder;
    }

    @Override
    public String toString() {
        return "Destillering{" +
                "distilleringsID='" + distilleringsID + '\'' +
                ", startDato=" + startDato +
                ", slutDato=" + slutDato +
                ", maltBatch='" + maltBatch + '\'' +
                ", kornsort='" + kornsort + '\'' +
                ", rygemateriale='" + rygemateriale + '\'' +
                ", kommentar='" + kommentar + '\'' +
                ", maengder=" + maengder +
                '}';
    }
}
