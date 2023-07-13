package org.example.MapsStrategy;
public class Maps {

    Route findroute(Mode mode, LongLat src, LongLat dest){
        return FindBestRouteFactory.findroute(mode, src, dest);
    }
}
