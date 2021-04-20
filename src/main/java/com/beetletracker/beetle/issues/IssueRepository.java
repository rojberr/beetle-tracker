package com.beetletracker.beetle.issues;

import com.beetletracker.beetle.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueRepository
        extends JpaRepository<Issue, Long> {
    List<Issue> findAllByUser(User user);

}
