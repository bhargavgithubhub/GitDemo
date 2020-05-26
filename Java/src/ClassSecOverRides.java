
public class ClassSecOverRides extends ClassFirst {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassSecOverRides third= new ClassThird();
		ClassFirst chk= new ClassThird ();
		chk.animalSound();
	}

	public void animalSound() {
		System.out.println("Second");
	}
}