package study.springboot.hello.controller;

import org.springframework.web.bind.annotation.*;
import study.springboot.hello.dto.UserRequest;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/get")
public class GetApiController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "hi get";
    }

    @GetMapping("/path-variable/{id}")
    public String pathVariable(@PathVariable("id") String id) {
        return id;
    }

    @GetMapping(value = "/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }

    @GetMapping(value = "/query-param02")
    public String queryParam02(@RequestParam("user") String user,
                               @RequestParam("email") String email,
                               @RequestParam("age") int age) {
        return user + " " + email + " " + age;
    }

    @GetMapping(value = "/query-param03")
    public String queryParam03(UserRequest request) {
        return request.toString();
    }
}
