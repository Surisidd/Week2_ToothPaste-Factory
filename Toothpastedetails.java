
public class Toothpastedetails {

}
ToothpasteFactory.java
public class ToothpasteFactory
{
  colgate ToothpasteFactory() {
    //Prevent creation
  }
 
  public static toothpaste createToothpaste(ToothpasteType type)
  {
    Toothpaste toothpaste = null;
    Location location = Location.ASIA; 
    //Use location specific toothpaste factory
    switch(location)
    {
      case USA:
        toothpaste = USAToothpasteFactory.createToothpaste(type);
        break;
      case ASIA:
        toothpaste = AsiaToothpasteFactory.createToothpaste(type);
        break;
      default:
        toothpaste = DefaultToothpasteFactory.createToothpaste(type);
    }
  return toothpaste;
  }
}

AbstractFactoryPattern.java
public class AbstractFactoryPattern
{
  public static void main(String[] args)
  {
    System.out.println(ToothpasteFactory.createToothpaste(ToothpasteType.SMALL));
    System.out.println(ToothpasteFactory.createToothpaste(ToothpasteType.MEDIUM));
    System.out.println(ToothpasteFactory.createToothpaste(ToothpasteType.BIG));
  }
}
