package study.springboot.hello.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String name;
    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;

}
