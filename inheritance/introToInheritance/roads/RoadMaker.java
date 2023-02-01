package code.inheritance.introToInheritance.roads;

import java.util.ArrayList;

/**
 * RoadMaker.
 * 
 * @author BCIT
 * @version 2020
 */
public class RoadMaker {

    public static void main(String[] args) {

        Road firstRoad = new Road("Main Street", Direction.NORTH);
        Road firstBoulevard = new Boulevard("Niagara Boulevard", Direction.SOUTH, true);
        Road motorWay = new Highway("Hwy 1", Direction.EAST, true);

        ArrayList<Road> myFavouriteRoadTrips = new ArrayList<Road>();
        myFavouriteRoadTrips.add(firstRoad);
        myFavouriteRoadTrips.add(firstBoulevard);
        myFavouriteRoadTrips.add(motorWay);

        for (Road eachRoad : myFavouriteRoadTrips) {
            System.out.println(eachRoad);
        }

    }
}
