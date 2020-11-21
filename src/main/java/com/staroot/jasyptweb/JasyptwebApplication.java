package com.staroot.jasyptweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ResponseBody;




@RestController
@SpringBootApplication
public class JasyptwebApplication {

	private static final Logger log = LoggerFactory.getLogger(JasyptwebApplication.class);
    static {
        System.setProperty("jasypt.encryptor.password", "password");
    }





	public static void main(String[] args) {
        //System.setProperty("jasypt.encryptor.password", "password");
		SpringApplication.run(JasyptwebApplication.class, args);
	}
	@Autowired
    UserRepository repository;

	@GetMapping("/user")
    public void user(){
	        repository.save(new User("hiwatt1"));
        for(User user : repository.findAll()){
           log.info(user.toString());
        }
	}

	//@Value("${secret.property}")
	@Value("${secret.hello}")
    private String secret;

	@GetMapping("/")
	@ResponseBody
    public String home(){
		return "Hello, Secret Property: " + secret;
	}
}

