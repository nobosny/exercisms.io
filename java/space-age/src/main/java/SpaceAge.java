/**
 * Created by Nobosny on 11/21/2015.
 */
public class SpaceAge {

    // Storing the age in second for use within the class
    private long _ageInSeconds;

    // Constant for days of a Earth's year
    private final double EARTH = 365.25;

    //Constants for the duration of a year compared to the Earth's year.
    private final double MERCURY = 0.2408467;
    private final double VENUS = 0.61519726;
    private final double MARS = 1.8808158;
    private final double JUPITER = 11.862615;
    private final double SATURN = 29.447498;
    private final double URANUS = 84.016846;
    private final double NEPTUNE = 164.79132;

    /**
     * Constructor taking an age in seconds
     * @param age   Age in seconds
     */
    public SpaceAge(long age) {
        // Private property initialization
        this._ageInSeconds = age;
    }

    /**
     * Getter for Age in seconds
     * @return Age in seconds
     */
    public long getSeconds() {
        // Getter for age in seconds
        return _ageInSeconds;
    }

    /**
     * Representation of the age in years on the Earth
     * @return Age in years on the Earth
     */
    public double onEarth() {
        // Converting the age in seconds to years
        return _ageInSeconds / (60 * 60 * 24 * EARTH);
    }

    /**
     * Representation of the age in years on Mercury
     * @return Age in years on the Mercury
     */
    public double onMercury() {
        // Get the age in year on Earth and convert it to Mercury's years
        return onEarth() / MERCURY;
    }

    /**
     * Representation of the age in years on Venus
     * @return Age in years on the Venus
     */
    public double onVenus() {
        // Get the age in year on Earth and convert it to Venus' years
        return onEarth() / VENUS;
    }

    /**
     * Representation of the age in years on Mars
     * @return Age in years on the Mars
     */
    public double onMars() {
        // Get the age in year on Earth and convert it to Mars' years
        return onEarth() / MARS;
    }

    /**
     * Representation of the age in years on Jupiter
     * @return Age in years on the Jupiter
     */
    public double onJupiter() {
        // Get the age in year on Earth and convert it to Jupiter's years
        return onEarth() / JUPITER;
    }

    /**
     * Representation of the age in years on Saturn
     * @return Age in years on the Saturn
     */
    public double onSaturn() {
        // Get the age in year on Earth and convert it to Saturn's years
        return onEarth() / SATURN;
    }

    /**
     * Representation of the age in years on Uranus
     * @return Age in years on the Uranus
     */
    public double onUranus() {
        // Get the age in year on Earth and convert it to Uranus' years
        return onEarth() / URANUS;
    }

    /**
     * Representation of the age in years on Neptune
     * @return Age in years on the Neptune
     */
    public double onNeptune() {
        // Get the age in year on Earth and convert it to Neptune's years
        return onEarth() / NEPTUNE;
    }
}

/*
* Process finished with exit code 0: All tests passed!
* */
