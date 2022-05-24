package de.demmer.dennis;

import java.util.HashMap;

public class Application {
	
	public static void main(String[] args) {
		
		User u1 = new User("Dennis", "bla@bla.de");
		User u2 = new User("Paul", "bli@bla.de");
		User u3 = new User("Max", "blub@bla.de");

		
		HashMap<Integer, User> map = new HashMap<>();
		
		map.put(655456, u1);
		map.put(545685, u2);
		map.put(754321, u3);
		
		UserUtil.print(map, 0);
		
		
		

		
		
		
		
	}

}
