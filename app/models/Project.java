package models;

import java.lang.Math;

public class Project {

  public String name;
  public String desc;
  public String lang;
  public String link;
  public String owner;

  public Project(String n) {
    name = n;
  }

  // http://stackoverflow.com/questions/27928/calculate-distance-between-two-latitude-longitude-points-haversine-formula
  // returns the distance in km between two co-ordinates
  // latitude and longitude are signed decimal degrees without compass direction
  public static int distanceBetween (
    double startLatitude, double startLongitude, 
    double endLatitude, double endLongitude){

    int earthRadius = 6371;
    double dLat = Math.toRadians(endLatitude - startLatitude);
    double dLong = Math.toRadians(endLongitude - startLongitude);

    double a = Math.sin(dLat/2) * Math.sin(dLat/2) + 
            Math.cos(Math.toRadians(startLatitude)) * Math.cos(Math.toRadians(endLatitude)) *
            Math.sin(dLong/2) * Math.sin(dLong/2);

    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    double d = earthRadius * c;

    return (int)d;
  }
}
