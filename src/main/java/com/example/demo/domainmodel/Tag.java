package com.example.demo.domainmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private @Getter @Setter String id;

    private @Getter @Setter String name;


}
