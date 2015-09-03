// Nelly Lian
// 9/2/15
// CSE 002-311

public class Cyclometer{

  public static void main(String[] args) {

// bicycle cyclometer records time elapsed in seconds, and number of 
// rotations of front wheel in that time
// for 2 trips, print number minutes for each trip, number of counts for each
// trip, distance of each trip, sum distance of both trips
    int secsTrip1=480; // trip 1 took 480 secs
    int secsTrip2=3220; // trip 2 took 3220 secs
    int countsTrip1=1561; // wheel rotated 1561 times in trip 1
    int countsTrip2=9037; // wheel rotated 9037 times in trip 2
    
// variables for constants and storing distances
// intermediate variables and output data
    double wheelDiameter=27.0;
    double PI=3.14159;
    double feetPerMile=5280;
    double inchesPerFoot=12;
    double secondsPerMinute=60;
    double distanceTrip1, distanceTrip2, totalDistance;
    
// print out numbers stored in variables
    System.out.println("Trip took "+secsTrip1/secondsPerMinute
    +" minutes and had "+countsTrip1+" counts.");
    System.out.println("Trip took "+
    secsTrip2/secondsPerMinute+" minutes and had "
    +countsTrip2+" counts.");
    //can go to next line if code too long but anything 
    //between"must be on one line

// run calculations
    distanceTrip1=countsTrip1*wheelDiameter*PI; // distance in inches
    distanceTrip1=inchesPerFoot*feetPerMile; // distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    
// print distance
    System.out.println("Trip 1 was "+distanceTrip1+" miles.");
    System.out.println("Trip 2 was "+distanceTrip2+" miles.");
    System.out.println("The total distance was "+totalDistance+" miles.");
  }
}