
public class Toothpastesize {

DefaultToothpasteFactory.java
public class DefaulttoothpasteFactory
{
  public static Toothpaste createtoothpaste(ToothpasteType model)
  {
    Toothpaste  toothpaste = null;
    switch (model)
    {
      case SMALL;
      toothpaste = new SmallToothpaste(Location.DEFAULT);
      break;
 
      case MEDIUM;
      toothpaste = new MediumToothpaste(Location.DEFAULT);
      break;
 
      case BIG:
      toothpaste = new BigToothpaste(Location.DEFAULT);
      break;
 
      default:
      //throw some exception
      break;
    }
    return toothpaste;
  }
}
USAToothpasteFactory.java
public class USAToothpasteFactory
{
  public static Toothpaste createtoothpaste(ToothpasteType model)
  {
    Toothpastetoothpaste = null;
    switch (model)
    {
      case SMALL:
      toothpaste = new SmallToothpate(Location.USA);
      break;
 
      case MEDIUM:
      toothpaste = new MediumToothpaste(Location.USA);
      break;
 
      case BIG:
      toothpaste = new BigToothpaste(Location.USA);
      break;
 
      default:
      //throw some exception
      break;
    }
  return toothpaste;
  }
}
`
