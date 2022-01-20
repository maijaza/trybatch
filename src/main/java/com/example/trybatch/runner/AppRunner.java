package com.example.trybatch.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	    for(int i=0; i< 10; i++) {
	    	Thread.sleep(1000);
	    	System.out.println(i);
	    }
	}
}
