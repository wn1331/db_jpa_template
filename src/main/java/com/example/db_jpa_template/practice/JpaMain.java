package com.example.db_jpa_template.practice;

import com.example.db_jpa_template.practice.ex.MemberRepo;
import com.example.db_jpa_template.practice.ex.TeamRepo;
import com.example.db_jpa_template.practice.ex.exception.MemberErrorCode;
import com.example.db_jpa_template.practice.ex.exception.MemberException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class JpaMain {

    private final MemberRepo mr;
    private final TeamRepo tr;

    @GetMapping("/test")
    public void test() {
        Team team = new Team();
        team.setName("TeamA");
        tr.save(team);

        Member member = new Member();
        member.setUsername("member1");
        mr.save(member);

        team.addMember(member);

        Member findMember = mr.findById(member.getId())
                .orElseThrow(() -> new MemberException(MemberErrorCode.NOT_FOUND));
        Team findTeam = findMember.getTeam();
        List<Member> members = findTeam.getMembers();
        System.out.println("================================================================");
        for (Member m :members){
            System.out.println("m = " + m.getUsername());
        }
            System.out.println("================================================================");


    }

    @GetMapping("/testem")
    public Member testem() {


        return new Member();
    }
}
