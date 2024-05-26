public class SafariAnimal extends Animal{
  //Private Attributes
  private int size;
  private int brains;
  private int speed;
  private int uniqueness; 

  //Public Methods
  public SafariAnimal(String aFunFact, String anImagePath, String aName, int aSize, int aBrains, int aSpeed, int aUniqueness){
    super(aFunFact, anImagePath, aName);
    size=aSize;
    brains=aBrains;
    speed=aSpeed;
    uniqueness=aUniqueness;

  }
//returning the values of the animals
  public int getSize(){
    return size;
  }
  public int getbrains(){
    return brains;
  }
  public int getspeed(){
    return speed;
  }
  public int getuniqueness(){
    return uniqueness;
  }
}
  
