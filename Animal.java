public class Animal{ //.-.. --- ...- . .-.. -.-- / . -. -.-. .- .--. ... ..- .-.. .- - . -.. / -.-. .-.. .- ... ...
  //private attributes
  private String funFact;
  private String imagePath;
  private String name;
  
  //public methods
  public Animal(String aFunFact, String anImagePath, String aName){
    // Allows for the changeable variables to be called by functions that would normally call the standard variables
    funFact=aFunFact;
    imagePath=anImagePath;
    name=aName;
  }
  public String getFunFact(){
    return funFact;
  }
  // Allows for the changeable variable aFunFact to be called by functions that would normally call the variable funFact
  public void setFunFact(String aFunFact){
    funFact=aFunFact;

  }
}
