package com.example.demo.domainmodel;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Profile {
    @Id
    private @Getter @Setter long id;
    private @Getter @Setter String bio;
    private @Getter @Setter String pictureUrl;

    @OneToOne
    private @Getter @Setter User user;
}
