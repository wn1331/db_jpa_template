package com.example.db_jpa_template.practice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter@Setter@NoArgsConstructor
public class Item {

    @Id
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;
}
