package afghanistan;

import java.util.ArrayList;
import java.util.List;

public class Nangarhar {
	
	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		cities.add("Jalalabad");
		cities.add("Chaparhar");
		cities.add("Shenwari");
		cities.add("Sorkh road");
		cities.add("Khogyanii");
		
		System.out.println("Number of cities: " + cities.size());
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}
	}
}
