package com.example.db_jpa_template.domain.template;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Template {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;
    String content;

    public Template(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static Template createTemplate(String title, String content){
        return new Template(title, content);
    }
}
