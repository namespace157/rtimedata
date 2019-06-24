package com.sdjictec.bqdrtime.rtimedata.controller;

import com.sdjictec.bqdrtime.rtimedata.entity.UserTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/userTest")
public class UserTestController {
    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    @ResponseBody
    public List<UserTest> getUserList(){
        System.out.println("*************");
        List<UserTest> list = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            UserTest userTest = new UserTest();
            userTest.setId(i+1);
            userTest.setUsername("test" + i);
            userTest.setAge(10 + i);
            userTest.setSex("男");
            list.add(userTest);
        }
        return list;
    }
}
