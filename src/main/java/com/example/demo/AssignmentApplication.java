package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentApplication {
	static final int MAX_T = 10;  
	public static void main(String[] args) {
		 ExecutorService pool = Executors.newFixedThreadPool(MAX_T); 
		 BiCycleThread r1 = new BiCycleThread();
		 pool.execute(r1);
		 pool.shutdown(); 
	}

}
