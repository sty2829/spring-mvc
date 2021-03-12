package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {

	public static void main(String[] args) {
		
		Map<String,String> student = new HashMap<>();
		
		student.put("name", "은선");
		student.put("etc", "짱");
		
		List<Map<String,String>> students = new ArrayList<>();
		
		students.add(student);
		
		student = new HashMap<>();
		
		student.put("name", "치우");
		student.put("etc", "귀요미");
		
		students.add(student);
		
		Map<String,Object> academi = new HashMap<>();
		academi.put("name", "이젠");
		academi.put("students", students);
		
		List<Map<String,Object>> academis = new ArrayList<>();
		academis.add(academi);
		
		//////////////////////////////////////////////////
		student = new HashMap<>();
		
		student.put("name", "사람1");
		student.put("etc", "뭐...");
		
		students = new ArrayList<>();
		
		students.add(student);
		
		student = new HashMap<>();
		
		student.put("name", "사람2");
		student.put("etc", "흠..");
		
		students.add(student);
		
		academi = new HashMap<>();
		academi.put("name", "더존");
		academi.put("students", students);
		
		academis.add(academi);
		
		System.out.println(academis);
	}
}
