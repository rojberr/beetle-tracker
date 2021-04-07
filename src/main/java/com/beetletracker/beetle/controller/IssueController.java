package com.beetletracker.beetle.controller;

import com.beetletracker.beetle.issues.IssueCategoryService;
import com.beetletracker.beetle.issues.IssueRequestDto;
import com.beetletracker.beetle.issues.IssueService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class IssueController {
    private final IssueCategoryService issueCategoryService;
    private final IssueService issueService;

    @GetMapping("/create")
    public String createGet() {
        return "issues/report";
    }

    @GetMapping("/app/issue/create")
    public String issueAddGet(Model model){
        model.addAttribute("issue", new IssueRequestDto());
        model.addAttribute("categories", issueCategoryService.findAll());
        return "issues/addIssue";
    }

    @PostMapping("/app/issue/create")
    public String issueAddPost(IssueRequestDto issue, Authentication auth){
        issueService.save(issue, auth);
        return "redirect:/";
    }
}
