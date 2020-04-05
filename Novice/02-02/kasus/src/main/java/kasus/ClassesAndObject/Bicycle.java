package kasus.ClassesAndObject;

/**
 * Bicycle
 */
public class Bicycle {

    private int cadance;
    private int gear;
    private int speed;

    private int id;
    private static int numberOfBicycle = 0;;

    public Bicycle(int startCadence,int startSpeed, int startGear){
        gear = startGear;
        cadance = startCadence;
        speed = startSpeed;

        id = ++numberOfBicycle;
    }
    public int getID(){
        return id;
    }
    public static int getNumberOfBicycles(){
        return numberOfBicycle;
    }
    public int getCadence(){
        return cadance;
    }
    public void setCadence(int newValue){
        cadance = newValue;
    }
    public int getGear(){
        return gear;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public int getSpeed(){
        return speed;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }
}