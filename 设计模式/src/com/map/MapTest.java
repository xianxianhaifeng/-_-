package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
 
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "yang");
		map.put("name", "xiao");
		map.put("name", "qing");
		
		for(String key:map.keySet()){
			System.out.println(map.get(key));
		}
	}

}
