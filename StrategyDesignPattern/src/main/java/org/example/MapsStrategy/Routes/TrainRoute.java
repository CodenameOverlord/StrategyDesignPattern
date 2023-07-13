package org.example.MapsStrategy.Routes;

import org.example.MapsStrategy.LongLat;
import org.example.MapsStrategy.Route;

public class TrainRoute implements ModeRoute {
    @Override
    public  Route findRoute(LongLat src, LongLat dest) {
        System.out.println("finding route via train");
        return new Route();
    }
}
