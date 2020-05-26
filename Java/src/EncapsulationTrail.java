public class EncapsulationTrail {
	//private for better control of class attributes and methods i.e for inside class use only.
 private String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//getMethod for read-only 
	public String getMethod() {
		return name;
	//setMethod for Write-only concept	
	}
	public void setMethod(String updated) {
	this.name=updated;	
		
	}
	
}


