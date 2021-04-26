package fr.epsi.integration.logic;

import fr.epsi.integration.items.Conducteur;
import fr.epsi.integration.items.Route;
import fr.epsi.integration.items.Vehicule;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class CheckTest extends TestCase {
    public void testInfraction() throws Exception {
        assertEquals(false, Check.Do(
                new Vehicule(
                        false,
                        new Date(),
                        50,
                        "Voiture"
                ),
                new Conducteur(
                        false,
                        0
                ),
                new Route(
                        130,
                        new ArrayList<String>(Arrays.asList("Voiture"))
                )
        ));
    }
}
