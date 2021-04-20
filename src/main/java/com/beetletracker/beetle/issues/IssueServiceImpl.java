package com.beetletracker.beetle.issues;

import com.beetletracker.beetle.user.User;
import com.beetletracker.beetle.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
@AllArgsConstructor
public class IssueServiceImpl implements IssueService {
    private final IssueRepository issueRepository;
    private final UserService userService;
    private final IssueCategoryService issueCategoryService;

    @Override
    public void save(IssueRequestDto issueReq, Authentication auth) {
        User user = userService.findByEmail(auth.getName());
        IssueCategory category = issueCategoryService.findById(issueReq.getCategoryId());
        Issue issue = new Issue();

        issue.setCategory(category);
        issue.setSubject(issueReq.getSubject());
        issue.setDescription(issueReq.getDescription());
        issue.setUser(user);
        issue.setDob(LocalDate.now());
        issue.setTob(LocalTime.now());

        issueRepository.save(issue);
    }

    @Override
    public List<Issue> findAllByUser(User user) {
        return issueRepository.findAll();
    }
}
