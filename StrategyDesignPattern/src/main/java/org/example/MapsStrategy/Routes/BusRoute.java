package org.example.MapsStrategy.Routes;

import org.example.MapsStrategy.LongLat;
import org.example.MapsStrategy.Route;

public class BusRoute implements  ModeRoute{
    @Override
    public Route findRoute(LongLat src, LongLat dest) {
        System.out.println("finding route via Bus");
        return new Route();
    }
}
