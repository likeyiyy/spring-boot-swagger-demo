package com.example.java_spring_boot.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
@ApiModel(value = "User", description = "用户接口")
public class User {
    @ApiModelProperty("用户名称")
    private String name;

    @ApiModelProperty("用户年龄")
    private int age;

    public void disPlay() {
        log.info(toString());
    }
}
