package org.example.MapsStrategy.Routes;

import org.example.MapsStrategy.LongLat;
import org.example.MapsStrategy.Route;

public interface ModeRoute {
    public  Route findRoute(LongLat src, LongLat dest);
}
