package com.dandan.controller;

import com.dandan.service.StuService;
import com.dandan.service.UserService;
import com.dandan.utils.IMOOCJSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
@RequestMapping("passport")
public class PassportController {

    @Autowired
    private UserService userService;

    @GetMapping("/usernameIsExit")
    public IMOOCJSONResult usernameIsExist(@RequestParam String username){

        // 1.用户名不能为空
        if (StringUtils.isBlank(username)){
            return IMOOCJSONResult.errorMsg("用户名不能为空");
        }

        // 2. 查找注册的用户名是否存在
        boolean isExist = userService.queryUsernameIsExist(username);
        if (isExist){
            return IMOOCJSONResult.errorMsg("用户名已经存在");
        }

        // 3.请求成功，用户名没有重复
        return IMOOCJSONResult.ok();
    }

}
