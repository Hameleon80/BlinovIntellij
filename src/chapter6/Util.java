package chapter6;

import java.util.Random;

/**
 * Class for common methods.
 *
 * Ahtirskij Yuriy 10.08.2021
 */
public class Util {
    /**
     * Generate random id.
     *
     * @return - random id.
     */
    public static long generateID(){
        Random random=new Random();
        return random.nextLong();
    }
}
