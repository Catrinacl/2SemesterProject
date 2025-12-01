package Storage;

import Model.*;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Lager> lagre = new ArrayList<>();
    private ArrayList<Fad> fade = new ArrayList<>();
    private ArrayList<WhiskyProdukt> whiskyProdukter = new ArrayList<>();
    private ArrayList<Destillering> destilleringer = new ArrayList<>();
    private ArrayList<Destillat> destillater = new ArrayList<>();
    private ArrayList<LagerMedarbejder> lagerMedarbejdere = new ArrayList<>();


    public void addLager(Lager lager) {
        lagre.add(lager);
    }

    public ArrayList<Lager> getLagre() {
        return lagre;
    }


    public void addFad(Fad fad) {
        fade.add(fad);
    }

    public ArrayList<Fad> getFade() {
        return fade;
    }


    public void addWhiskyProdukt(WhiskyProdukt produkt) {
        whiskyProdukter.add(produkt);
    }

    public ArrayList<WhiskyProdukt> getWhiskyProdukter() {
        return whiskyProdukter;
    }


    public void addDestillering(Destillering d) {
        destilleringer.add(d);
    }

    public ArrayList<Destillering> getDestilleringer() {
        return destilleringer;
    }


    public void addDestillat(Destillat d) {
        destillater.add(d);
    }

    public ArrayList<Destillat> getDestillater() {
        return destillater;
    }


    public void addLagerMedarbejder(LagerMedarbejder m) {
        lagerMedarbejdere.add(m);
    }

    public ArrayList<LagerMedarbejder> getLagerMedarbejdere() {
        return lagerMedarbejdere;
    }

}
