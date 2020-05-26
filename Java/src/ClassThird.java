
public class ClassThird extends ClassSecOverRides  {

	
	public void animalSound() {
	    System.out.println("Third");
}
	public static void main(String[] args) {
		//ClassSecOverRides third= new ClassThird();
		ClassFirst chk= new ClassFirst ();
		chk.animalSound();
	}
}