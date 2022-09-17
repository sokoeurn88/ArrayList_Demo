package javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Demo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add("Welcome to Java Collections");
		al.add(115.5);
		al.add(true);
		al.add('A');
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(4);
		System.out.println(al);
		
		al.add(0, "Sokoeurn");
		al.add(1, "Chhay");
		al.add(2, 'A');
		System.out.println(al);
		
		System.out.println(al.get(1));	//retrieve specific element by index
		
		System.out.println(  al.set(1, "Im"));	//replace or set new element
		System.out.println(al);
		
		System.out.println( al.contains("Chhay"));	//will return boolean value: true or false
		System.out.println(al.contains("Im"));
		
		System.out.println(al.isEmpty());	//will return boolean value
		
		//al.clear();		
		System.out.println(al.isEmpty());
		
		System.out.println(al);
		
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		
		for(Object e: al) {
			System.out.println(e);
		}
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList al_copy = new ArrayList();
		al_copy.addAll(al);			//addAll data from one ArrayList to new ArrayList
		System.out.println(al_copy);

		al_copy.removeAll(al);
		System.out.println("After removing:"+al_copy);
		
		ArrayList al_for_sort = new ArrayList();
		al_for_sort.add('b');
		al_for_sort.add('a');
		al_for_sort.add('c');
		al_for_sort.add('d');
		
		Collections.sort(al_for_sort);			//sort ArrayList
		System.out.println(al_for_sort);
		
		Collections.sort(al_for_sort, Collections.reverseOrder());			//reverseOrder of ArrayList
		System.out.println(al_for_sort);
		
		Collections.shuffle(al_for_sort);			//shuffle ArrayList
		System.out.println(al_for_sort);
		
		//convert Array into ArrayList
		String arr_family[] = {"sokoeurn","liday","nitha", "Ksatra","kosal"};
		for(String value:arr_family) {
			System.out.println(value);
		}
		
		ArrayList arr_to_arraylist = new ArrayList(Arrays.asList(arr_family));
		System.out.println(arr_to_arraylist);
		
	}

}
