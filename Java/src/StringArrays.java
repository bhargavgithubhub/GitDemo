
public class StringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//String [] Str1=new String [5];
//String[] str2=new String[] {"df","adfadf"};

//int [] int1= {1,2,5,8};
//boolean [] bl1= {true,false};

		String[] st1 = { "bh", "ar", "gav" };
		Boolean found = false;
		String chk = "gav";
		
	// if(s.equals(strArray[i]))

		for (int i = 0; i < st1.length; i++) {

			if (chk.equals(st1[i])) {
				int index = i;
				found = true;

				System.out.println("index of 'gav' is  " + i);
				break;
			}
		}
		if (found)
			System.out.println("Well Done");
		else
			System.out.println("Not Done Well");

	}

}
