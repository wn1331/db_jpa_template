package com.example.db_jpa_template.domain.template;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TemplateRepository extends JpaRepository<Template,Long> {

}
