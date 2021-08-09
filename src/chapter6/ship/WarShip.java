package chapter6.ship;

import java.util.Objects;

/**
 * Abstract class for describes war ship.
 *
 * @author Y.Ahtirskiy 08.08.2021
 */
public abstract class WarShip implements IShip{
    private String name;
    private Engine engine;
    private MachineGun machineGun;
    private double speed;
    private String direction;

    //==================== Constructors ====================
    public WarShip() {
    }

    public WarShip(String name, Engine engine, MachineGun machineGun) {
        this.name = name;
        this.engine = engine;
        this.machineGun = machineGun;
    }

    //==================== Getters and setters ====================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public MachineGun getMachineGun() {
        return machineGun;
    }

    public void setMachineGun(MachineGun machineGun) {
        this.machineGun = machineGun;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    //==================== Overridden methods ====================


    @Override
    public String toString() {
        return "WarShip: " + name +
                "\nengine: " + engine +
                "\nmachineGun: " + machineGun +
                "\nspeed: " + speed +
                "\ndirection: " + direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WarShip warShip = (WarShip) o;
        return Double.compare(warShip.speed, speed) == 0 &&
                Objects.equals(name, warShip.name) &&
                Objects.equals(engine, warShip.engine) &&
                Objects.equals(machineGun, warShip.machineGun) &&
                Objects.equals(direction, warShip.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, engine, machineGun, speed, direction);
    }

    @Override
    public void startEngine() {
        engine.setStart(true);
    }

    @Override
    public void stopEngine() {
        engine.setStart(false);
    }

    @Override
    public void startMoveShip(double speed, String direction) {
        this.speed=speed;
        this.direction=direction;
    }

    @Override
    public void stopMoveShip() {
        this.speed=0;
        this.direction=null;
    }

    //==================== Methods ====================
    /**
     * Puts the ship to alert.
     */
    abstract void alertOn();

    /**
     * Removes the ship from alert.
     */
    abstract void alertOff();
}
