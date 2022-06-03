package study.springboot.hello.controller.basic;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.springboot.hello.controller.basic.request.UserRequest;
import study.springboot.hello.controller.basic.response.UserResponse;

@RestController
@RequestMapping(value = "/api/hello")
public class ApiController {

    @GetMapping
    public String hello() {
        return "hello springboot!";
    }

    @GetMapping("/text")
    public String text(@RequestParam("account") String account) {
        return account;
    }

    @PostMapping("/json")
    public UserResponse json(@RequestBody UserRequest request) {
        UserResponse response = new UserResponse();
        response.setName(request.getName());
        response.setAge(request.getAge());
        response.setPhoneNumber(request.getPhoneNumber());
        response.setAddress(request.getAddress());
        return response;
    }

    @PutMapping("/put")
    public ResponseEntity<UserResponse> put(@RequestBody UserRequest request) {
        UserResponse response = new UserResponse();
        response.setName(request.getName());
        response.setAge(request.getAge());
        response.setPhoneNumber(request.getPhoneNumber());
        response.setAddress(request.getAddress());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
