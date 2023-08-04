package com.example.db_jpa_template.practice.ex;

import com.example.db_jpa_template.practice.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepo extends JpaRepository<Team,Long> {

}
