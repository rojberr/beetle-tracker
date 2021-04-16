package com.beetletracker.beetle.issues;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class IssuesConfig {

//    CommandLineRunner commandLineRunner(IssuesRepository repository) {
//        return args -> {
//            Issue issue1 = new Issue(
//                    "name",
//                    LocalDate.of(2000, JANUARY, 5),
//                    "topic",
//                    "email",
//                    "subject",
//                    "description"
//            );
//
//            Issue issue2 = new Issue(
//                    "name",
//                    LocalDate.of(2000, JANUARY, 5),
//                    "topic",
//                    "email",
//                    "subject",
//                    "description"
//            );
//
//            repository.saveAll(
//                    List.of(issue1, issue2)
//            );
//        };
//    }
}
