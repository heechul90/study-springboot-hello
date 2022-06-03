package study.springboot.hello.controller.put;

import org.springframework.web.bind.annotation.*;
import study.springboot.hello.controller.put.request.UserRequest;

@RestController
@RequestMapping(value = "/api/put")
public class PutApiController {

    @PutMapping(value = "{userId}")
    public UserRequest put(@RequestBody UserRequest request, @PathVariable("userId") Long id) {
        System.out.println("id = " + id);
        return request;
    }
}
