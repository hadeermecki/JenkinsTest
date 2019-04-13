package com.example.SpringBootAdminClient;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(value = "/get-welcome" , method = RequestMethod.GET)
    public String Welcome (){
        System.out.println("Welcomeeeeeee");
        return "welcome";
    }
}
