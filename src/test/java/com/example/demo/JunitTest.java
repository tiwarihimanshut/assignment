package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class JunitTest {
	@Test
	public void CycleCost() {
	    // given
		new BiCycleThread().run();
	 	 
	    // then
		if(BiCycleThread.answer.equalsIgnoreCase("N")) {
			assertThat(BiCycleThread.costAmounttotal)
		      .isEqualTo(BiCycleThread.totalCost*BiCycleThread.quantity);
		}
	   
	}
}

