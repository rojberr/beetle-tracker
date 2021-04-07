package com.beetletracker.beetle.controller;

import com.beetletracker.beetle.issues.Issue;
import com.beetletracker.beetle.issues.IssueCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class IssuesController {
    private final IssueCategoryService issueCategoryService;

    @GetMapping("/create")
    public String createGet() {
        return "issues/report";
    }

    @GetMapping("/app/issue/create")
    public String issueAddGet(Model model){
        model.addAttribute("issue", new Issue());
        model.addAttribute("issue", new Issue());
        model.addAttribute("categories", issueCategoryService.findAll());
        return "issues/addIssue";
    }

    @PostMapping("/app/issue/create")
    public String issueAddPost(Issue issue, Authentication auth){
        return "redirect:/";
    }
}
