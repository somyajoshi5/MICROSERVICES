package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.HashMap;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Demo");

		HashMap<Employee, Double> map = new HashMap<>();
		//List<String> list = new ArrayList();

		Employee e1 = new Employee(1, "Somya", 100);
		Employee e2 = new Employee(2, "amit", 102);
		Employee e3 = new Employee(3, "amit", 103);

		map.put(e1, 100d);
		map.put(e2, 20d);
		//System.out.println(map.size());

		map.get(e3);
//
		//System.out.println(map.size());
		//System.out.println(map);
//
		e1.setId(3);
//
		System.out.println(map);
		System.out.println(map.get(e1));
	}

}
