package com.codegym.model;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "province")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Province() {
    }

    public Province(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Province(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
