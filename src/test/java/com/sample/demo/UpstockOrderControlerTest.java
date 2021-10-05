package com.sample.demo;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UpstockOrderControlerTest {
	 // bind the above RANDOM_PORT
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;
	@Test
	void contextLoads() {
		//ResponseEntity<String> response = restTemplate.getForEntity(
				//new URL("http://localhost:" + port + "/").toString(), String.class);
	        //assertEquals("Hello Controller", response.getBody());
	}

}
