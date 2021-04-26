package fr.epsi.integration.items;

public class Conducteur {
    private boolean isProbatory;
    private double alcoholLevel;

    public Conducteur(boolean isProbatory, double alcoholLevel) {
        this.isProbatory = isProbatory;
        this.alcoholLevel = alcoholLevel;
    }

    public boolean getIsProbatory() {
        return isProbatory;
    }

    public double getAlcoholLevel() {
        return alcoholLevel;
    }
}
