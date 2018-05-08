package com.yiauto.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create date 2018/5/8
 * <p>描述</p>
 *
 * @author zhiheng.li
 * @since 1.0.
 */
@RestController
public class HelloWrold {

    @RequestMapping
    public String helloworld(){
        return "hello world";
    }
}
