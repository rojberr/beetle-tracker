package com.beetletracker.beetle.issues;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
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
    private String name;
    private LocalDate dob;
    private String Topic;
    private String email;
    private String subject;
    private String description;

//    public Issue(String name,
//                 LocalDate dob,
//                 String topic,
//                 String email,
//                 String subject,
//                 String description) {
//        this.name = name;
//        this.dob = dob;
//        Topic = topic;
//        this.email = email;
//        this.subject = subject;
//        this.description = description;
//    }
//
//    public Issue(Long id,
//                 String name,
//                 LocalDate dob,
//                 String topic,
//                 String email,
//                 String subject,
//                 String description) {
//        this.id = id;
//        this.name = name;
//        this.dob = dob;
//        Topic = topic;
//        this.email = email;
//        this.subject = subject;
//        this.description = description;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public LocalDate getDob() {
//        return dob;
//    }
//
//    public void setDob(LocalDate dob) {
//        this.dob = dob;
//    }
//
//    public String getTopic() {
//        return Topic;
//    }
//
//    public void setTopic(String topic) {
//        Topic = topic;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Override
//    public String toString() {
//        return "Issue{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", dob=" + dob +
//                ", Topic='" + Topic + '\'' +
//                ", email='" + email + '\'' +
//                ", subject='" + subject + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }
}
