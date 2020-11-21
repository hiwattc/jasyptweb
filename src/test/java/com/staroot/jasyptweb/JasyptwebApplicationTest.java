package com.staroot.jasyptweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import org.springframework.core.env.ConfigurableEnvironment;
import org.junit.BeforeClass;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
//import org.junit.Test;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertEquals;

@SpringBootTest
class JasyptwebApplicationTests {

    @Autowired
    ConfigurableEnvironment environment;
	@BeforeClass
    public static void beforeClass() {
		System.setProperty("jasypt.encryptor.password", "password");
		System.out.println("hello==================");
	}
    @Test
    public void testDbPassword() {
		System.out.println("hello=================="+environment.getProperty("secret.property"));
		System.out.println("hello=================="+environment.getProperty("secret.property"));
		System.out.println("hello=================="+environment.getProperty("secret.property"));
		System.out.println("hello=================="+environment.getProperty("secret.property"));
		System.out.println("hello=================="+environment.getProperty("secret.property"));
		System.out.println("hello=================="+environment.getProperty("secret.property"));
		System.out.println("hello=================="+environment.getProperty("secret.property"));
		System.out.println("hello=================="+environment.getProperty("secret.property"));
		System.out.println("hello=================="+environment.getProperty("secret.property"));
		System.out.println("hello=================="+environment.getProperty("secret.property"));
        Assert.assertEquals("chupacabras", environment.getProperty("secret.property"));
    }
	@Test
	void contextLoads() {
	}

}
