import java.io.IOException;
import java.util.ArrayList;

public class CalllingUtility {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//ExcelGetData obj=new ExcelGetData();
		//ArrayList callingData=obj.getDataMethod("Login");
		//System.out.println(callingData);
		UtilityMethod newobj=new UtilityMethod();
		newobj.getData("Purchase");
		

}
}
