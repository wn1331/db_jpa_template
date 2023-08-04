package com.example.db_jpa_template.practice;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MEMBER")
@Data
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

//    @Column(name = "TEAM_ID")
//    private Long teamId;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "TEAM_ID")
    private Team team;

}