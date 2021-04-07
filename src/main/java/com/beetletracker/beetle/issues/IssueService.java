package com.beetletracker.beetle.issues;

import org.springframework.security.core.Authentication;

public interface IssueService {
    void save(IssueRequestDto issue, Authentication auth);
}
