package study.springboot.hello.controller.get.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserRequest {

    private String user;
    private String email;
    private int age;
}
