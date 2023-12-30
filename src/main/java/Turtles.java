//package PACKAGE_NAME;

import java.time.Duration;
import java.time.Instant;

import static java.time.Duration.*;
import static java.time.Instant.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {
    public static void main (String [] args){
        long p = 102;
        long q = 68;
        Instant start = now();
        GCDClass.gCD(p,q);
        Instant finish = now();
        long timeElapsed = between(start, finish).toNanos();
        System.out.printf("GCD of %d and %d : %d nanoseconds", p,q, timeElapsed);
    }
}
