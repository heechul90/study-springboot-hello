package study.springboot.hello;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import study.springboot.hello.controller.User;

@SpringBootTest
class HelloApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("===================");

		var objectMapper = new ObjectMapper();

		//object -> text
		//object mapper get method 활용
		User user = new User("spring", 33, "010-2222-3333");
		var text = objectMapper.writeValueAsString(user);
		System.out.println("text = " + text);

		//text -> object
		//
		User objectUser = objectMapper.readValue(text, User.class); //default 생성자 필요
		System.out.println("objectUser = " + objectUser);

	}

}
