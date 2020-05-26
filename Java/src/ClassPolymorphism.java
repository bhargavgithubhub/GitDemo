
 class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
  private void tesT() {
	  System.out.println("Testing");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Pig {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
  
  
}

class MyMainClass {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Pig myPig = new Pig();  // Create a Pig object
    
    Pig myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
    
  }
  
}

