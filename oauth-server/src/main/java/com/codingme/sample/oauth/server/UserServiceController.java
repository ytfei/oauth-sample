package com.codingme.sample.oauth.server;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yang Tengfei on 3/12/15.
 */
@RestController
@RequestMapping("/user")
public class UserServiceController {

    @RequestMapping("/info/{name}")
    @ResponseBody
    public String getUserInfo(@PathVariable("name") String userName) {
        return "Hi " + userName;
    }
}
