package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest2 {

	public static void main(String[] args) {
		Map<String,List<Map<String,String>>> map = new HashMap<>();
		List<Map<String,String>> foodList = new ArrayList<>();
		Map<String,String> f1 = new HashMap<>();
		
		f1.put("name", "육회탕탕이");
		f1.put("price", "28000");
		f1.put("etc", "맛있었드랬다");
		
		Map<String,String> f2 = new HashMap<>();
	
		f2.put("name", "고기순대");
		f2.put("price", "10000");
		f2.put("etc", "주인아줌마한테 당한듯..");
		
		foodList.add(f1);
		foodList.add(f2);
		
		List<Map<String,String>> pcList = new ArrayList<>();
		Map<String,String>  pc1 = new HashMap<>();
		pc1.put("cpu", "I7");
		pc1.put("ram", "16G");
		pc1.put("price", "1500000");
		
		Map<String,String>  pc2 = new HashMap<>();
		pc2.put("cpu", "I5");
		pc2.put("ram", "8G");
		pc2.put("price", "1000000");
		
		pcList.add(pc1);
		pcList.add(pc2);
		
		map.put("foodList", foodList);
		map.put("pcList", pcList);
		
		
		System.out.println(map);
		
	}
}
