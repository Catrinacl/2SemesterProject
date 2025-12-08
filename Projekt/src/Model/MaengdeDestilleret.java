package Model;

public class MaengdeDestilleret {
    private double liter;
    private Destillering destillering;

    public MaengdeDestilleret(double liter, Destillering destillering) {
        this.liter = liter;
        this.destillering = destillering;
    }

    public double getLiter() {
        return liter;
    }

    public Destillering getDestillering() {
        return destillering;
    }

    @Override
    public String toString() {
        return liter + " L fra destillering " + destillering.getDestilleringId();
    }
}
