package com.beetletracker.beetle.issues;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IssueCategoryServiceImpl implements IssueCategoryService {
    private final IssueCategoryRepository issueCategoryRepository;

    @Override
    public List<IssueCategory> findAll() {
        return issueCategoryRepository.findAll();
    }
}
