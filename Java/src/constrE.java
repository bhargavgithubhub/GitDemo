
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class constrE {
	// class parameters
	int x;

	public constrE() {
		x = 5;
		int y = 7;
		System.out.println("Constructery " + y);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constrE obj = new constrE();

		System.out.println(obj.x);

	}

}

class Car {
	int modelYear;
	String modelName;

	public Car(int year, String name) {

		modelYear = year;
		modelName = name;
	}

	public static void main(String[] args) {
		Car myCar = new Car(1969, "Mustang");
		System.out.println(myCar.modelYear + " " + myCar.modelName);
	}
}

class HasMapT {
	public static void main(String[] args) {
		// Create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
	}
}

class HasMapB {

	public static void main(String[] args) {
		HashMap<Integer, String> maps = new HashMap<Integer, String>();

		maps.put(5, "Bhargav");
		maps.put(4, "vxvxc");
		// int size=maps.size();

		System.out.println(maps.values());

		System.out.println(maps.keySet());

	}

}

class HasSetString {
	public static void main(String[] args) {
		HashSet<String> str = new HashSet<String>();
		String[] arrayString = { "First", "Second", "Third" };
		for (int i = 0; i < arrayString.length; i++) {
			str.add(arrayString[i]);
		}
		// System.out.print(str.isEmpty());
		Iterator<String> itr = str.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}
}

class HaashSet {
	public static void main(String[] args) {
		// Set<Integer> sets=new HashSet<Integer>();
		Set<Integer> sets = new HashSet<Integer>();
		int count[] = { 34, 67, 22, 10, 60, 30, 22 };
		for (int i = 0; i < count.length; i++) {
			sets.add(count[i]);
		}
		sets.add(67);
		sets.add(7987987);
		System.out.println("Before Sorting :" + sets);
		TreeSet sortedSet = new TreeSet<Integer>(sets);
		System.out.println("After Sorting \"of values\"  " + sortedSet);
		Iterator<Integer> itrInt = sets.iterator();
		while (itrInt.hasNext()) {
			System.out.println("Using Iterator method vaules are " + itrInt.next());
		}

	}
}

class SetNew {
	public static void main(String[] args) {
		// Set<Integer> bsetss=new HashSet<Integer>();

	}

}

class SetDemo {

	public static void main(String args[]) {
		int count[] = { 34, 22, 10, 60, 30, 22 };
		//ArrayList<Integer> alist = new ArrayList<Integer>();

		Set<Integer> set = new HashSet<Integer>();
		try {
			for (int i = 0; i < 5; i++) {
				set.add(count[i]);
			}
			System.out.println(set);

			TreeSet sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is:");
			System.out.println(sortedSet);

			System.out.println("The First element of the set is: " + (Integer) sortedSet.first());
			System.out.println("The last element of the set is: " + (Integer) sortedSet.last());
		} catch (Exception e) {
		}
	}
}
