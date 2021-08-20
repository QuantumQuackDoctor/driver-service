package com.ss.driverapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;

@ApiModel(description = "User DTO")
@Getter
@Setter
@NoArgsConstructor
public class Driver {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("email")
    @ApiModelProperty(example = "email@example.com")
    @Email
    private String email;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("car")
    private String car;
}
