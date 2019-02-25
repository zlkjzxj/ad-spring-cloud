package com.sunny.ad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\20 0020 9:42
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    String test() {
        return "hello";
    }
}
