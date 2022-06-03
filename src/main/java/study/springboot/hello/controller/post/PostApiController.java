package study.springboot.hello.controller.post;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springboot.hello.controller.post.request.UserRequest;

/**
 * json
 * {
 *     "phone_number" : "010-1111-2222",
 *     "age" : 33,
 *     "isAgree" : true,
 *     "account" : {
 *         "email" : "spring@spring.com",
 *         "password" : "1234"
 *     },
 *     "user_list" : [
 *         {
 *             "name" : "spring1",
 *             "address" : "seoul"
 *         },
 *         {
 *             "email" : "spring2",
 *             "password" : "busan"
 *         },
 *         {
 *             "email" : "spring3",
 *             "password" : "incheon"
 *         }
 *     ]
 * }
 */
@RestController
@RequestMapping(value = "/api/post")
public class PostApiController {

    @PostMapping()
    public String post(@RequestBody UserRequest request) {
        System.out.println("request = " + request.toString());
        return "ok";
    }
}
