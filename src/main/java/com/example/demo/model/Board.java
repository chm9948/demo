package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Board {

    @Id
    private long id;

    private String title;
    private String cointent;
}
