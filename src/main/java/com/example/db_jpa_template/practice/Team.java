package com.example.db_jpa_template.practice;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "TEAM_ID")
    private Long id;
    private String name;

    /**
     * mappedBy -> 아주 중요함
     * @1. 양방향 관계로 주어지지만 이는 사실 서로 다른 단방향 관계 2개이다.
     * @2. 객체를 양방향으로 참조하려면 단방향 연관관계를 2개 만들어야 한다.
     * @.
     * @양방향 매핑 규칙
     * @1. 객체의 두 관계 중 하나를 연관관계의 주인으로 지정
     * @2. 연관관계의 주인만이 외래 키를 관리한다(등록, 수정)
     * @3. 주인이 아닌 쪽은 읽기만 가능하다.
     * @4. 주인은 mappedBy 속성을 사용하지 않아야 한다.
     * @5. 주인이 아니면 mappedBy 속성으로 주인을 지정해야 한다..
     * @6. 아래 코드는 Member 테이블의 team 속성이 연관관계의 주인이다.
     */

    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        member.setTeam(this);
        members.add(member);
    }
}
