package pl.ewelinka.cinema.Cinema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping
    public ModelAndView defaultPage()
    {
        ModelAndView mnv = new ModelAndView();
        mnv.setViewName("index");
        return mnv;
    }
}
