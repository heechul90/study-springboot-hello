package study.springboot.hello.controller.delete;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/delete")
public class DeleteApiController {

    @DeleteMapping(value = "{userId}")
    public String delete(@PathVariable("userId") Long id) {
        System.out.println("id = " + id);
        return "ok";
    }
}
