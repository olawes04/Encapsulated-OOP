public class Animal{ //.-.. --- ...- . .-.. -.-- / . -. -.-. .- .--. ... ..- .-.. .- - . -.. / -.-. .-.. .- ... ...
  //private attributes
  private String funFact;
  private String imagePath;
  private String name;
  
  //public methods
  public Animal(String aFunFact, String anImagePath, String aName){
    funFact=aFunFact;
    imagePath=anImagePath;
    name=aName;
  }
  public String getFunFact(){
    return funFact;
  }
  public void setFunFact(String aFunFact){
    funFact=aFunFact;

  }
}
