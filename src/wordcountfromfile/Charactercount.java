package wordcountfromfile;

import java.util.HashMap;
import java.util.TreeMap;

public class Charactercount {
	public static void charCount(String str)
	{
		TreeMap<Character, Integer> hashMap=new TreeMap<Character,Integer>();
		char[] c=str.toCharArray();
		for (char d : c) {
			if (hashMap.containsKey(d)) {
				hashMap.put(d, hashMap.get(d)+1);
			}
			else
			{
				hashMap.put(d,1);
				}
			
		}
		
		System.out.println(hashMap);
	}
	public static void main(String[] args) {
		charCount("naveenbabu241naveenbabu");
		
	}

}
