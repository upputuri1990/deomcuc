package wordcountfromfile;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class OccuranceOfEachCharacter {
	
	public static void main(String[] args) {
		String str="i am looking for job";
		HashMap<String, Integer> countMap=new HashMap<String, Integer>();
		String[] words=str.split("");
		for (int i = 0; i < words.length; i++) {
			  String key = words[i].toLowerCase();
			if (key.length() > 0) {
			if (!countMap.containsKey(key)) {
			  countMap.put(key, 1);
		}
			else
			{
				int value=countMap.get(key);
				value++;
				countMap.put(key, value);
			}
			
		}
		}
		Set<Map.Entry<String, Integer>> entrySet=countMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() +  " \t  "  + entry.getValue());
			
		}
		
	}
}
		
	


