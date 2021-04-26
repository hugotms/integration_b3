package fr.epsi.integration.logic;

import fr.epsi.integration.items.*;

public class Check {
    public static boolean Do(Vehicule vehicule, Conducteur conducteur, Route route) {
        if (vehicule.getSpeed() > route.getSpeedLimit()) {
            return false;
        }

        if (conducteur.getIsProbatory() && conducteur.getAlcoholLevel() != 0) {
            return false;
        }

        if (conducteur.getIsProbatory() && vehicule.getSpeed() > route.getSpeedLimit() - 10) {
            return false;
        }

        if (!vehicule.getIsAssured()) {
            return false;
        }

        if (!route.getAuthorizedTypes().contains(vehicule.getType())) {
            return false;
        }

        return true;
    }
}
