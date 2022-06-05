package io_Operation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class IO_03 {

	public static void main(String[] args) throws IOException {
		
		File inputFile = new File(args[0]);
		File outputFile = new File(args[1]);
		
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
		
		Map<String, Integer> m = new TreeMap<>();
		
		String s;
		while((s = br.readLine())!=null) {
			s=s.trim();
			String[] word = s.split(" ");
			
			for(String w : word) {
				if(!m.containsKey(w))
					m.put(w,1);
				else
					m.put(w,m.get(w)+1);
			}
		};
		
		Set<Entry<String,Integer>> set = m.entrySet();
		Iterator<Entry<String,Integer>> it = set.iterator();
		while(it.hasNext()) {
			Entry<String,Integer> e = it.next();
			bw.write(e.getKey()+" : "+e.getValue()+"\n");
		}
		br.close();
		bw.close();
		

	}

}
