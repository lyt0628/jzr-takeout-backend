package icu.lyt0628.jzr_takeout.controller;


import icu.lyt0628.jzr_takeout.active_record.mapper.UserMapper;
import icu.lyt0628.jzr_takeout.active_record.User;
import icu.lyt0628.jzr_takeout.controller.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping
    public ResponseResult<List<User>> getAllUsers(){
        return ResponseResult.ok(userMapper.getAllUsers());
    }

    @PostMapping
    public ResponseResult<String> addUser(@RequestBody User user){
        userMapper.addUser(user);
        return  ResponseResult.ok();
    }

    @DeleteMapping("{id}")
    public ResponseResult<String> deleteUserById(@PathVariable Long id){
        userMapper.deleteUserById(id);
        return  ResponseResult.ok();
    }
}
