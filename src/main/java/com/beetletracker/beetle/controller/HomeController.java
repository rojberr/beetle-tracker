package com.beetletracker.beetle.controller;

import com.beetletracker.beetle.issues.Issue;
import com.beetletracker.beetle.issues.IssueCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@AllArgsConstructor
public class HomeController {
    private final IssueCategoryService issueCategoryService;

    @GetMapping("/home")
    public String getIssues() {
        return "home";
    }





}
