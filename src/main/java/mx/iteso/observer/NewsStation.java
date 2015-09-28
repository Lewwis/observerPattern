package mx.iteso.observer;

import mx.iteso.observer.impl.MobileApp;
import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        MobileApp mobileApp = new MobileApp(scoresData);
        
        mobileApp.unsubscribe();

        scoresData.setScore("Universidad de Chile", "Colo-Colo", 2, 0, 20, "Italo", "Delantero", "Universidad de Chile");
    }
}
