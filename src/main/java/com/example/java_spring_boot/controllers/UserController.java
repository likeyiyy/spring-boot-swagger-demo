package com.example.java_spring_boot.controllers;

import com.example.java_spring_boot.models.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value = "用户模块")
public class UserController {
    public static List<User> users = new ArrayList<User>();

    static {
        users.add(new User("likeyi", 32));
        users.add(new User("qinpeipei", 26));
    }

    @GetMapping("/users")
    @ApiOperation(value = "获取用户列表", notes = "获取所有用户的列表")
    public List<User> users() {
        return users;
    }

    @GetMapping("/users/{id}")
    @ApiImplicitParam(name="id", value = "用户的id", paramType = "path")
    @ApiOperation(value = "获取单个用户", notes = "根据用户ID查询用户的信息")
    public User getUsersById(@PathVariable("id") int id) {
        return users.get(id);
    }

    @ApiOperation(value = "添加单个用户", notes = "根据用户ID信息添加")
    @PostMapping("/userAdd")
    public Object add(User user) {
        return users.add(user);
    }

    @DeleteMapping("/users/{id}")
    @ApiImplicitParam(name = "id", value = "用户的id", paramType = "path")
    @ApiOperation(value = "删除用户", notes = "根据用户ID删除用户的信息")
    public Object delete(@PathVariable("id") int id) {
        return users.remove(id);
    }
}
