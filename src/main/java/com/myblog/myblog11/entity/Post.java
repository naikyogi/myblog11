package com.myblog.myblog11.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "posts")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String content;

}

