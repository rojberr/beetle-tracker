package com.beetletracker.beetle.issues;
import com.beetletracker.beetle.user.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


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
    private LocalTime tob;
    private String subject;
    @ManyToOne
    private IssueCategory category;
    @ManyToOne
    private User user;
    private String description;
}
