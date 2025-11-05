package com.example.demo.domainmodel;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Profile {
    @Id
    private @Getter @Setter UUID id;
    private @Getter @Setter String bio;
    private @Getter @Setter String pictureUrl;

    @OneToOne
    private @Getter @Setter User user;
}
