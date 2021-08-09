package chapter6.ship;

import java.util.Objects;

/**
 * Class describes the entity machine gun.
 *
 * @author Y.Ahtirskiy 08.08.2021
 */
public class MachineGun {
    String name;
    int rateOfFire;
    double caliber;

    //==================== Constructors ====================
    public MachineGun(String name, int rateOfFire, double caliber) {
        this.name = name;
        this.rateOfFire = rateOfFire;
        this.caliber = caliber;
    }

    //==================== Getters and setters ====================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRateOfFire() {
        return rateOfFire;
    }

    public void setRateOfFire(int rateOfFire) {
        this.rateOfFire = rateOfFire;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    //==================== Overridden methods ====================

    @Override
    public String toString() {
        return name +
                "\n\trateOfFire: " + rateOfFire +
                "\n\tcaliber: " + caliber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineGun that = (MachineGun) o;
        return getRateOfFire() == that.getRateOfFire() &&
                Double.compare(that.getCaliber(), getCaliber()) == 0 &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRateOfFire(), getCaliber());
    }
}
