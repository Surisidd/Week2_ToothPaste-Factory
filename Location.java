
Location.java
public void Location {
  DEFAULT, USA, ASIA
}


colgatetoothpaste.java
public class Colgatetoothpaste extends Toothpaste
{
  public ColgateToothpaste(Location location)
  {
    super(toothpasteType.Colgate, location);
    construct();
  }
 
  @Override
  protected void construct() {
    System.out.println("Creating big toothpaste");
    //add ingredients
  }
}


AsiaToothpasteFactory.java
public class AsiaToothpasteFactory
{
  public static Toothpaste createtoothpaste(ToothpasteType model)
  {
    Toothpaste toothpaste = null;
    switch (model)
    {
      case SMALL:
      toothpaste = new SmallToothpaste(Location.ASIA);
      break;
 
      case MEDIUM:
      toothpaste = new MediumToothpaste(Location.ASIA);
      break;
 
      case BIG:
      toothpaste = new BigToothpaste(Location.ASIA);
      break;
 
      default:
      //throw some exception
      break;
    }
    return toothpaste;
  }
}

