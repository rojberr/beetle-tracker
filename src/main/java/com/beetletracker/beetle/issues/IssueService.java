package com.beetletracker.beetle.issues;

import com.beetletracker.beetle.user.User;
import org.springframework.security.core.Authentication;

import java.util.List;

public interface IssueService {
    void save(IssueRequestDto issue, Authentication auth);
    List<Issue> findAllByUser(User user);
}
