package com.udacity.eureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@EnableEurekaServer
@SpringBootTest
public class EurekaApplicationTests {

	@Test
	public void contextLoads() {
	}

}
