package de.demmer.dennis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class UserUtil {
	
	public static void print(HashMap<Integer, User> map, int startIndex) {
			
		Set<Entry<Integer, User>> mapSet = map.entrySet();
		ArrayList<Entry<Integer, User>> mapList = new ArrayList<>(mapSet);
		
		
		// iterate over map with entry set
//		for (Entry<Integer, User> e  :  mapSet ) {
//			
//			System.out.println(e.getKey() + " | " + e.getValue());	
//		}
		
		iterMap(mapList, startIndex);
		
//		for (int i = startIndex; i < mapList.size(); i++) {
//			Entry<Integer, User> eintrag = mapList.get(i);
//			System.out.println(eintrag.getKey() + " | " + eintrag.getValue());
//		}
		
	}
	
	
	
	private static void iterMap(ArrayList<Entry<Integer, User>> list, int startIndex) {
		
		if(startIndex >= list.size()) {
			return;			
		}
		
		System.out.println(list.get(startIndex).getKey() + " | " +  list.get(startIndex).getValue());
		
		startIndex++;
		iterMap(list,startIndex);
		
	}
	
	
	
	

}
