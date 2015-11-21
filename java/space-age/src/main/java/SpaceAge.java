/**
 * Created by Nobosny on 11/21/2015.
 */
public class SpaceAge {

    private long _ageInSeconds;

    private final double EARTH = 365.25;
    private final double MERCURY = 0.2408467;
    private final double VENUS = 0.61519726;
    private final double MARS = 1.8808158;
    private final double JUPITER = 11.862615;
    private final double SATURN = 29.447498;
    private final double URANUS = 84.016846;
    private final double NEPTUNE = 164.79132;

    public SpaceAge(long age) {
        this._ageInSeconds = age;
    }

    public long getSeconds() {
        return _ageInSeconds;
    }

    public double onEarth() {
        return _ageInSeconds / (60 * 60 * 24 * EARTH);
    }

    public double onMercury() {
        return onEarth() / MERCURY;
    }

    public double onVenus() {
        return onEarth() / VENUS;
    }

    public double onMars() {
        return onEarth() / MARS;
    }

    public double onJupiter() {
        return onEarth() / JUPITER;
    }

    public double onSaturn() {
        return onEarth() / SATURN;
    }

    public double onUranus() {
        return onEarth() / URANUS;
    }

    public double onNeptune() {
        return onEarth() / NEPTUNE;
    }
}
