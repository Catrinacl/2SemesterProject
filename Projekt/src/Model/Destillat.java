package Model;

import java.util.List;

public class Destillat {
    private String destilatID;
    private String newMakeID;
    private double totalmaengeL;
    private double alkoholPc;
    private List<MaengdeDestilleret> maengder;

    public Destillat(String destilatID, String newMakeID, double totalmaengeL, double alkoholPc, List<MaengdeDestilleret> maengder) {
        this.destilatID = destilatID;
        this.newMakeID = newMakeID;
        this.totalmaengeL = totalmaengeL;
        this.alkoholPc = alkoholPc;
        this.maengder = maengder;
    }

    public String getDestilatID() {
        return destilatID;
    }

    public String getNewMakeID() {
        return newMakeID;
    }

    public double getTotalmaengeL() {
        return totalmaengeL;
    }

    public double getAlkoholPc() {
        return alkoholPc;
    }

    public List<MaengdeDestilleret> getMaengder() {
        return maengder;
    }

    @Override
    public String toString() {
        return "Destillat{" +
                "destilatID='" + destilatID + '\'' +
                ", newMakeID='" + newMakeID + '\'' +
                ", totalmaengeL=" + totalmaengeL +
                ", alkoholPc=" + alkoholPc +
                ", maengder=" + maengder +
                '}';
    }
}