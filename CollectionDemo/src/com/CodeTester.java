package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeTester {

	public static void main(String[] args) {
		Coder c1=new Coder(101, "Naresh", "JavaFs");
		Coder c2=new Coder(102, "Nikki",  "Java");
		Coder c3=new Coder(103, " Nithesh","AI");
		Coder c4=new Coder(104, "Hariesh", "ML");
		Coder c5=new Coder(105, "Venky", "Python");
		
		List <Coder> ls=new ArrayList<>();
		ls.add(c1);
		ls.add(c2);
		ls.add(c3);
		ls.add(c4);
		ls.add(c5);
		
		Collections.sort(ls);
		System.out.println(ls);

	}

}
