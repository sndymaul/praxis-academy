package latihan1;

/**
 * Bicycle
 */
public class Bicycle {

    // the Bicycle class has
    // three fields

    public int cadence;
    public int gear;
    public int speed;

    // the Bicycle class has
    // one constrctor

    public Bicycle(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    
    Bicycle myBike = new Bicycle(30, 0, 8);

    
    // the Biycle class has
    // four methods

    public int getCadence(){
        return cadence;
    }
    public void setCadence(int newValue){
        cadence = newValue;
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
    public static void main(String[] args) {
        
    }

}