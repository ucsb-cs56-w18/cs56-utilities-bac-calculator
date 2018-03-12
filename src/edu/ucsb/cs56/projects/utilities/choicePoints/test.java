import java.util.*;

class sortmapKey {
	static Map<String, Double> beerMap = new HashMap<String, Double>();
	
	public static void sortByKey(Map<String, Double> map) {
                ArrayList<String> sortedKeys = new ArrayList<String>(map.keySet());
                Collections.sort(sortedKeys);
		
		for (String x : sortedKeys) {
			System.out.println("key = " + x + ", value = " + map.get(x));
		}
	}


	public static void main(String args[]) {

		beerMap.put("Coors Light", .042);
        	beerMap.put("Milwaukee's Best Ice", .059);
        	beerMap.put("Keystone Ice", .059);
        	beerMap.put("Big Flats Light Beer", .039);
        	beerMap.put("Natural Ice", .059);
        	beerMap.put("Natural Light", .042);
        	beerMap.put("Bud Light Platinum", .06);
        	beerMap.put("Miller Lite", .042);
        	beerMap.put("Smirnoff Ice", .05);
        	beerMap.put("Blue Moon", .054);
        	beerMap.put("IPA", .07);
        	beerMap.put("Other", .045);

        	sortByKey(beerMap);	
	}

}

