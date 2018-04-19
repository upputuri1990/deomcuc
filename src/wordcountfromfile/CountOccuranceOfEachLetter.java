package wordcountfromfile;

import java.util.HashMap;

public class CountOccuranceOfEachLetter {
	
	
	public static void main(String[] args) {
		HashMap<Character, Integer> hashMap=new HashMap<Character,Integer>();
		String str="csk csk cksjbdns x jsxghsvxjx mz x";
		char[] c=str.toCharArray();
		for (char d : c) {
			System.out.println(d);
			if (hashMap.containsKey(d)) {
				hashMap.put(d, hashMap.get(d)+1 );
			}
				else
				{
					
					hashMap.put(d, 1);
				}
				
				
			}
			System.out.println(hashMap);
		}
		
		
		
		
		
	}
	
	


