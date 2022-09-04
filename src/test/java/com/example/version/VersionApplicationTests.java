package com.example.version;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VersionApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(VersionApplication.class); 
	
	@Test
	void contextLoads() {
		logger.info("Testcase Executing!!!");
		assertEquals(true, true);
	}

}
