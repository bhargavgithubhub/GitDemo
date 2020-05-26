
public class ImpClass implements InterFaceExp {

	public static void main(String[] args) {
		 //ImpClass obj= new ImpClass();

		InterFaceExp obj = new ImpClass();//run time Polymorphism.
		
	}

	public void sameSound() {
		System.out.println("The animal makes a sound");
	}

	public void tesT() {
		System.out.println("Testing");
	}
}
