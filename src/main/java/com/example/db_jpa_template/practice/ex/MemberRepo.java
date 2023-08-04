package com.example.db_jpa_template.practice.ex;

import com.example.db_jpa_template.practice.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepo extends JpaRepository<Member,Long> {
    Optional<Member> findById(Long l);
}
