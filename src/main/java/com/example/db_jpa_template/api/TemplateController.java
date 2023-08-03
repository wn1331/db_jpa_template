package com.example.db_jpa_template.api;

import com.example.db_jpa_template.api.request.RegisterTemplateRequestDTO;
import com.example.db_jpa_template.application.TemplateService;
import com.example.db_jpa_template.domain.template.Template;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class TemplateController {

    private final TemplateService ts;

    @GetMapping("/template")
    public String getTemplate(){
        System.out.println("controller starting...@!");
        return ts.sayHello();
    }

    @PostMapping("/template")
    public ResponseEntity<Template> registerTemplate(@RequestBody RegisterTemplateRequestDTO dto){
        return ResponseEntity.ok(ts.registerTemplate(dto));
    }
}
