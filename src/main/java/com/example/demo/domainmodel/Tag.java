package com.example.demo.domainmodel;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tag {

    private @Getter @Setter String id;
    private @Getter @Setter String name;


}
