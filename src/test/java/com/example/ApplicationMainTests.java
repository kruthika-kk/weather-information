package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationMainTests {
	@Autowired
	private Webcontroller controller;

	@Test
	void contextLoads() {
		Assertions.assertEquals(controller,controller);
	}
	}

