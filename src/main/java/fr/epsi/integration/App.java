package fr.epsi.integration;

import fr.epsi.integration.items.Conducteur;
import fr.epsi.integration.items.Route;
import fr.epsi.integration.items.Vehicule;
import fr.epsi.integration.logic.Check;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String [] args){
        ArrayList<String> authorizedTypes = new ArrayList<>();
        authorizedTypes.add("Voiture");

        Vehicule vehicule1 = new Vehicule(
                true,
                new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(45)),
                130,
                "Voiture"
        );

        Conducteur conducteur1 = new Conducteur(
                true,
                0.5
        );

        Route route1 = new Route(
                90,
                authorizedTypes
        );

        Vehicule vehicule2 = new Vehicule(
                true,
                new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(45)),
                80,
                "Voiture"
        );

        Conducteur conducteur2 = new Conducteur(
                true,
                0
        );

        Route route2 = new Route(
                90,
                authorizedTypes
        );

        if (Check.Do(vehicule1, conducteur1, route1)) {
            System.out.println("Pas d'infraction");
        } else {
            System.out.println("Infraction conducteur 1");
        }

        if (Check.Do(vehicule2, conducteur2, route2)) {
            System.out.println("Pas d'infraction");
        } else {
            System.out.println("Infraction conducteur 2");
        }
    }
}
