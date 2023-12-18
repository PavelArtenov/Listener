package com.app.listener1.controller;

import com.app.listener1.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("listener/save")
    public void saveRequest(@RequestBody Model request) {
        System.out.println(request.getId());
    }
}
