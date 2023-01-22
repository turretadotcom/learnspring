package com.turreta.learnspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Access localhost:8080/[context, if any]/welcome
 */
@Controller
@RequestMapping(value = "/welcome")
public class MyController {

    @GetMapping
    public ModelAndView getTestData() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");
        mv.getModel().put("message", "Welcome to www.turreta.com");

        return mv;
    }
}
