package com.beetletracker.beetle.issues;
import com.beetletracker.beetle.user.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Data
@Table
public class Issue {
    @Id
    @SequenceGenerator(
            name = "issues_sequence",
            sequenceName = "issues_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "issues_sequence"
    )
    private Long id;
    private LocalDate dob;
    private String subject;
    @ManyToOne
    private IssueCategory category;
    @ManyToOne
    private User user;
    private String description;
}
