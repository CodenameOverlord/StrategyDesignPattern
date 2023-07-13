package org.example.MapsStrategy.Routes;

import org.example.MapsStrategy.LongLat;
import org.example.MapsStrategy.Route;

public class WalkRoute implements ModeRoute {
    @Override
    public  Route findRoute(LongLat src, LongLat dest) {
        System.out.println("finding route via walk");
        return new Route();
    }

}
