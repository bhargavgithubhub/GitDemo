
public class returnClass {
	private String a="this string from return method";
	private int b=9909999;
	private String other="another String";
	public returnClass(String abc) {
		System.out.println("constructer "+ abc);
	}
	
	
	public String methodcxc(int iM,String other) {
		//System.out.println("sdfsdfds");
		System.out.println(b);
		System.out.println(other);
		System.out.println(this.b=iM);
		return a;
		//return b;
		
	}
	
	public static   String staticMethod() {
		System.out.println("i am static method");
		return "i am static return";
	}
	
	public static void main(String[] args) {
		System.out.println(staticMethod());
	}
}
