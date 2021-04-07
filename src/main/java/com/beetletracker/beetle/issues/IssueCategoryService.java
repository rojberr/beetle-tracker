package com.beetletracker.beetle.issues;

import java.util.List;

public interface IssueCategoryService {
    List<IssueCategory> findAll();
    IssueCategory findById(Long id);
}
