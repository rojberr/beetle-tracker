package com.beetletracker.beetle.issues;

import lombok.Data;

@Data
public class IssueRequestDto {
    private Long categoryId;
    private String subject;
    private String description;
}
