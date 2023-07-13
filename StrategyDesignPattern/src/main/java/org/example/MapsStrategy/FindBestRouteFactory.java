package org.example.MapsStrategy;

import org.example.MapsStrategy.Routes.TrainRoute;

public class FindBestRouteFactory {
    public static FindBestRouteFactory instance = null;
    static FindBestRouteFactory getInstance(){
        if(instance==null){
//            if(instance == null)
            instance = new FindBestRouteFactory();
        }
        return instance;
    }

    private FindBestRouteFactory(){}

    public static Route findroute(Mode mode, LongLat src, LongLat dest) {
        Route BestRoute = null;
        switch (mode){
            case TRAIN: return new TrainRoute().findRoute(src, dest);
            case BUS: return new TrainRoute().findRoute(src, dest);
            case WALK:return new TrainRoute().findRoute(src, dest);
        }
        return null;

    }
}
