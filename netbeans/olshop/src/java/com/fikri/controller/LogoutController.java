package com.fikri.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logout")
public class LogoutController {
    @RequestMapping() 
    public String logout(HttpSession session, Model model) {
        session.invalidate();
        return "welcome";
    }
}
