package com.workforceafrica.football.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Player {
    private @Id Long id;
    private String firstName;
    private String lastName;
    private int age;
    private boolean isInjured;

    @ManyToOne()
    @JoinColumn(name = "team_id")
    private Team team;

    public Player(String firstName, String lastName, int age, boolean isInjured) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isInjured = isInjured;
    }
}
