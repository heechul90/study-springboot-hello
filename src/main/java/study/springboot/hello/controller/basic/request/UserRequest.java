package study.springboot.hello.controller.basic.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

    private String name;
    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;
    private String address;
}
