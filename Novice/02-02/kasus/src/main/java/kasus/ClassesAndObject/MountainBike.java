package kasus.ClassesAndObject;
public class MountainBike extends Bicycle{

    // the MountainBike subclass has

    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one construtor

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear){
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass has
    // one method
    public void seatHeight(int newValue){
        seatHeight =newValue;
    }
}