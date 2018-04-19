package wordcountfromfile;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("language", "java");
		map.put("company", "oracle");
		map.put("Manager", "naveen");
		
		
/*Set<Map.Entry<String, String>> entrySet=map.entrySet();
for (Entry<String, String> entry : entrySet) {
	String key=entry.getKey();
	String value=entry.getValue();
	System.out.println(key + " "+value);*/
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			//System.out.println(key);
			String value=map.get(key);
			System.out.println("for " +   key   +  "   the value is : "+value);
			
			
			
			
			
		}
		
	
}

	
	
	
	
}
		
		
	


