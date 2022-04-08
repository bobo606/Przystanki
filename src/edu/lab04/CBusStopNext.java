package edu.lab04;

import java.util.Arrays;

public class CBusStopNext extends CBusStop {

    protected int nextMeters = 0;

    protected float nextMinutes = 0.0F;

    public int getNextMeters() {
        return nextMeters;
    }

    public void setNextMeters(int nextMeters) {
        this.nextMeters = nextMeters;
    }

    public float getNextMinutes() {
        return nextMinutes;
    }

    public void setNextMinutes(float nextMinutes) {
        this.nextMinutes = nextMinutes;
    }

    public CBusStopNext(String name, int nextMeters, float nextMinutes) {
        super(name);
        this.nextMeters = nextMeters;
        this.nextMinutes = nextMinutes;
    }

    public CBusStopNext(String name, String[] changes, int nextMeters, float nextMinutes) {
        super(name, changes);
        this.nextMeters = nextMeters;
        this.nextMinutes = nextMinutes;
    }

    @Override
    public String toString() {
         return " przystanek: " + name +
                "\n , przesiadki: " + ((this.changes != null) ? Arrays.toString(changes) : "-brak-")
                +"\n następny przystanek: " +nextMeters + "m, " + nextMinutes + " minut";
    }


}
