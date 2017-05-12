package controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String printWelcome(Model model) {

        model.addAttribute("message", "Spring Security Custom Form example");
        return "hello";
    }
    
    @RequestMapping(value = "/login")
    public String login(@RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout, Model model) {
System.out.println("LOGIN GET");
        if (error != null) {
            model.addAttribute("error", "Invalid username and password!");
        }
        if (logout != null) {
            model.addAttribute("msg", "You've been logged out successfully.");
        }
        return "login";
    }

}
