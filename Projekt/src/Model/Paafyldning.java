package Model;

import java.time.LocalDate;

public class Paafyldning {
   private String paafyldningstid;
   private double maengdeL;
   private double alkoholPcVedPaafyldning;
   private LocalDate dato;
   private LagerMedarbejder udfoertAf;

    public Paafyldning(String paafyldningstid, double maengdeL, double alkoholPcVedPaafyldning, LocalDate dato, LagerMedarbejder udfoertAf) {
        this.paafyldningstid = paafyldningstid;
        this.maengdeL = maengdeL;
        this.alkoholPcVedPaafyldning = alkoholPcVedPaafyldning;
        this.dato = dato;
        this.udfoertAf = udfoertAf;
    }

    public String getPaafyldningstid() {
        return paafyldningstid;
    }

    public double getMaengdeL() {
        return maengdeL;
    }

    public double getAlkoholPcVedPaafyldning() {
        return alkoholPcVedPaafyldning;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LagerMedarbejder getUdfoertAf() {
        return udfoertAf;
    }

    @Override
    public String toString() {
        return "Paafyldning{" +
                "paafyldningstid='" + paafyldningstid + '\'' +
                ", maengdeL=" + maengdeL +
                ", alkoholPcVedPaafyldning=" + alkoholPcVedPaafyldning +
                ", dato=" + dato +
                ", udfoertAf=" + udfoertAf +
                '}';
    }
}
