package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Iron_Man {
	

	    // Define superhero power levels
	    private static final Map<String, Integer> powerLevels = new HashMap<>();

	    static {
	        powerLevels.put("Thor", 95);
	        powerLevels.put("Hulk", 98);
	        powerLevels.put("Iron Man", 85);
	        powerLevels.put("Captain America", 80);
	        powerLevels.put("Spider-Man", 83);
	        powerLevels.put("Doctor Strange", 90);
	        powerLevels.put("Black Panther", 82);
	        powerLevels.put("Scarlet Witch", 97);
	        powerLevels.put("Thanos", 99);
	    }

	    public static String determineWinner(String hero1, String hero2) {
	        hero1 = hero1.trim();
	        hero2 = hero2.trim();

	        if (!powerLevels.containsKey(hero1) || !powerLevels.containsKey(hero2)) {
	            return "invalid";
	        }

	        int power1 = powerLevels.get(hero1);
	        int power2 = powerLevels.get(hero2);

	        if (power1 > power2) {
	            return hero1 ;
	        } else if (power2 > power1) {
	            return hero2 ;
	        } else {
	            return "tie";
	        }
	    }

}
