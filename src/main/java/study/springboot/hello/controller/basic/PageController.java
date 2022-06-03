package study.springboot.hello.controller.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import study.springboot.hello.controller.basic.response.UserResponse;

@Controller
public class PageController {

    @RequestMapping(value = "/main")
    public String main() {
        return "main.html";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public UserResponse user() {
        UserResponse response = new UserResponse();
        response.setName("spring");
        response.setPhoneNumber("010-1111-2222");
        response.setAddress("seoul");
        return response;
    }
}
