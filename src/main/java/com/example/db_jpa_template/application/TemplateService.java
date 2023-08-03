package com.example.db_jpa_template.application;

import com.example.db_jpa_template.api.request.RegisterTemplateRequestDTO;
import com.example.db_jpa_template.domain.template.Template;
import com.example.db_jpa_template.domain.template.TemplateRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TemplateService {

    private final TemplateRepository tr;

    public String sayHello(){
        return "Hello!";
    }

    @Transactional
    public Template registerTemplate(RegisterTemplateRequestDTO dto){
        return tr.save(dto.toEntity());
    }
}
