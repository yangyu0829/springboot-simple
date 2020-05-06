package com.onion.controller;

import com.onion.common.tool.Res;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @作者:yu
 * @时间:2019-04-22
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Res<String> hello() {
        return Res.ok.data("hello world");
    }
}
