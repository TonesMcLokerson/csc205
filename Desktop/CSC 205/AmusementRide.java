import java.util.*;

/*
 * AmusementRide is a generalization of ride objects
 * found at amusement parks.
 *
 * Note: The non-public fields for this class are
 * defined at the bottom of the class.
 *
 * @creator tmd
 * @created 02018.02.20
 */

public abstract class AmusementRide extends Object {

  public final static String DFLT_NAME = "Ride With No Name";
  public final static double DFLT_PRICE = 0.0;
  public final static int DFLT_CAPACITY = 0;

  /**
   * Construct an AmusementRide object.
   *
   * @param n the name of the AmusementRide
   * @param p the price of the AmusementRide
   * @param c the capacity of the AmusementRide
   */
  public AmusementRide(String n, double p, int c) {
    name = (n == null) ? DFLT_NAME : n;
    price = (p < 0) ? DFLT_PRICE : p;

    capacity = (c < 0) ? DFLT_CAPACITY : c;
  }

  /**
   * Print a message indicating this ride has started.
   *
   * @return  true
   */
  public boolean start() {
    System.out.println("This ride has started");
    return true;
  }

  /**
   * Print a message indicating this ride has stopped.
   *
   * @return  true
   */
  public boolean stop() {
    System.out.println("This ride has stopped");
    return true;
  }

  /**
   * Print a message indicating this ride has been loaded.
   *
   * @return  this ride's capacity
   */
  public int load() {
    System.out.println("This ride has been loaded");
    return capacity;
  }

  /**
   * Print a message indicating this ride as been repaired.
   */
  public void repair() {
    System.out.println("mechanics are on strike");
  }

  /**
   * Set the capacity of this AmusementRide.
   *
   * @param maxload  maximum number of riders allowed
   * @return this AmusementRide
   */
  public AmusementRide setCapacity(int maxload) {
    capacity = (maxload < 0) ? DFLT_CAPACITY : maxload;
    return this;
  }

  /**
   * Set the price of this AmusementRide.
   *
   * @param price  is USD
   */
  public AmusementRide setPrice(double p) {
    price = (p < 0) ? DFLT_PRICE : p;
    return this;
  }

  /**
   * construct a String representation of this ride...
   *
   * @return a String representation of this AmusementRide
   */
  public String toString() {
    return "\"" + name + "\" has capacity of " + capacity + " and costs $" + price;
  }

  /**
   * main() method used has a driver program to test
   * the methods defined in this class...
   */
  public static void main(String[] argv) {

    /*FerrisWheel f = new FerrisWheel("The Billy Preston", 50, 6.28, 100);
    RollerCoaster r = new RollerCoaster("for(;;) Young", 32, 3.14, 25, 99, 1.618);
    PneumaticTower p = new PneumaticTower("Power Tower", 5.75, 12, 245, 3.1);
    */

    Vector<AmusementRide> rides = new Vector<AmusementRide>();

    rides.addElement(new FerrisWheel("The Billy Preston", 50, 6.28, 100));
    rides.addElement(new RollerCoaster("for(;;) Young", 32, 3.14, 25, 99, 1.618));
    rides.addElement(new PneumaticTower("Power Tower", 5.75, 12, 245, 3.1));

    int len = rides.size();

    for (int i = 0; i < len; i++) {
      AmusementRide o = rides.elementAt(i); //elements fetched as type Object
      System.out.println(rides.get(i));
      o.load();
      if (o.start())
        o.stop();
      else
        o.repair();
    }
  }

  /*
   * The windSpeed is the same for all AmusementRide objects;
   * therefore, class variable used instead of an instance variable.
   */
  private static int windSpeed;

  /*
   * The instance data for an AmusementRide.
   */
  private double price;
  protected int capacity;
  private String name;
  private Date lastRepair = new Date();
}

class FerrisWheel extends AmusementRide {

  /**
   * initialize this object using client supplied data...
   */
  public FerrisWheel(String name, int capacity, double price, int height) {
    super(name, price, capacity);
    if (height <= 0)
      throw new IllegalArgumentException("invalid height");
    this.height = height;
  }

