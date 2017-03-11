package Collections;

//*******************************************************************
//NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class
import java.util.*;

//one class needs to have a main() method
public class CollectionsIterator {
	// arguments are passed using the text field below this editor
	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(2);

		System.out.println("Size of list :" + myList.size());

		for (int i : myList) {
			System.out.println(i);
		}

		Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(1);
		mySet.add(2);
		mySet.add(2);

		System.out.println("Size of Set :" + mySet.size());

		for (int i : mySet) {
			System.out.println(i);
		}

		Map<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("1", 1000);
		myMap.put("2", 2000);
		myMap.put("2", 3000);

		System.out.println("size of map: " + myMap.size());

		for (String s : myMap.keySet()) {
			System.out.println(myMap.get(s));
		}

		Hashtable<String, Integer> myHashTable = new Hashtable<String, Integer>();
		myHashTable.put("1", 1000);
		myHashTable.put("2", 2000);
		myHashTable.put("2", 3000);

		System.out.println("size of table: " + myMap.size());

		for (String s : myHashTable.keySet()) {
			System.out.println(myHashTable.get(s));
		}

		Properties pr = new Properties();
		pr.put("Java", "James Ghosling");
		pr.put("C++", "Bjarne Stroustrup");
		pr.put("C", "Dennis Ritchie");
		pr.put("C#", "Microsoft Inc.");

		for (Object s : pr.keySet()) {
			System.out.println(pr.get(s));
		}

	}
}
