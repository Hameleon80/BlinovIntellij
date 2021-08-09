package chapter6.ship;

import java.util.Objects;

/**
 * Describes the entity of engine.
 *
 * @author Y.Ahtirskiy 08.08.2021
 */
public class Engine {
    private String name;
    private int power;
    private double volume;
    private boolean isStart;

    //=================== Constructors ===================
    public Engine() {
    }

    public Engine(String name, int power, double volume) {
        this.name = name;
        this.power = power;
        this.volume = volume;
    }

    //=================== Getters and setter ===================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isStart() {
        return isStart;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

    //=================== Overridden methods ===================
    @Override
    public String toString() {
        StringBuilder result=new StringBuilder();
        result.append(this.name).append("\n\tpower: ").append(this.power).append("\n\tvolume: ").append(this.volume);
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return getPower() == engine.getPower() &&
                Double.compare(engine.getVolume(), getVolume()) == 0 &&
                Objects.equals(getName(), engine.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPower(), getVolume());
    }
}
