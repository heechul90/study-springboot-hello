package study.springboot.hello.controller.put.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class UserRequest {

    private String name;
    private String age;

    @JsonProperty("car_list")
    private List<Car> carList;

}
