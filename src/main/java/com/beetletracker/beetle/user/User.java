package com.beetletracker.beetle.user;

import com.beetletracker.beetle.role.Role;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name="AppUser")
public class User {
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
    private String firstName;
    private String lastName;
    private LocalDate creationDate;
    private String password;
    private String email;
    private boolean enabled;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role")
    private Set<Role> roles;
}
