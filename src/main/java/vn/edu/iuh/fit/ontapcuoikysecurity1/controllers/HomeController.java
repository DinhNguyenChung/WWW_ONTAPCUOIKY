package vn.edu.iuh.fit.ontapcuoikysecurity1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class HomeController {
    @GetMapping({""})
    public ModelAndView home(ModelAndView modelAndView) {
        ModelAndView mav =modelAndView;
        mav.setViewName("redirect:/shopping");
        return mav;
    }
    @GetMapping("/login")
    public String login(){
        return "client/login";
    }
}
