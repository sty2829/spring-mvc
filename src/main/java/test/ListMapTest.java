package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMapTest {

	public static void main(String[] args) {
		
		Map<String, List<Map<String, Object>>> groups = new HashMap<>();
		
		List<Map<String, Object>> clazz = new ArrayList<>();
		
		Map<String,Object> student = new HashMap<>();
		student.put("name", "상범");
		student.put("age", 22);
		clazz.add(student);
		
		student = new HashMap<>();
		student.put("name", "소희");
		student.put("age", 23);
		clazz.add(student);
		
		groups.put("p20", clazz);
		
		clazz = new ArrayList<>();
		
		student = new HashMap<>();
		student.put("name", "동성");
		student.put("age", 30);
		clazz.add(student);
		
		student = new HashMap<>();
		student.put("name", "은선");
		student.put("age", 31);
		clazz.add(student);
		
		groups.put("p30", clazz);
		
		System.out.println(groups);
		
	}
}
