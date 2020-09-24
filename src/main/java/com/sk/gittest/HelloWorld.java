package com.sk.gittest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangsk
 * @date 2020/9/24
 */
@RestController
public class HelloWorld {

    @RequestMapping("hello")
    public String curDate() {
        Date date = new Date();
        String dateStr = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(date);
        System.out.println(dateStr);
        System.out.println("你好");
        return dateStr;
    }

}
