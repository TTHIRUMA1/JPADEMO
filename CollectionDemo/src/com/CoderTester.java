package com;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class CoderTester implements Comparator <Coder> {

	public static void main(String[] args) {
		CoderTester obj=new CoderTester();
		  
		Coder c1=new Coder(101,"Mani","JavaFS");
		Coder c2=new Coder(103, "Chittappu", "Java");
		Coder c3=new Coder(102, "Naresh","AI");
		Coder c4=new Coder(105, "Nikki", "ML");
		Coder c5=new Coder(104, "Nithesh","Python");
		
		List<Coder> ls=new ArrayList<>();
		ls.add(c1);
		ls.add(c2);
		ls.add(c3);
		ls.add(c4);
		ls.add(c5);
		
		Collections.sort(ls,obj);
		System.out.println(ls);
	}
		
		
		 public int compare(Coder o1, Coder o2)
		{
			//int i=o1.getCid()-o2.getCid();
			int i=o1.getCname().compareTo(o2.getCname());
			return i;
		}
				

	}


