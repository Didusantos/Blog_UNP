package com.example.demo.domainmodel;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

public class Post {
    private @Getter @Setter long id;
    private @Getter @Setter String title;
    private @Getter @Setter String content;
    private @Getter @Setter User users;
    private @Getter @Setter Set<Tag> tags;


}
