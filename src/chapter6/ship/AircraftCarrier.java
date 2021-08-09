package chapter6.ship;

import java.util.Objects;
import java.util.Random;

public class AircraftCarrier extends WarShip{
    private long id;
    private int maxAirplanes;
    private int airplanes;
    private int crewQuantity;
    private boolean isAlert;

    //==================== Constructors ====================
    public AircraftCarrier() {
        super();
        id=generateId();
    }

    public AircraftCarrier(String name, Engine engine, MachineGun machineGun, int maxAirplanes, int airplanes, int crewQuantity, boolean isAlert) {
        super(name, engine, machineGun);
        id=generateId();
        this.maxAirplanes = maxAirplanes;
        this.airplanes = airplanes;
        this.crewQuantity = crewQuantity;
        this.isAlert = isAlert;
    }

    //==================== Getters and setters ====================
    public long getId() {
        return id;
    }

    public int getMaxAirplanes() {
        return maxAirplanes;
    }

    public void setMaxAirplanes(int maxAirplanes) {
        this.maxAirplanes = maxAirplanes;
    }

    public int getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(int airplanes) {
        this.airplanes = airplanes;
    }

    public int getCrewQuantity() {
        return crewQuantity;
    }

    public void setCrewQuantity(int crewQuantity) {
        this.crewQuantity = crewQuantity;
    }

    public boolean isAlert() {
        return isAlert;
    }

    public void setAlert(boolean alert) {
        isAlert = alert;
    }

    //==================== Overridden methods ====================


    @Override
    public String toString() {
        return super.toString() +
                "\nmaxAirplanes: " + maxAirplanes +
                "\nairplanes: " + airplanes +
                "\ncrewQuantity: " + crewQuantity +
                "\nisEfficiency: " + isAlert;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AircraftCarrier that = (AircraftCarrier) o;
        return id == that.id &&
                maxAirplanes == that.maxAirplanes &&
                airplanes == that.airplanes &&
                crewQuantity == that.crewQuantity &&
                isAlert == that.isAlert;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, maxAirplanes, airplanes, crewQuantity, isAlert);
    }

    @Override
    void alertOn() {
        setAlert(true);
    }

    @Override

    void alertOff() {
        setAlert(false);
    }
    //==================== Methods ====================
    private long generateId(){
        Random random=new Random();
        return (random.nextLong());
    }
}
