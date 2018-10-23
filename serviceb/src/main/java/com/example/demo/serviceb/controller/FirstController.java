package com.example.demo.serviceb.controller;

import com.example.demo.servicebprovider.provider.FeignProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/b")
@RestController
public class FirstController implements FeignProvider {
    @RequestMapping("/first")
    public String first() {
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)attributes).getRequest();
        request.getHeader("relation_id");
        System.out.println("b first");
        return "b";

    }

    @Override
    public String feignProvider() {
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)attributes).getRequest();

        /*try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return  request.getHeader("relation_id");
    }
}
