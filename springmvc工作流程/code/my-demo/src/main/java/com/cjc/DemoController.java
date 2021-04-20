package com.cjc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2021/4/18
 * Time: 20:13
 * To change this template use File | Settings | File Templates.
 **/
@Controller
public class DemoController {

    @RequestMapping("/hello")
    public void hello(HttpServletResponse response) throws IOException {
        OutputStream outputStream = response.getOutputStream();
        outputStream.write("nihaoma".getBytes());
    }

}
