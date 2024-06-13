package com.example.imgkic;

import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Get;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Param;
import org.noear.solon.annotation.Produces;
import org.noear.solon.boot.web.MimeType;

@Controller
public class DemoController {
    @Mapping("/hello")
    public String hello(@Param(defaultValue = "world") String name) {
        return String.format("Hello %s!", name);
    }

    @Produces(MimeType.APPLICATION_JSON_VALUE)
    @Get
    @Mapping("/test2")
    public String test2(){
        return "{\"message\":\"返回字符串并输出\"}";
    }



}