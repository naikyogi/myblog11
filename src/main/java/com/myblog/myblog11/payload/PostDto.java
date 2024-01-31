package com.myblog.myblog11.payload;

import jdk.jfr.Description;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    private long id;
    private String title;
    private String description;
    private String content;

}
