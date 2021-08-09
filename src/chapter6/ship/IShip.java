package chapter6.ship;

/**
 * Interface sets common functionality for all entity ship.
 *
 * @author Y.Ahtirskiy
 */
public interface IShip {
    /**
     * Starts engine
     */
    void startEngine();

    /**
     * Stops engine
     */
    void stopEngine();

    /**
     * Sets speed and direction of the ship.
     *
     * @param speed - ship speed
     * @param direction - ship direction
     */
    void startMoveShip(double speed, String direction);

    /**
     * Reset speed and direction of the ship
     */
    void stopMoveShip();
}
