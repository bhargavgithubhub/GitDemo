import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringArrayExample {
	public static void main(String[] args) {
		StringArrayExample strObj = new StringArrayExample();
		// strObj.StrArray();
		// strObj.exp();
		// strObj.strArrayToList();
		strArrayToSet();
	}

	public void StrArray() {

		// Converting String Array To A String
		String[] strArray3 = { "c", "a", "b", "g", "d" };
		int[] intExp = { 1, 2, 6, 8 };

		// int intArrayToInt== Arrays.toString(intExp);

		String theString = Arrays.toString(strArray3);

		System.out.println("Before Sorting by using Arrays class" + theString);

		// to sort an array don't convert string array to string
		Arrays.sort(strArray3);

		System.out.println("After Sorting by using Arrays class" + Arrays.toString(strArray3));

	}
	// #################################################################################################################

	public void strArrayToList() {
		String[] str = { "fs", "fs", "fd", "d" };
		List<String> nlist = Arrays.asList(str);
		// string aary to list then to array list
		// nlist.add("sdc");
		// can't add string array to list , can add string array to Arraylist
		// List<String> stringList = new ArrayList<String>(nlist );

		List<String> addArrayList = new ArrayList<String>(nlist);
	}

//Converting String Array To A Set
//While a List can contain elements that are duplicate, a Set cannot
	static void strArrayToSet() {
		String[] strArray3 = { "R", "S", "T", "T" };
		List<String> stringList = Arrays.asList(strArray3);
		Set<String> stringSet = new HashSet<String>(stringList);
		
		System.out.println("The size of the list is: " + stringList.size());
		System.out.println("The size of the set is: " + stringSet.size());
	}

}
class Main {

	// program to convert int array to List of Integer
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		List<Integer> list = new ArrayList<>(arr.length);

		for (int i : arr) {
			list.add(Integer.valueOf(i));
		}

		System.out.println(list);
	}
}