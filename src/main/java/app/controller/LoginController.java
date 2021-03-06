package app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Log4j2
@Controller
@RequestMapping
public class LoginController {

    @GetMapping("/")
    public String handle() {
        return "main-page";
    }

    @GetMapping("/login")
    public String loginHandler() {
        return "index";
    }

    @GetMapping("/login-error")
    public String errorLoginHandler(Model model){
        model.addAttribute("error", true);
        return "index";
    }
}
