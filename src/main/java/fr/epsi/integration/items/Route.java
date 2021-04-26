package fr.epsi.integration.items;

import java.util.List;

public class Route {
    private double speedLimit;
    private List<String> authorizedTypes;

    public Route(double speedLimit, List<String> authorizedTypes) {
        this.speedLimit = speedLimit;
        this.authorizedTypes = authorizedTypes;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public List<String> getAuthorizedTypes() {
        return authorizedTypes;
    }
}
