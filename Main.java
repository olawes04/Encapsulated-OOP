// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
  ///////////////////////////////////////////////////////////////////////////////////
  //Creation of a new Animal object (instantiation ) using the Animal class which acts as a template (like a cookie cutter), using the contructor method Animal
    SafariAnimal gH = new SafariAnimal("Great Hornbills can eat around 150 figs in a single meal", "hornbill1.jpg", "Great Hornbill", 4, 6, 5, 5);

  gH.setFunFact("It looks like it has a banana on its head");
  ///////////////////////////////////////////////////////////////////////////////////
  SafariAnimal wH= new SafariAnimal ("Warthogs prefer to live in burrows made by other animals like aardvarks", "warthog1.jpg", "Warthog", 5, 7, 6, 1);

  ///////////////////////////////////////////////////////////////////////////////////
  SafariAnimal tP= new SafariAnimal ("Topis like to rub their heads on the ground to spread their scent and mark their territory", "topi1.jpg", "Topi", 6, 5, 8, 6);

  ///////////////////////////////////////////////////////////////////////////////////
  SafariAnimal zB= new SafariAnimal ("Zebras sleep standing up, but only when they are in larger groups", "zebra1.jpg", "Zebra", 7, 5, 7, 5);

  System.out.print(tP.getSize()+", ");
  System.out.print(tP.getFunFact()+", ");
  System.out.print(zB.getFunFact()+", ");
  
  }
    
  
  public static int multiplyTwoNumbers(int a, int b){
    return a * b;
  }
  public static void print(String stuff){
    System.out.println(stuff);
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
  
}

