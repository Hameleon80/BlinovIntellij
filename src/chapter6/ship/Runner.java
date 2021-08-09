package chapter6.ship;

public class Runner {
    public static void main(String[] args) {
        Engine bmw=new Engine("BMW-15463-5", 1200, 26351.25);
        MachineGun gun=new MachineGun("AWGS-45-847", 155, 15.35);
        AircraftCarrier hope=new AircraftCarrier("Hope", bmw, gun, 100, 56, 200, false);
        System.out.println(hope);
    }
}
