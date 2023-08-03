package com.example.db_jpa_template.api.request;

import com.example.db_jpa_template.domain.template.Template;

public record RegisterTemplateRequestDTO(String title, String content) {
    public Template toEntity(){
        return Template.createTemplate(title, content);
    }
}
