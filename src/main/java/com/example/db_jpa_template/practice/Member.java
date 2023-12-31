package com.example.db_jpa_template.practice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter@NoArgsConstructor
public class Member {
    @Id
    private Long id;

    private String name;
    private String city;
    private String street;
    private String zipcode;

//    private List<Order> orders = new ArrayList<Order>();
}
