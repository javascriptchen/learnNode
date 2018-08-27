package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.heima.bean.Person;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo1_Array {

	public static void main(String[] args) {
		//demo1();
		demo2();
	}

	private static void demo2() {
		Collection c = new ArrayList();
		c.add(new Person("张三", 23));				//Object obj = new Student("张三",23);
		c.add(new Person("李四", 24));
		c.add(new Person("王五", 25));
		c.add(new Person("赵六", 26));
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
			Person s = (Person)it.next();
			System.out.println(s.getName()+"..."+s.getAge());
		}
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}