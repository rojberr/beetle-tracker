package com.beetletracker.beetle.controller;

import com.beetletracker.beetle.user.User;
import com.beetletracker.beetle.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/demo")
    public String demoPageGet(){
        return "demo";
    }

    // Login form
    @GetMapping("/login")
    public String loginPageGet(){
        return "user/login";
    }

    // Logout
    @GetMapping("/logout")
    public String logoutPageGet(){
        return "redirect:/";
    }

    // Login form with error
    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login.html";
    }

    @GetMapping("/register")
    public String registerGet(Model model){
        model.addAttribute("user", new User());
        return "user/register";
    }

    @PostMapping("/register")
    public String registerPost(User user){
        userService.registerUser(user);
        return "redirect:/login";
    }
}
