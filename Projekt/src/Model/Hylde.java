package Model;

import java.util.List;

public class Hylde {
    private String hyldeId;
    private int kapacitet;
    private String placering;
    private String hyldeType;
    private List<Fad> fade;
    private Reol reol;

    public Hylde(String hyldeId, int kapacitet, String placering, String hyldeType,
                 List<Fad> fade, Reol reol) {
        this.hyldeId = hyldeId;
        this.kapacitet = kapacitet;
        this.placering = placering;
        this.hyldeType = hyldeType;
        this.fade = fade;
        this.reol = reol;
    }

    public String getHyldeId() {
        return hyldeId;
    }

    public int getKapacitet() {
        return kapacitet;
    }

    public String getPlacering() {
        return placering;
    }

    public String getHyldeType() {
        return hyldeType;
    }

    public List<Fad> getFade() {
        return fade;
    }

    public Reol getReol() {
        return reol;
    }
}
