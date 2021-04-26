package fr.epsi.integration.items;

import java.util.Date;

public class Vehicule {
    private boolean isAssured;
    private Date assuredUntil;
    private double speed;
    private String type;

    public Vehicule(boolean isAssured, Date assuredUntil, double speed, String type) {
        this.isAssured = isAssured;
        this.assuredUntil = assuredUntil;
        this.speed = speed;
        this.type = type;
    }

    public boolean getIsAssured() {
        return isAssured;
    }

    public Date getAssuredUntil() {
        return assuredUntil;
    }

    public double getSpeed() {
        return speed;
    }

    public String getType() {
        return type;
    }
}
