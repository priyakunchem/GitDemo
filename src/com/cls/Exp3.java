package com.cls;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Exp3 {

	public static void main(String[] args) {
List<String> names = new ArrayList<String>();
		
		names.add("sony");
		names.add("zero");
		names.add("dell");
		names.add("apple");
		names.add("lenovo");
		names.add("hello");
		names.add("asus");
		names.add("sony");
		names.add("dell");
		
		//List<String> flt = names.stream().filter(dt -> dt.length() > 4).collect(Collectors.toList());
		
		//List<String> flt1 = names.stream().filter(dt -> dt.startsWith("a")).collect(Collectors.toList());
		
		//List<String> flt2 = names.stream().distinct().collect(Collectors.toList());
		
		List<String> flt3 = names.stream().sorted().collect(Collectors.toList());
		
		flt3.forEach(n -> System.out.println(n));
	}

}


