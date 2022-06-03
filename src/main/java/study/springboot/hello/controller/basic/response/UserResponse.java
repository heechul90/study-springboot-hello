package study.springboot.hello.controller.basic.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
//@JsonInclude(JsonInclude.Include.NON_NULL) //null은 포함하지 않는다.
public class UserResponse {

    private String name;
    private Integer age;

    @JsonProperty("phone_number")
    private String phoneNumber;
    private String address;

}