  /**
   * Return a string representation of this object including
   * the state of the AmusementRide part of the object.
   */
  public String toString() {
    return "Ferris wheel " + super.toString() + "\n" + "...height: " + height + "; # of spins: " + nSpins;
  }

  /**
   * Spin this ferris wheel once.
   */
  public void spin() {
    nSpins++;
  }

  public boolean start() {
    return true;
  }

  public boolean stop() {
    return true;
  }

  public int load() {
    return capacity;
  }

  /*
   * default state values...
   */
  private final static int DFLT_MAX_SPINS = 100;
  private final static int DFLT_HEIGHT = -1;

  /*
   * instance variables...
   */
  private int nSpins = 0;
  private int height = DFLT_HEIGHT; //in feet

}

class RollerCoaster extends AmusementRide {

  /**
   */
  public RollerCoaster(String name, int capacity, double price, int len, int speed, double factor) {
    super(name, price, capacity);
    init(len, speed, factor);
  }

  private void init(int len, int speed, double factor) {
    if (len < 0)
      throw new IllegalArgumentException("invalid length");
    trackLength = len;
    if (!setMaxSpeed(speed))
      throw new IllegalArgumentException("invalid speed");
    if (factor < 0)
      throw new IllegalArgumentException("invalid factor");
    whiplashFactor = factor;
  }

  /**
   * maxSpeed is not changed if parameter speed is negative
   *
   * @param speed  new speed
   * @return true  if speed changed; false otherwise
   */
  public boolean setMaxSpeed(int speed) {
    if (speed < 0)
      return false;
    maxSpeed = speed;
    return true;
  }

  /**
   * Return a string representation of this object including
   * the state of the AmusementRide part of the object.
   */
  public String toString() {
    final String SEP = "; ";
    return "Roller coaster " + super.toString() + "\n" + "...maxSpeed: " + maxSpeed + "; trackLength: " + trackLength
        + "; whiplashFactor: " + whiplashFactor;
  }

  public boolean start() {
    return true;
  }

  public boolean stop() {
    return true;
  }

  public int load() {
    return capacity;
  }

  /*
   * default state values...
   */
  private final static int DFLT_TRACK_LENGTH = -1;
  private final static int DFLT_MAX_SPEED = 0;
  private final static double DFLT_WHIPLASH_FACTOR = 0.0;

  /*
   * instance variables...
   */
  private int trackLength = DFLT_TRACK_LENGTH; //in feet
  private int maxSpeed = DFLT_MAX_SPEED; //in knots
  private double whiplashFactor = DFLT_WHIPLASH_FACTOR; //gforces

}

class PneumaticTower extends AmusementRide {

  /**
    * initialize this object using client supplied data...
    */
  public PneumaticTower(String name, double price, int capacity, int height, double factor) {
    super(name, price, capacity);
    if (height <= 0)
      throw new IllegalArgumentException("invalid height");
    this.height = height;
    this.factor = factor;

    if (height <= 240) {
      speed = 50;
    } else {
      speed = 52;
    }
    int fps = speed * MILE / MINUTES / SECONDS;
    duration = height / fps;
  }

  /**
   * Return a string representation of this object including
   * the state of the AmusementRide part of the object.
   */
  public String toString() {
    return "Pneumatic Tower " + super.toString() + "\n" + "...height: " + height + "; Speed: " + speed + "; G-force: "
        + factor + "; Duration: " + duration;
  }

  public boolean start() {
    return true;
  }

  public boolean stop() {
    return true;
  }

  public int load() {
    return capacity;
  }

  /*
   * default state values...
   */

  private final static int DFLT_HEIGHT = 1;
  private final static int DFLT_SPEED = 1;
  private final static double DFLT_G_FORCE = 1.0;
  private final static double DFLT_DURATION = 0.0;
  private final static int SECONDS = 60;
  private final static int MINUTES = 60;
  private final static int MILE = 5280;
  /*
   * instance variables...
   */
  private int height = DFLT_HEIGHT; //in feet
  private int speed = DFLT_SPEED; //in feet
  private double factor = DFLT_G_FORCE; //gforce
  private double duration = DFLT_DURATION; //duration

}
