package com.example.demo.domainmodel;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "TBL_USERS", indexes = {@Index(name = "IDX_EMAIL_PASSWORD", columnList = "name, password"),
@Index(name = "IDX_EMAIL", columnList = "email"), @Index(name = "IDX_PASSWORD", columnList = "password")})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID", nullable = false)
    private @Getter @Setter UUID id;

    @Column(name = "NAME", nullable = false)
    private @Getter @Setter String name;

    @Column(name = "EMAIL", nullable = false, length = 60)
    private @Getter @Setter String email;

    @Column(name = "PASSWORD", nullable = false, length = 20)
    private @Getter @Setter String password;

    @ManyToMany
    private @Getter @Setter List<Role> roles;

    @OneToOne
    private @Getter @Setter Profile profile;


}
