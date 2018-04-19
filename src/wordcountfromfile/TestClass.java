package wordcountfromfile;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestClass {
	
	
	public static void main(String[] args) {
		
		
		Scanner input =  new Scanner(System.in);//Read the data from the console
		System.out.println("Pass the inout file:");
		String inpFile  = input.next();
		
		BufferedReader bf = null;// read the text from the character based input stream
		int count = 0;
				
				int wordcount = 0;
		String line = "";
		//Map<String, Integer> occurrences = new HashMap<String, Integer>(); // get the data as a key value pairs
		Map<String, Integer> occurrences = new TreeMap<String, Integer>();
		Writer writ = null;
		
		try {
			bf = new BufferedReader(new FileReader(inpFile));// pass the input file as ./src/words.txt
			while ((line = bf.readLine()) != null) {//read the data from line by line by using readLine() method 
				
				String[] words = line.split(" ");//split the data in the file like divide the data into tokens

				for (String word : words) { //for each loop to iterate the number of words in a file
					Integer oldCount = occurrences.get(word);
					if (oldCount == null) {
						oldCount = 0;
					}
					occurrences.put(word, oldCount + 1);
				}
			}
			for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
				String key = entry.getKey();// store the key  in  a key reference in the form of String
				Integer value = entry.getValue();// store the value  in  a value reference in the form of Integer
				System.out.println(key + " is present " + value);
			}

		} catch (FileNotFoundException fnfex) {
			fnfex.printStackTrace();// print the exception information 
		} catch (IOException ioex) {
			ioex.printStackTrace();
		} finally {

			
			try {
				if (null != bf) {
					bf.close();
				}
			} catch (IOException ioex) {
				ioex.printStackTrace();
			}

		}
		
	}

}
